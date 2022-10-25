package pro.sky.basket;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class BasketService {
    private final Basket basket;
    private Map<Integer, Item> items;

    public BasketService(Basket basket){
        this.basket = basket;
    }

    @PostConstruct
    public void init(){
        items=Map.of(
          1,new Item(1,"Смартфон"),
          2,new Item(2,"Планшет")
        );
    }

    public void addItem(Collection<Integer> itemIds){
        basket.addItem(
                itemIds.stream()
                        .map(items::get)
                        .collect(Collectors.toList())
        );
    }
    public Collection<Item> getItems(){
        return basket.getItems();
    }
}
