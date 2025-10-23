public class Store {
    private int product = 0;
    public synchronized void get(){
        while (product < 1){
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе осталось " + product);
        notify();
    }
    public synchronized void put(){
        while (product >= 3) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        product++;
        System.out.println("Продавец продал 1 товар");
        System.out.println("Товаров на складе осталось " + product);
        notify();
    }
}
