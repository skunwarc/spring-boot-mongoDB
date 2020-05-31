# Simple Spring-Boot project with MongoDB
- references : https://medium.com/@gtommee97/rest-api-java-spring-boot-and-mongodb-4dffbcabbaf5

# command to create a docker image 
# you need spring-boot version from 2.3.0
## no need to create a docker image file on spring-boot version from 2.3.0

- mvn spring-boot:build-image

- also you need to have docker desktop running on the background

# command to run docker image in container
- docker run --tty --publish [dockerpublishport]:[localhostport] [snapshot-name]
  
# got to the browser 
-  [IPdocker]:[appportnumber] paste in the browser
