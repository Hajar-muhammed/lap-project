
package Burger;

public class healthyBurger extends nBurger {

    public healthyBurger(String name, String TypeOfMeat,  double price) {
        super(name, TypeOfMeat, "brown", price);
    }
    public double extraOrder(boolean tomato , boolean chese){
        System.out.println("Healthy Burger");
        System.out.println(" one "+getName()+" sandwitch : "+price+" LE");
        if(tomato || chese){
    if(tomato){
         price+=3.00;
             System.out.println("Extra Tomat :3.00 LE");
         }
         if (chese){
         price += 7.00;
         System.out.println("Extra Chese :7.00 LE");

         }
        }else{
            System.out.println("no addtions");
        }
         System.out.println("Total price : " +price+" LE");
         return price;
    }
    
}
