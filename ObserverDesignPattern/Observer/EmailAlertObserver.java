package Observer;
import Observable.StockObservable;

public class EmailAlertObserver implements NotificationObserver{

    String email;
    StockObservable obsObj; // which item to observer want to observe

    public EmailAlertObserver(String email  , StockObservable obsObj){
        this.email =email;
        this.obsObj = obsObj;
    }

    @Override
    public void update() {
        sendEmail(email);
    }

    private void sendEmail(String user){
        System.out.println("Mail send to "+user);
    }
    
}
