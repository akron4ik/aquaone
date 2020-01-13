package pro.aquaone.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pro.aquaone.model.Product;

import java.util.List;

@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public interface CrudProductRepository extends JpaRepository<Product, Integer> {

    @Transactional
    int deleteProductById(int id);

    List<Product> getProductsByCategoryId(int id);

}
