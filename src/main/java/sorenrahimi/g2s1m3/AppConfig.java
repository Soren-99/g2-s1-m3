package sorenrahimi.g2s1m3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import sorenrahimi.g2s1m3.entities.*;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class AppConfig {
    @Bean(name = "toppings_pomodoro")
    public Topping toppingPomodoroBean() {
        return new Topping("Pomodoro", 5 , 0);
    }
    @Bean(name = "toppings_mozzarella")
    public Topping toppingMozzarellaBean() {
        return new Topping("Mozzarella", 85, 0);
    }
    @Bean(name = "toppings_prosciutto")
    public Topping toppingProsciuttoBean() {
        return new Topping("Prosciutto", 45, 1.30);
    }
    @Bean(name = "toppings_ananas")
    public Topping toppingAnanasBean() {
        return new Topping("Ananas", 25, 1.30);
    }
    @Bean(name = "toppings_salame")
    public Topping toppingSalameBean() {
        return new Topping("Salame", 90, 2.00);
    }
    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean() {
            List<Topping> tList = new ArrayList<>();
            tList.add(toppingPomodoroBean());
            tList.add(toppingMozzarellaBean());
            return new Pizza("Pizza Margherita",tList, false);
    }
    @Bean(name = "pizza_hawaiana")
    public Pizza pizzaHawaianaBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingPomodoroBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingAnanasBean());
        tList.add(toppingProsciuttoBean());
        return new Pizza("Pizza Hawaiana",tList, false);
    }
    @Bean(name = "pizza_salame")
    public Pizza pizzaSalameBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingPomodoroBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingSalameBean());
        return new Pizza("Pizza Salame",tList, false);
    }

    @Bean(name = "pizza_salame_xl")
    public Pizza pizzaSalameXLBean() {
        List<Topping> tList = new ArrayList<>();
        tList.add(toppingPomodoroBean());
        tList.add(toppingMozzarellaBean());
        tList.add(toppingSalameBean());
        return new Pizza("Pizza Salame XL",tList, true);
    }

    @Bean(name = "limonata")
    public Beverage limonataBean() {
        return new Beverage("Limonata", 103, 2.50);
    }
    @Bean(name = "acqua")
    public Beverage acquaBean() {
        return new Beverage("Acqua", 5, 1.00);
    }

    @Bean(name = "birra")
    public Beverage birraBean() {
        return new Beverage("Birra", 280, 3.50);
    }

    @Bean(name = "pizzas")
    List<Pizza> pizzaList() {
        List<Pizza> pizzas = new ArrayList<>();

        pizzas.add(pizzaMargheritaBean());
        pizzas.add(pizzaHawaianaBean());
        pizzas.add(pizzaSalameBean());
        pizzas.add(pizzaSalameXLBean());
        return pizzas;
    }
    @Bean("beverages")
    List<Beverage> beverageList() {
        List<Beverage> beverages = new ArrayList<>();
        beverages.add(limonataBean());
        beverages.add(acquaBean());
        beverages.add(birraBean());
        return beverages;
    }

    @Bean("toppings")
    List<Topping> toppingList() {
        List<Topping> toppings = new ArrayList<>();


        toppings.add(toppingPomodoroBean());
        toppings.add(toppingMozzarellaBean());
        toppings.add(toppingSalameBean());
        toppings.add(toppingProsciuttoBean());
        toppings.add(toppingAnanasBean());
        return toppings;
    }

    @Bean("Tavolo1")
    Table getTable1(@Value("${seat.price}") double seatPrice){
        return new Table(1,5,true, seatPrice);
    }
    @Bean("Tavolo2")
    Table getTable2(@Value("${seat.price}") double seatPrice){
        return new Table(2,4,true, seatPrice);
    }
    @Bean("Tavolo3")
    Table getTable3(@Value("${seat.price}") double seatPrice){
        return new Table(3,8,true, seatPrice);
    }
}







