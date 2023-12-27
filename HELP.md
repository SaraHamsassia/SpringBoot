# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.1/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.1/gradle-plugin/reference/html/#build-image)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#io.webservices)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.2.1/reference/htmlsingle/index.html#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)


### Base de données MySQL

* [mysql -u username -p]
* [SAVAsava&]
* [show databases;]
* [use name_databases;]
* [show tables;]
* [SHOW COLUMNS FROM nom_de_la_table;]
* [SELECT CURRENT_USER() AS 'datasource.username';] Pour obtenir le nom d'utilisateur actuellement connecté à la base de données.
* [SHOW VARIABLES LIKE 'port';] Cette commande affichera le numéro du port sur lequel le serveur MySQL écoute les connexions.


### Mise en place de l'environnement

* Création du projet. Ajout des dépendances suivantes sur https://start.spring.io/:
Spring Data JPA: Pour la persister et interroger la BD en utilisant JPA.Il permet notamment de créer des requêtes @Query en utilisant le langage JPQL.
MySQL Driver
Spring Boot DevTools -> L'une des fonctionnalités clés de Spring Boot DevTools est le redémarrage automatique du serveur intégré (comme Tomcat) lorsqu'un changement est détecté dans le code source. Cela permet de recharger rapidement les modifications sans avoir à redémarrer manuellement le serveur, ce qui accélère le processus de développement.
Spring web services
* Allez dans "File" (Fichier) > "Project Structure" et ajouter le jdk17 dans SQK.
* Pom.xml et Maven: Bien que le fichier pom.xml contienne la définition des dépendances de votre projet, pour voir les dépendances téléchargées et incluses dans IntelliJ IDEA, vous devriez les voir dans la vue "External Libraries" (Bibliothèques Externes) comme mentionné ci-dessus.

* Lombok: Lombok est une bibliothèque java permettant de simplifier le code des entités en épargnant au développeur l’écriture des méthodes getters, setters, equals,.. Lombok injecte automatiquement ces méthode dans le byte code lors de la compilation.
1) Ajouter la dépendance Lombok au fichier pom.xml puis rebuilder:
  <dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
  </dependency>
2) Activer le Plugin Lombok :
Accédez à Preferences (Préférences) > Build, Execution, Deployment (Compilation, Exécution, Déploiement) > Annotations processors.
Cochez la case "Enable annotation processing"
* Ajout de la dépendance ModelMapper: https://modelmapper.org/getting-started/
* Installer Homebrew sur votre Mac, dans le terminal executez les deux commandes suivantes:
1) [/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"]
2) [eval "$(/opt/homebrew/bin/brew shellenv)"]

### Annotation Spring

* @Entity est une annotation de JPA (Java Persistence API) qui est utilisée dans les frameworks ORM (Object-Relational Mapping) tels que Hibernate pour indiquer qu'une classe représente une entité persistante qui doit être mappée à une table dans une base de données. Hibernate est un framework ORM populaire qui implémente JPA et facilite la persistance des objets dans une base de données relationnelle.
* @Autowired est utilisée pour indiquer à Spring qu'une dépendance doit être injectée automatiquement dans un composant Spring.
* @Service:
  * Gestion de Bean : L'annotation @Service permet à Spring de détecter et de gérer automatiquement la classe en tant que bean dans le contexte de l'application.
  * Injection de Dépendances : En annotant une classe avec @Service, vous pouvez utiliser l'annotation @Autowired pour injecter cette classe dans d'autres composants Spring, tels que des contrôleurs, d'autres services, des repositories, etc., en facilitant la gestion des dépendances entre les composants de l'application.
  * Composant Transactionnel : Les services annotés avec @Service peuvent également être annotés avec @Transactional pour activer la gestion des transactions sur les méthodes de service, permettant ainsi à Spring de gérer automatiquement les transactions pour les méthodes annotées avec @Transactional.
  * Logique Métier : En utilisant l'annotation @Service, vous pouvez encapsuler et isoler la logique métier de l'application dans des classes de service, ce qui permet de séparer la logique métier de la logique de présentation et d'accès aux données dans votre application.
