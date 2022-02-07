package com.example.store.controllerStore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.store.serviceStore.ServiceStore;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ControllerStore {

    private final ServiceStore serviceStore;

    public ControllerStore(ServiceStore serviceStore) {
        this.serviceStore = serviceStore;
    }

    @GetMapping("/add")
    public String add(@RequestParam List<String> items){
        List<String> result = serviceStore.addItem(items);
        return message(result, "успешно добавлен");
    }

    @GetMapping("/get")
    public List<String> getAll() {
        return serviceStore.getAllItemsInCart();
    }

    private String message(List<String> result, String status) {
        return String.format("Товар %s.", result, status);
    }
}
