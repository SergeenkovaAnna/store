package controllerStore;

import data.DataCart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import serviceStore.ServiceStore;

import java.util.Collection;

@RestController
@RequestMapping("/store/order")
public class ControllerStore {

    private final ServiceStore serviceStore;

    public ControllerStore(ServiceStore serviceStore) {
        this.serviceStore = serviceStore;
    }

    @GetMapping("/add")
    public String add(@RequestParam String itemId) {
        DataCart result = serviceStore.addItem(itemId);
        return message(result, "успешно добавлен");
    }

    @GetMapping("/get")
    public Collection<DataCart> getAll() {
        return serviceStore.getAllItemsInCart();
    }

    private String message(DataCart dataCart, String status) {
        return String.format("Товар %s.", DataCart.getItemId(), status);
    }

}
