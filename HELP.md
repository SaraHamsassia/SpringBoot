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

### Annotation Spring

* @Entity est une annotation de JPA (Java Persistence API) qui est utilisée dans les frameworks ORM (Object-Relational Mapping) tels que Hibernate pour indiquer qu'une classe représente une entité persistante qui doit être mappée à une table dans une base de données. Hibernate est un framework ORM populaire qui implémente JPA et facilite la persistance des objets dans une base de données relationnelle.
* @Autowired est utilisée pour indiquer à Spring qu'une dépendance doit être injectée automatiquement dans un composant Spring.
* @Service:
  * Gestion de Bean : L'annotation @Service permet à Spring de détecter et de gérer automatiquement la classe en tant que bean dans le contexte de l'application.
  * Injection de Dépendances : En annotant une classe avec @Service, vous pouvez utiliser l'annotation @Autowired pour injecter cette classe dans d'autres composants Spring, tels que des contrôleurs, d'autres services, des repositories, etc., en facilitant la gestion des dépendances entre les composants de l'application.
  * Composant Transactionnel : Les services annotés avec @Service peuvent également être annotés avec @Transactional pour activer la gestion des transactions sur les méthodes de service, permettant ainsi à Spring de gérer automatiquement les transactions pour les méthodes annotées avec @Transactional.
  * Logique Métier : En utilisant l'annotation @Service, vous pouvez encapsuler et isoler la logique métier de l'application dans des classes de service, ce qui permet de séparer la logique métier de la logique de présentation et d'accès aux données dans votre application.
### Interface

* [JpaRepository]: En étendant cette interface dans une interface repository personnalisée pour une entité, vous bénéficiez automatiquement de ces fonctionnalités CRUD sans avoir à les implémenter manuellement.

### application.properties

* Ce fichier permet de faire de la configuration pour définir diverses propriétés et configurations qui sont nécessaires pour exécuter l'application. Il permet de configurer l'application en définissant des paramètres tels que les propriétés de la base de données, les configurations de sécurité, les propriétés du serveur, les paramètres d'environnement, etc.
* [spring.jpa.show-sql] Cette propriété est utilisée pour activer ou désactiver l'affichage des requêtes SQL générées par Hibernate dans la console de logs de l'application. En définissant cette propriété à true, les requêtes SQL seront affichées dans la console de logs, ce qui peut être utile pour le débogage et l'analyse des requêtes exécutées par Hibernate.
* [spring.jpa.hibernate.ddl-auto=update] Hibernate met à jour la structure de la base de données pour correspondre au modèle de données JPA, ajoutant, modifiant ou supprimant des tables, des colonnes, etc., mais il ne supprime pas les données existantes.
* [server.servlet.context-path=/produits] Votre application Spring Boot, cela signifie que le chemin de base pour l'application sera http://<adresse_du_serveur>:<port>/produits. Ainsi, tous les endpoints de l'application seront accessibles sous le chemin de base /produits