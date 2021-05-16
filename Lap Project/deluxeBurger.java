
package Burger;

public class deluxeBurger extends nBurger{

    public deluxeBurger(String name) {
        super(name, "beef", "white", 45);
    }
    public double extraOrder(boolean chips , boolean drink){
        System.out.println("Delux Burger");
        System.out.println("one "+getName()+" sandwitch : "+price+" LE");
        if(chips || drink){
    if (chips){
         price += 5.50;
         System.out.println("Chips :5.00 LE");
         }
         if (drink){
         price += 10.00;
         System.out.println("Drink :10.00 LE");
         }
        }else{
            System.out.println("no addtions");
        }
         System.out.println("Total price : " +price +" LE");
         return price;
    }
    
    
}
