package ro.sda.advanced._5_hashMap;

import java.util.HashMap;
import java.util.Map;
public class StockManager {
    private final Map<String, StockItem> itemMap;

    public StockManager() {
        this.itemMap = new HashMap<>();
    }

    public void addStock(StockItem item){
        if (item != null){
            StockItem inStock = itemMap.get(item.getName());
            if (inStock != null){
                inStock.adjustStock(item.availableQuantity());
            }else {
                itemMap.put(item.getName(),item);
            }
        }
    }
    public int sellStock(String item, int quantity){
        if (item != null){
            StockItem inStock = itemMap.get(item);
            if (inStock != null && quantity > 0){
                int soldQuantity =  inStock.finalizeStock(quantity);
                return soldQuantity;
            }
        }
        return -1;
    }
    public int reserveStock(String item, int quantity){
        if (item != null){
            StockItem inStock = itemMap.get(item);
            if (inStock != null && quantity > 0){
                try {
                    return inStock.reserveStock(quantity);
                } catch (UnavailableStockException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                }
            }
        }
        return -1;
    }

    public int unReserveStock(String item, int quantity){
        if (item != null){
            StockItem inStock = itemMap.get(item);
            if (inStock != null && quantity > 0){
                inStock.unreserveStock(quantity);
            }
        }
        return -1;
    }
}