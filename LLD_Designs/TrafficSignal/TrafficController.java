
import java.util.*;
public class TrafficController {

    int C_ID;
    Map<Integer, TrafficLight> lightMap;

    TrafficController(int C_ID){
        this.lightMap = new HashMap<>();
        this.C_ID = C_ID;
    }

    public void addSignal(TrafficLight light){
        lightMap.put(light.getID(), light);
    }

    public void overrideSignal(int ID,State light){
        
        if(lightMap.containsKey(ID)){
            lightMap.get(ID).changeState(light);
        }
    }
}
