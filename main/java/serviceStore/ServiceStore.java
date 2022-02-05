package serviceStore;

import data.DataCart;

import java.util.List;

public interface ServiceStore {

    DataCart addItem(List<DataCart> itemId);

    List<String> getAllItemsInCart();
}
