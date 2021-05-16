
package Burger;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("whatw is type of burger you need?  if Normal inter 1, if healthy enter 2,  if delux enter 3");
         int type = sc.nextInt();
         if(type == 1){
             System.out.println("okay ..you have chosen Normal Burger");
             System.out.println("enter the name of sandwitch");
             String name = sc.next();
             System.out.println("enter the type of meat (beef or chiken )"); 
             String meat = sc.next();
             System.out.println("enter the type of roll bread (white or brown )");
             String bread = sc.next();
             System.out.println("Enter the price");
             double price = sc.nextInt();
             nBurger n = new nBurger(name, meat, bread, price);
             System.out.println("there ara four addition 'extra tomato', 'extra chese' , 'chips' , 'drink'");
             System.out.println("please enter true or false for each addition recpectively");
             boolean tomato = sc.nextBoolean();
             boolean chese = sc.nextBoolean();
             boolean chips = sc.nextBoolean();
             boolean drink = sc.nextBoolean();
             System.out.println("===============================");
             System.out.println("******here is your recipt******");
             n.extraOrder(tomato, chese, chips, drink);

         }else if(type == 2){
             System.out.println("okay..you have chosen Healthy Burger");
             System.out.println("enter the name of sandwitch");
             String name = sc.next();
             
             System.out.println("enter the type of meat (beef or chiken )"); 
             String meat = sc.next();
             
             System.out.println("Enter the price");
             double price = sc.nextInt();
             healthyBurger h = new healthyBurger(name, meat, price);
             System.out.println("there ara only two addition 'extra tomato' and 'extra chese' ");
             System.out.println("please enter true or false for each addition recpectively");
             boolean tomato = sc.nextBoolean();
             boolean chese = sc.nextBoolean();
             
             System.out.println("===============================");
             System.out.println("******here is your recipt******");
             h.extraOrder(tomato, chese);

         }else if(type == 3){
             System.out.println("Okay..you have chosen Delux Burger");
             System.out.println("enter the name of sandwitch");
             String name = sc.next();
             
             deluxeBurger d = new deluxeBurger(name);
             System.out.println("this sandwitc has  two constant addition  'chips' and 'drink'");
             
             
             System.out.println("===============================");
             System.out.println("******here is your recipt******");
             d.extraOrder( true, true);

         }else{
             System.out.println("wrong number... please, try to order again");
         }
         System.out.println("*******Thank you for visiting our resturant*******");
       
    }
    
}
