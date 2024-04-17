import java.util.*;

public class Signal {

    int S_ID;
    List<TrafficController> list;

    Signal(int S_ID) {

        this.S_ID = S_ID;
        this.list = new ArrayList<>();
    }

    public void add(TrafficController c) {
        list.add(c);
    }

}
