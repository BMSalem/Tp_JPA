
<h3>Compte Rendu TP2 </h3>
<p>
On considère le schéma suivant<br>
<center><img src="assets/0.png"></center>

1. Création de l'entité JPA Produit
<center><img src="assets/JPA_Entity.PNG"></center>

2. Configurer l'unité de persistance dans le ficher application.properties
<center><img src="assets/Unit_Persist_H2.PNG"></center>

3. Création de l'interface JPA Repository basée sur Spring data
<center><img src="assets/JPA_InterfacePNG.PNG"></center>

4. l'Ajout des produits :
<center><img src="assets/AjoutProd_Code.PNG"></center>
h2-console:
<center><img src="assets/H2_DB.PNG"></center>

5. Consulter tous les produits
<center><img src="assets/Cons_AllProd_code.PNG"></center>
Resultat d'execution:
<center><img src="assets/Cons_AllProd.PNG"></center>

6. Consulter un produit by Id
<center><img src="assets/ConsProd_ID_Code.PNG"></center>
Resultat d'execution:
<center><img src="assets/ConsProd_ID.PNG"></center>

7. Chercher des produits par nom :
<center><img src="assets/JPA_InterfacePNG.PNG"></center>
<center><img src="assets/SearchProd_Nom_Code.PNG"></center>
Resultat d'execution:
<center><img src="assets/SearchProd_Nom.PNG"></center>
7. Chercher des produits par prix :
<center><img src="assets/SearchProd_Price_Code.PNG"></center>
Resultat d'execution:
<center><img src="assets/SearchProd_Price.PNG"></center>

8. Mettre à jour un produit dont l'ID=3
<center><img src="assets/Prod_Upd_code.PNG"></center>
Resultat d'execution:
<center><img src="assets/Product_Upd.PNG"></center>

9. supprimer un produit
<center><img src="assets/Delete_Prod_Code.PNG"></center>
Resultat d'execution:
<center><img src="assets/Delete_Prod.PNG"></center>


10. Migrer de H2 Database vers MySQL
    pom.xml
<center><img src="assets/H2_to_MYSQL.PNG"></center>
application.properties
<center><img src="assets/Migration_MYSQL.PNG"></center>
<center><img src="assets/20.png"></center>
<center><img src="assets/MySqlDB.PNG"></center>

