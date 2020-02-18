package pro.aquaone.repository.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pro.aquaone.model.Category;

@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
