import Adapter.WeightMachineAdapter;

public class Main {
    
    public static void main(String[] args){
        WeightMachineAdapter wt = new WeightInKg(new WeightMachineBabies()); // telling adapter for which Adaptee it has to act as an Adapter
        System.out.println(wt.getWeightInKg());
    }
}
