## Kotlin-Crud-Shop
<p id="about" align="center">
Studying a basic crud, with kotlin and spring.
</p>

###Run with Docker
steps to test and reproduce the project.
```sh
mvn clean package
```
build the image(from dockerfile):
```sh
docker build --tag=tag-name .
```
Run the container
```sh
docker-compose up- d 
```
Check if is alive:
```sh
docker-compose ps
```
check more in <a href="https://www.baeldung.com/dockerizing-spring-boot-application">
Docker-Spring-Guide
</a>