import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.NotificationObserver;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;

public class Main {

    public static void main(String[] args) {

        StockObservable iphoneObservable = new IphoneObservable();
        
        NotificationObserver observer1 = new MobileAlertObserver("1111",iphoneObservable);
        NotificationObserver observer2 = new MobileAlertObserver("123",iphoneObservable);
        NotificationObserver observer3 = new EmailAlertObserver("xyz@123",iphoneObservable);

        iphoneObservable.add(observer3);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer1);

        iphoneObservable.setStock(10);
    }
    
}
