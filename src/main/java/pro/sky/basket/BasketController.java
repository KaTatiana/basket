package pro.sky.basket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }
    @GetMapping("/add")
    public void storeAdd(@RequestParam("id")List<Integer> itemId){
        basketService.addItem(itemId);
    }
    @GetMapping("/get")
    public Collection<Item> storeGet(){
        return basketService.getItems();
    }
}
