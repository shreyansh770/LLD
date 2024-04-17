public class Main {
    
    public static void main(String[] args) {
        
        TrafficLight tlN = new TrafficLight(1);
        TrafficLight tlS = new TrafficLight(2);

        TrafficController tcN = new TrafficController(11);
        TrafficController tcS = new TrafficController(12);

        tcN.addSignal(tlN);
        tcN.addSignal(tlS);

        Signal s = new Signal(1);
        s.add(tcS);
        s.add(tcN);

        ControlPanel cpN = new ControlPanel(tcN);

        cpN.overrideSignal(1, State.RED);

        tlN.print();
        cpN.overrideSignal(1, State.GREEN);

        tlN.print();


    }
}
