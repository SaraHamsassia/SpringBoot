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


### Mise en place de l'environnement

* MySQL:
mysql -u username -p
SAVAsava&
show databases;
use name_databases;

* Création du projet. Ajout des dépendances suivantes sur https://start.spring.io/:
Spring Data JPA
MySQL Driver
Spring Boot DevTools -> L'une des fonctionnalités clés de Spring Boot DevTools est le redémarrage automatique du serveur intégré (comme Tomcat) lorsqu'un changement est détecté dans le code source. Cela permet de recharger rapidement les modifications sans avoir à redémarrer manuellement le serveur, ce qui accélère le processus de développement.
Spring web services

* Allez dans "File" (Fichier) > "Project Structure" et ajouter le jdk17 dans SQK.
* Pom.xml et Maven :
Bien que le fichier pom.xml contienne la définition des dépendances de votre projet, pour voir les dépendances téléchargées et incluses dans IntelliJ IDEA, vous devriez les voir dans la vue "External Libraries" (Bibliothèques Externes) comme mentionné ci-dessus.

### Annotation Spring

* L'annotation @Entity est une annotation de JPA (Java Persistence API) qui est utilisée dans les frameworks ORM (Object-Relational Mapping) tels que Hibernate pour indiquer qu'une classe représente une entité persistante qui doit être mappée à une table dans une base de données. Hibernate est un framework ORM populaire qui implémente JPA et facilite la persistance des objets dans une base de données relationnelle.