public class Main {
    
    public static void main(String[] args) {
        BasePizza obj = new Farmhouse();
        System.out.println(obj.cost());

        // decorators
        BasePizza mush = new Mushroom(obj);
        System.out.println(mush.cost());

        // now since mush is-a pizza we can also add more decorator to it
        Toppings cheeze = new Cheeze(mush);
        System.out.println(cheeze.cost());
        

        
    }
}
