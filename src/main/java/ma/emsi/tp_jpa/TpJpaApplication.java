package ma.emsi.tp_jpa;

import ma.emsi.tp_jpa.entities.Product;
import ma.emsi.tp_jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class TpJpaApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(TpJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 6 - Ajouter des produits
        /*productRepository.save(new Product(null,"Computer",4300.00,3));
        productRepository.save(new Product(null,"Printer",1200.00,4));
        productRepository.save(new Product(null,"SmartPhone",3200.00,32));
        productRepository.save(new Product(null,"Climat",8000.00,8));*/

        // 6 - Consulter tous les produits
        System.out.println("*********Consulter all Products********");
        List<Product> products = productRepository.findAll();
            products.forEach(p->{
                System.out.println(p.toString());
            });

            // 6 - Consulter un produit par ID
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("*********Consulter par ID********");
        System.out.println("ID: "+product.getId());
        System.out.println("Nom: "+product.getNom());
        System.out.println("Quantité: "+product.getQuantity());
        System.out.println("************FIN*******");

            // 6 - Chercher un produit par nom
        //Methode 1 (nom):
        System.out.println("*********Chercher par nom********");
        List<Product> productList = productRepository.search("%C%");
        productList.forEach(p->{
            System.out.println(p);
        });

        /* Méthode 2 (nom):
        List<Product> productList = productRepository.findByNameContains("C");
        productList.forEach(p->{
            System.out.println(p);
        });
         */

        //Methode 1 (price):
        System.out.println("*********Consulter par Prix********");
        List<Product> productList2 = productRepository.searchByPrice(3000.0);
        productList2.forEach(p->{
            System.out.println(p);
        });

        /* Méthode 2 (price):
        List<Product> productList2 = productRepository.findByPriceGreaterThan(3000);
        productList.forEach(p->{
            System.out.println(p);
        });
         */

        // 6 - Mettre a jour un produit
        /*System.out.println("*********Update Produit********");
        product = productRepository.findById(Long.valueOf(3)).get();
        System.out.println("Prix Avant: "+product.getPrice());
        product.setPrice(10000.0);
        productRepository.save(product);
        System.out.println("Prix Après: "+product.getPrice());

        // 6 - Supprimer un produit
        System.out.println("*********Delete un Produit********");
        product = productRepository.findById(Long.valueOf(4)).get();
        productRepository.delete(product);
        products = productRepository.findAll();
        products.forEach(p-> {
            System.out.println(p);
        });/
         */



    }
}
