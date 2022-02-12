## Kotlin-Crud-Shop

### Description:
<p id="desc" >
Studying a basic crud from a store, with Kotlin, Spring and deploying to some cloud, for now.
</p>

### Starting the project with docker
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
