public class Main {

    public static void main(String[] args) {
        LogProcessor lp = new InfoLogProcessor(new ErrorLogProcessor(new DebugLogProcessor(null)));

        lp.log(lp.ERROR,"Error occured");
        lp.log(lp.INFO,"Info occured");
        lp.log(lp.DEBUG,"Debug occured");
    }
    
}
