package oop_project;


public class Food {
    String fruit_name;
    double fruit_price;
    
    Food(String fruit_name,double fruit_price){
        this.fruit_name = fruit_name;
        this.fruit_price = fruit_price;
    }
    void showFruitName(){
        System.out.println("fruit_name");
    }
    void showFruitPrice(){
        System.out.println("fruit_price");
        
    }
    
}