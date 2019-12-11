package pro.aquaone.repository.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pro.aquaone.model.Cart;
import pro.aquaone.repository.user.CrudUserRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public class CartRepository {

    @Autowired
    CrudCartRepository repository;

    @Autowired
    CrudUserRepository userRepository;

    @Transactional
    public Cart save(Cart cart, int userId) {
        if(!cart.isNew() && get(cart.getId(), userId)==null){
            return null;
        }
        cart.setUser(userRepository.getOne(userId));
        return repository.save(cart);
    }

    public Cart get(int id, int userId) {
        return repository.findById(id).filter(cart -> cart.getUser().getId() == userId).orElse(null);
    }
    public Cart get(int id) {
        return repository.findById(id).orElse(null);
    }

    public boolean delete(int id, int userId){
        return repository.deleteCartByIdAndUserID(id, userId) != 0;
    }

    public List<Cart> getAll(){
        return repository.getAll();
    }

    public List<Cart> getAllByUserId(int id) {
        return repository.getAllByUserId(id);
    }

    public List<Cart> getAllBetweenDates(LocalDateTime startDate, LocalDateTime endDate) {
        return repository.getCartsBetweenDates(startDate, endDate);

    }

    public List<Cart> getCartsBetweenDatesByUserId(LocalDateTime startDate, LocalDateTime endDate, int userId){
        return repository.getCartsBetweenDatesByUserId(startDate, endDate, userId);
    }




}
