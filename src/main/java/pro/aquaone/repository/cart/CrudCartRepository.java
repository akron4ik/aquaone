package pro.aquaone.repository.cart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pro.aquaone.model.Cart;
import pro.aquaone.model.User;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public interface CrudCartRepository extends JpaRepository<Cart, Integer> {

    @Modifying
    @Transactional
    int deleteCartById(int id);

    @Transactional
    Cart getCartByIdAndUserId(int id, int userId);

    @Query("SELECT c FROM Cart c WHERE c.user.id=:userId AND c.date BETWEEN :startDate AND :endDate ORDER BY c.date")
    List<Cart> getCartsBetweenDatesByUserId(@Param("startDate")LocalDateTime startDate, @Param("endDate") LocalDateTime endDate,@Param("userId") int userId);

    @Query("SELECT c FROM Cart c WHERE c.date BETWEEN :startDate AND :endDate ORDER BY c.date")
    List<Cart> getCartsBetweenDates(@Param("startDate") LocalDateTime startDate, @Param("endDate") LocalDateTime endDate);

    @Query("SELECT c FROM Cart c WHERE c.user.id=:userId ORDER BY c.date DESC")
    List<Cart> getAllByUserId(@Param("userId")int userId);

    @Query("SELECT c FROM Cart c ORDER BY c.date DESC")
    List<Cart> getAll();


}
