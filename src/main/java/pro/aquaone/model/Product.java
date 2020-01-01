package pro.aquaone.model;

import pro.aquaone.HasId;
import javax.persistence.*;
import javax.validation.constraints.NotNull;



@Entity
@Table(name = "products")
public class Product extends AbstractBaseEntity implements HasId {


    @Column(name = "name", nullable = false)
    @NotNull
    private String name;

    @Column(name = "description", nullable = false)
    @NotNull
    private String description;

    @Column(name = "price", nullable = false)
    @NotNull
    private Integer price;


    public Product(){
    }

    public Product(Product p){
        this(p.getId(), p.getName(), p.getDescription(), p.getPrice());
    }

    public Product(Integer id, String name, String description, Integer price){
        super(id);
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
