package Observable;
import java.util.*;
import Observer.NotificationObserver;

public class IphoneObservable  implements StockObservable{
 
    List<NotificationObserver> observersnotifications = new ArrayList<>(); // who all are observing the observable
    int stockCount = 0;
    @Override
    public void add(NotificationObserver obsr) {
        observersnotifications.add(obsr);
    }

    @Override
    public void remove(NotificationObserver obsr) {
            observersnotifications.remove(obsr);

    }

    @Override
    public void notifaction() {

        for(NotificationObserver observer : observersnotifications) {
             observer.update();
        }
    }

    @Override
    public void setStock(int count) {

        if(stockCount==0){
            notifaction();
        }

        stockCount = stockCount + count;
    }

    @Override
    public int getStock() {
          return stockCount;
    }
    
}
