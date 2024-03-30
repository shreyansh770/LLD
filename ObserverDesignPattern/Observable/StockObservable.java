package Observable;
import Observer.NotificationObserver;

public interface StockObservable {

    public void add(NotificationObserver obsr);

    public void remove(NotificationObserver obsr);

    public void notifaction();

    public void setStock(int count);

    public int getStock();

}