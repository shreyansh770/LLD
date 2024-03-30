
// this decorator relation is 'has-a' and 'is-a'
// becuase when pizza get decorator it with Mushroom
// then it will also be a Pizza(is-a) and also has-a pizza
public class Mushroom extends Toppings{

    BasePizza basePizza; 
    

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 5;
    }
    
}
