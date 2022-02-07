package com.example.store.serviceStore;

import java.util.List;

public interface ServiceStore {

    List<String> addItem(List<String> itemId);

    List<String> getAllItemsInCart();
}
