package pro.aquaone.service.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import pro.aquaone.model.Cart;
import pro.aquaone.model.User;
import pro.aquaone.repository.cart.CartRepository;
import pro.aquaone.repository.cart.CrudCartRepository;
import pro.aquaone.repository.user.CrudUserRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static pro.aquaone.util.DateTimeUtil.adjustEndDateTime;
import static pro.aquaone.util.DateTimeUtil.adjustStartDateTime;
import static pro.aquaone.util.ValidationUtil.checkNotFoundWithId;

@Service
public class CartService {

    private final CartRepository repository;

    @Autowired
    public CartService(CartRepository repository){
        this.repository = repository;
    }

    public Cart get(int id){
        return checkNotFoundWithId(repository.get(id), id);
    }

    public Cart get(int id, int userId){
        return checkNotFoundWithId(repository.get(id, userId), id);
    }

    @Transactional
    public Cart create(Cart cart, int userId){
        Assert.notNull(cart, "cart must be not null");
        return repository.save(cart, userId);
    }

    public void update(Cart cart, int userId){
        Assert.notNull(cart, "product must not be null");
        checkNotFoundWithId(repository.save(cart, userId), cart.getId());
    }

    public void delete(int id, int userId){
        checkNotFoundWithId(repository.delete(id, userId), id);
    }

    public List<Cart> getBetweenDatesWithUserId(@Nullable LocalDate startDate, @Nullable LocalDate endDate, int userId) {
        return getCartsBetweenDatesByUserId(adjustStartDateTime(startDate), adjustEndDateTime(endDate), userId);
    }// Пока не ясно на сколько этот метод актуален, возможно его придется удалить

    public List<Cart> getCartsBetweenDatesByUserId(LocalDateTime startDate, LocalDateTime endDate, int userId){
        return repository.getCartsBetweenDatesByUserId(startDate, endDate, userId);
    }

    public List<Cart> getBetweenDates(@Nullable LocalDate startDate, @Nullable LocalDate endDate){
      return getCartsBetweenDates(adjustStartDateTime(startDate), adjustEndDateTime(endDate));
    }// Пока не ясно на сколько этот метод актуален, возможно его придется удалить

    public List<Cart> getCartsBetweenDates(LocalDateTime startDate, LocalDateTime endDate){
        return repository.getAllBetweenDates(startDate, endDate);
    }

    public List<Cart> getAllByUserId(int userId){
        return repository.getAllByUserId(userId);
    }

    public List<Cart> getAll(){
        return repository.getAll();
    }
}
