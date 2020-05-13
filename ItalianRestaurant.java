


public class ItalianRestaurant extends RestaurantAbstractFactory{
    public FastFood getFastFood(String type){
       switch(type){
           case "pizza": return new Pizza();
           case "sandwich": return new Sandwich();
           default: return  null;
       }
       
   }
    public Drink getDrink(String type){
        switch(type){
            case "juice": return new Juice();
            case "soda": return new Soda();
            default: return  null;
       }
    }
}
