
package Burger;

public class nBurger {
     private String name;
     private String TypeOfMeat;
     private String TypeOfBread;
      double price;

    public nBurger(String name, String TypeOfMeat, String TypeOfBread, double price) {
        this.name = name;
        this.TypeOfMeat = TypeOfMeat;
        this.TypeOfBread = TypeOfBread;
        this.price = price;
    }
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeOfMeat() {
        return TypeOfMeat;
    }

    public void setTypeOfMeat(String TypeOfMeat) {
        this.TypeOfMeat = TypeOfMeat;
    }

    public String getTypeOfBread() {
        return TypeOfBread;
    }

    public void setTypeOfBread(String TypeOfBread) {
        this.TypeOfBread = TypeOfBread;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
     
     public double  extraOrder(boolean tomato ,boolean chese ,boolean chips ,boolean drink){
         System.out.println("Normal Burger");
         System.out.println("one "+getName()+" sandwitch : "+price+" LE");
         if(tomato || chese || chips || drink ){
         if(tomato){
          price+=3.00;
             System.out.println("Extra Tomao :3.00 LE");
         }
         if (chese){
         price += 7.00;
         System.out.println("Extra Chese :7.00 LE");

         }
         if (chips){
         price += 5.50;
         System.out.println("Chips :5.5 LE");
         }
         if (drink){
         price += 10.00;
         System.out.println("Drink :10.00 LE");
         }}else{
             System.out.println("no addtions LE");
         }
         System.out.println("Total price : " +price+" LE");
         return price;
     }
}
