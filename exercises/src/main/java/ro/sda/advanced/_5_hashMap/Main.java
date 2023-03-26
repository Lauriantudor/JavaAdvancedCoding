package ro.sda.advanced._5_hashMap;

public class Main {
    final static StockManager manager = new StockManager();

    public static void main(String[] args) {

        manager.addStock(new StockItem("bread", 2.5, 200));
        manager.addStock(new StockItem("salad", 5, 500));
        manager.addStock(new StockItem("phone", 5000, 50));

        manager.addStock(new StockItem("bread", 2.5, 1000));

        int breadReserved = manager.reserveStock("bread", 100);

        System.out.println("Reserved bread: " + breadReserved);

        int breadSold = manager.sellStock("bread", 100);

        System.out.println("Sold bread: " + breadSold);


        try{
            manager.sellStock("phone", 500);
        } catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }


    }
}
