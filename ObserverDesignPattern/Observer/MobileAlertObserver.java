package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationObserver{

    String mobile;
    StockObservable obsObj;

    public MobileAlertObserver(String mobile  , StockObservable obsObj){
        this.mobile =mobile;
        this.obsObj = obsObj;
    }

    @Override
    public void update() {
        sendEmail(this.mobile);
    }

    private void sendEmail(String user){
        System.out.println("Msg send to "+user);
    }
    
}
