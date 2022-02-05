package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DataCart {

        private final List<String> items;

    public DataCart (List<String> items) {

        this.items = new ArrayList<>();
    }

    public List addItems(List itemId) {
        items.addAll(itemId);
        return itemId;
    }

    public List<String> getItems() {
        return List.copyOf(getItemId());
    }

    public List<String> getItemId() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataCart dataCart = (DataCart) o;
        return items.equals(dataCart.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        return "DataCart{" +
                "itemId=" + items +
                '}';
    }
}
