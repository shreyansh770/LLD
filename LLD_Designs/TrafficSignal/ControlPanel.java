public class ControlPanel {

    TrafficController controller;

    ControlPanel(TrafficController controller) {
        this.controller = controller;
    }

    // manual override
    public void overrideSignal(int light_ID, State light) {
         
        this.controller.overrideSignal(light_ID , light);
    }
}
