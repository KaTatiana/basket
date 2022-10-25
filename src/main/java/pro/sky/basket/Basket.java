package pro.sky.basket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;

@Component
@SessionScope
public class Basket {
    private final Collection<Item> itemsList;
    public Basket(){
        itemsList = new ArrayList<>();
    }

    public void addItem(Collection<Item> itemsList) {

         this.itemsList.addAll(itemsList);
    }

    public Collection<Item> getItems() {
        return new ArrayList<> (itemsList);
    }
}
