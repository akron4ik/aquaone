package pro.aquaone.service.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import pro.aquaone.model.Cart;
import pro.aquaone.repository.cart.CartRepository;

import java.util.List;
import static pro.aquaone.util.ValidationUtil.checkNotFoundWithId;

@Service
public class CartService {

    private final CartRepository repository;

    @Autowired
    public CartService(CartRepository repository){
        this.repository = repository;
    }

    public Cart get(int id){
        return checkNotFoundWithId(repository.findById(id).orElse(null), id);
    }

    @Transactional
    public Cart create(Cart cart){
        Assert.notNull(cart, "cart must be not null");
        return repository.save(cart);
    }

    public void delete(int id){
        repository.deleteById(id);
    }

    public List<Cart> getAll(){
        return repository.getAll();
    }
}
