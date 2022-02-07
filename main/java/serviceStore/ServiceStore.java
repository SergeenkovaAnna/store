package serviceStore;

import data.DataCart;

import java.util.List;

public interface ServiceStore {

    List<String> addItem(List<String> itemId);

    List<String> getAllItemsInCart();
}
