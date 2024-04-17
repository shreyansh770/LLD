public class TrafficLight {

    int ID;
    State light;

    TrafficLight(int ID){
        this.ID = ID;
        this.light = State.RED;
    }

    public void changeState(State light){
        this.light = light;
    }

    public int getID(){
        return this.ID;
    }

    public void print(){
        System.out.println(this.light);
    }
}