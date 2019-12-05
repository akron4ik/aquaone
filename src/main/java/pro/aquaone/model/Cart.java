package pro.aquaone.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;
import pro.aquaone.HasId;
import pro.aquaone.View;
import pro.aquaone.util.DateTimeUtil;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart")
public class Cart extends AbstractBaseEntity implements HasId {

    public static final String ALL_SORTED = "Cart.getAll";
    public static final String DELETE = "Cart.delete";
    public static final String GET_BETWEEN = "Cart.getBetween";

    @Column(name = "date", nullable = false)
    @NotNull
    @DateTimeFormat(pattern = DateTimeUtil.DATE_TIME_PATTERN)
    private LocalDateTime date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull(groups = View.Persist.class)
    private User user;

    @NotNull
    @Column(name = "price", nullable = false)
    @Range(min = 10, max = 100000)
    private Integer price;

    public Cart(){

    }

    public Cart(Cart c){
        this(c.getId(), c.getDate(), c.getUser(), c.getPrice());
    }

    public Cart(Integer id, LocalDateTime date, User user, int price){
        super(id);
        this.date = date;
        this.user = user;
        this.price = price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "date=" + date +
                ", user=" + user +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
