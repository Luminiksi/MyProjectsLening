package main.try_2.InternetShop;

public class ProductFinal {
    private final String name;
    private final int price;

    public ProductFinal(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public ProductFinal setName(String name){
        return new ProductFinal(name, price);
    }

    public ProductFinal setPrice(int price){
        return new ProductFinal(name, price);
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public String toString(){
        return "Name: " + name + " Price: " + price;
    }

    public void print(){
        String info = name + " - " + price;
        System.out.println(info);
    }
}
