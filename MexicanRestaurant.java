

public class MexicanRestaurant extends RestaurantAbstractFactory{
    public FastFood getFastFood(String type){
       switch(type){
           case "taco": return new Taco();
           case "hamburguer": return new Hamburger();
           default: return  null;
       }
       
   }
    public Drink getDrink(String type){
        switch(type){
            case "beer": return new Beer();
            case "soda": return new Soda();
            default: return  null;
       }
    }
}