package sorenrahimi.g2s1m3.entities;


import java.util.List;

public class Pizza extends MenuItem {
    private String name;
    private List<Topping> toppingList;
    private boolean isXL = false;


    public Pizza(String name, List<Topping> toppingList, boolean isXL) {
        super(980, 4.5);
        this.name = name;
        this.toppingList = toppingList;
        this.isXL = isXL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Topping> toppingList) {
        this.toppingList = toppingList;
    }

    public boolean isXL() {
        return isXL;
    }

    public void setXL(boolean XL) {
        isXL = XL;
    }

    @Override
    public int getCalories() {
        return super.getCalories() +
                this.getToppingList().stream().mapToInt(Topping::getCalories).sum();
    }

    @Override
    public double getPrice() {
        return super.getPrice() +
                this.getToppingList().stream().mapToDouble(Topping::getPrice).sum();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", toppingList=" + toppingList +
                ", isXL=" + isXL +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
