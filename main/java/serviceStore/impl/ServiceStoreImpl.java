package serviceStore.impl;

import data.DataCart;
import org.springframework.stereotype.Service;
import serviceStore.ServiceStore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ServiceStoreImpl implements ServiceStore {
    private final List<DataCart> itemId;
//    List<DataCart> itemId = new ArrayList<>();

    public ServiceStoreImpl(List<DataCart> itemId) {
        this.itemId = itemId;
    }

//    @Override
//    public DataCart addItem(String itemId) {
//
////        DataCart dataCart = new DataCart(itemId);
//        return itemId.add(itemId);
////        DataCart newDataCart = new DataCart(itemId);
////        return addItem(newDataCart);
//    }
//
////    @Override
////    public DataCart addItem(DataCart dataCart) {
////
////        itemId.add();
////        return addItem();
////    }

    @Override
    public DataCart addItem(List<DataCart> itemId) {

        return itemId.add(itemId);
    }

    @Override
    public Collection<DataCart> getAllItemsInCart() {
        return List.copyOf(DataCart.getItems());
    }
}
