package ro.sda.advanced._5_hashMap;
public class StockItem {

    private String name;
    private double price;
    private int quantityInStock;
    private int reserved;

    public StockItem(String name, double price, int quantityInStock) {
        this.name = name;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.reserved = 0;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        if(price > 0.0){
            this.price = price;
        }
    }

    public int availableQuantity(){
        return quantityInStock - reserved;
    }

    public void adjustStock(int quantity){
        int newQuantity = this.quantityInStock + quantity;
        if(newQuantity >= 0){
            quantityInStock = newQuantity;
        }
    }

    public int reserveStock(int quantityToReserve) throws UnavailableStockException {
        if(quantityToReserve <= availableQuantity()){
            this.reserved += quantityToReserve;
            return quantityToReserve;
        }
        throw new UnavailableStockException("The quantity that you want is not available");
    }

    public int unreserveStock(int quantity) {
        if(quantity <= reserved){
            reserved -= quantity;
            return quantity;
        }
        throw new StockNotReservedException("The quantity that you want to unreserve is too big");
    }

    public int finalizeStock(int quantity){
        if(quantity <= reserved){
            quantityInStock -= quantity;
            reserved -= quantity;
            return quantity;
        }
        throw new StockNotReservedException("The stock should be reserved first");
    }
    @Override
    public String toString() {
        return this.name + " : price " + this.price + ". reserved: " + this.reserved;
    }
}