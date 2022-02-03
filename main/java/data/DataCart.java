package data;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class DataCart {

        private final List<String> itemId;

    public DataCart(String itemId) {
        this.itemId = Collections.singletonList(itemId);
    }

    public List<String> getItems() {
        return List.copyOf(getItemId());
    }

    public List<String> getItemId() {
        return itemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataCart dataCart = (DataCart) o;
        return itemId.equals(dataCart.itemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return "DataCart{" +
                "itemId=" + itemId +
                '}';
    }

}
