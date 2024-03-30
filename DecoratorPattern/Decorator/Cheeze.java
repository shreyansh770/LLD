public class Cheeze extends Toppings{

    BasePizza basePizza; 
    
    public  Cheeze(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 2;
    }
    
}
