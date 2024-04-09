

import Adapter.WeightMachineAdapter;

public class WeightInKg implements WeightMachineAdapter{

    WeightMachine wtMach; // has a
    public WeightInKg(WeightMachine wt){
         this.wtMach = wt;
    }
    @Override
    public double getWeightInKg() {


        double w = wtMach.getWeightInPound();

        return w*0.28;
        
    }
    
}
