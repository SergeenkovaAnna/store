package com.example.store.serviceStore.impl;

import com.example.store.data.DataCart;
import org.springframework.stereotype.Service;
import com.example.store.serviceStore.ServiceStore;

import java.util.List;

@Service
public class ServiceStoreImpl implements ServiceStore {
    private final DataCart dataCart;

    public ServiceStoreImpl(DataCart dataCart) {
        this.dataCart = dataCart;
    }

    @Override
    public List<String> addItem(List<String> itemId) {

        return dataCart.addItems(itemId);
    }

    @Override
    public List<String> getAllItemsInCart() {
        return dataCart.getItems();
    }
}
