package serviceStore;

import data.DataCart;

import java.util.Collection;
import java.util.List;

public interface ServiceStore {

    DataCart addItem(List<DataCart> itemId);

//    DataCart addItem(DataCart dataCart);

    Collection<DataCart> getAllItemsInCart();
}
