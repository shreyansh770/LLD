import Adapter.WeightMachineAdapter;

public class Main {
    
    public static void main(String[] args){
        WeightMachineAdapter wt = new WeightInKg(new WeightMachineBabies());
        System.out.println(wt.getWeightInKg());
    }



    
}