* @Data de lombok génère automatiquement les méthodes toString(), equals(), hashCode(), Getter et Setter
* @AllArgsConstructor et @NoArgsConstructor de Lombok sont utilisées pour générer automatiquement des constructeurs dans une classe
* @RestController est essentiellement une combinaison de @Controller et @ResponseBody. Lorsque vous utilisez @RestController sur une classe, chaque méthode de cette classe renvoie directement une réponse HTTP au format JSON sans avoir besoin d'utiliser des annotations supplémentaires comme @ResponseBody
* @RequestMapping permet de mapper des URL à des méthodes de contrôleur, gérer différentes méthodes HTTP, et intégrer des variables de chemin et des paramètres de média. Elle est essentielle pour le développement d'API RESTful avec Spring
* @CrossOrigin est utilisée dans Spring pour gérer les problèmes de CORS (Cross-Origin Resource Sharing) dans les applications web. CORS est une politique de sécurité qui empêche les requêtes d'être faites entre différents domaines ou origines.
  Lorsque vous développez une application frontend (par exemple, en utilisant Angular, React, ou tout autre framework JavaScript) qui communique avec une application backend Spring Boot (ou toute autre API), vous pouvez rencontrer des problèmes liés à CORS si les deux applications ne sont pas sur le même domaine, le même port, ou la même origine.
* @JsonIgnore est utilisée pour indiquer à Java de ne pas tenir compte d'un certain champ lors de la conversion d'un objet Java en format JSON et vice versa.
* @RepositoryRestResource de Spring Data REST, on peut générer automatiquement tous les web services CRUD et autres
  Méthode GET fournit par Spring Data REST et @RepositoryRestResource(path = "rest") qu'on peut utiliser pour la pagination, trie et recherche:
  • http://localhost:8080/produits/rest
  • http://localhost:8080/produits/rest/2
  • http://localhost:8080/produits/rest?size=2&page=0
  • http://localhost:8080/produits/rest?size=2&page=1
  • http://localhost:8080/produits/rest?sort=nomProduit,desc
  • http://localhost:8080/produits/rest?size=2&page=0&sort=prixProduit,desc
  • http://localhost:8080/produits/rest/search
  • http://localhost:8080/produits/rest/search/findByNomProduitContains?nom=PC
  • http://localhost:8080/produits/rest/search/findByCategorieIdCat?id=1
* @Projection permet de limiter le résultat JSON retourné à un certain nombre d’attributs. Par exemple on peut avoir besoin seulement de l’attribut nomProduit
  Tester la projection suivante: @Projection(name = "nomProd", types = { Produit.class })
* @Builder est une annotation de Lombok qui permet de générer automatiquement du code boilerplate pour les classes, comme les getters, setters, constructeurs, etc. 
  Lombok simplifie le développement en réduisant le code répétitif.
  L'annotation @Builder génère automatiquement un pattern de conception "Builder" pour la classe annotée, ce qui permet de construire des objets SANS FAIRE LE NEW.
    http://localhost:8080/produits/rest?projection=nomProd
### Interface

* [JpaRepository]: En étendant cette interface dans une interface repository personnalisée pour une entité, vous bénéficiez automatiquement de ces fonctionnalités CRUD sans avoir à les implémenter manuellement.

### application.properties

* Ce fichier permet de faire de la configuration pour définir diverses propriétés et configurations qui sont nécessaires pour exécuter l'application. Il permet de configurer l'application en définissant des paramètres tels que les propriétés de la base de données, les configurations de sécurité, les propriétés du serveur, les paramètres d'environnement, etc.
* [spring.jpa.show-sql] Cette propriété est utilisée pour activer ou désactiver l'affichage des requêtes SQL générées par Hibernate dans la console de logs de l'application. En définissant cette propriété à true, les requêtes SQL seront affichées dans la console de logs, ce qui peut être utile pour le débogage et l'analyse des requêtes exécutées par Hibernate.
* [spring.jpa.hibernate.ddl-auto=update] Hibernate met à jour la structure de la base de données pour correspondre au modèle de données JPA, ajoutant, modifiant ou supprimant des tables, des colonnes, etc., mais il ne supprime pas les données existantes.
* [server.servlet.context-path=/produits] Votre application Spring Boot, cela signifie que le chemin de base pour l'application sera http://<adresse_du_serveur>:<port>/produits. Ainsi, tous les endpoints de l'application seront accessibles sous le chemin de base /produits