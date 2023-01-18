package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private  boolean cheeseEx;
    private boolean toppingEx;
    private boolean takeAway;
    private boolean total;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
            price = 300;
        else
            price= 400;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseEx){
            cheeseEx = true;
            price +=80;
        }
    }

    public void addExtraToppings(){
        if(!toppingEx){
            toppingEx= true;
            if(isVeg)
                price += 70;
            else
                price += 120;
        }
    }

    public void addTakeaway(){
       if(!takeAway){
           takeAway= true;
           price += 20;
       }
    }

    public String getBill(){
        bill = "Base Price Of The Pizza: "+(isVeg?300:400)+"\n"+(cheeseEx?("Extra Cheese Added: "+80+"\n"):"")+(toppingEx?("Extra Toppings Added: "+(isVeg?70:120)+"\n"):"")+
                (takeAway?("Paperbag Added: "+20+"\n"):"")+"Total Price: "+price+"\n";
        return this.bill;
    }
}
