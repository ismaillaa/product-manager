# Product Manager

Mini application Java/Maven utilisée pour le TP Jenkins + SonarQube (ENIAD Berkane, DevOps 2025/2026).

## Structure

```
product-manager/
├── pom.xml                  # Configuration Maven
├── Jenkinsfile              # Pipeline CI/CD Jenkins
└── src/
    ├── main/java/com/ismail/productmanager/
    │   ├── Product.java
    │   └── ProductService.java
    └── test/java/com/ismail/productmanager/
        └── ProductServiceTest.java
```

## Build local

```bash
mvn clean compile
mvn test
mvn package
```

L'artefact produit : `target/product-manager-1.0-SNAPSHOT.jar`

## Pipeline Jenkins

Stages : Checkout → Build → Test → SonarQube Analysis → Quality Gate → Package
