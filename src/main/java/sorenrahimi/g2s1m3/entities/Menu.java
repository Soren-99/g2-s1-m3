package sorenrahimi.g2s1m3.entities;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Menu{
    private List<Pizza> pizzaList;
    private List<Beverage> beverageList;
    private List<Topping> toppingList;

    public Menu(List<Pizza> pizzaList, List<Beverage> beverageList, List<Topping> toppingList) {
        this.pizzaList = pizzaList;
        this.beverageList = beverageList;
        this.toppingList = toppingList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Beverage> getBeverageList() {
        return beverageList;
    }

    public void setBeverageList(List<Beverage> beverageList) {
        this.beverageList = beverageList;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzaList=" + pizzaList +
                ", beverageList=" + beverageList +
                ", toppingList=" + toppingList +
                '}';
    }

    public void printMenu() {
        System.out.println("- MENU -");
        System.out.println("PIZZE");
        this.pizzaList.forEach(System.out::println);
        System.out.println();
        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();
        System.out.println("BEVERAGES");
        this.beverageList.forEach(System.out::println);
        System.out.println();
    }
}
