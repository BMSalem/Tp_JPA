package ma.emsi.tp_jpa.repository;

import ma.emsi.tp_jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {
    // 6 - Chercher produit par nom/prix en insérant les signatures des 2 méthodes

    // Méthode 1 (nom):
    @Query("select p from Product p where p.nom like :x")

    List<Product> search(@Param("x") String mc);

    /* Méthode 2 (nom):
    List<Product> findByNameContains(String mc);
     */

    // Méthode 1 (nom):
    @Query("select p from Product p where p.price >:x")

    List<Product> searchByPrice(@Param("x") double price);

    /* Méthode 2 (nom):
    List<Product> findByPriceGreaterThan(double price);
     */

}
