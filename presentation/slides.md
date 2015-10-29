# Docker
![docker](md/images/dockerlogo.png)

---

## Que *es* Docker
- ### """VM liviana"""
* Procesos propios  
* Red propia  
* Acceso root interno  
- ### Entornos de ejecucion aislados
* Procesos aislados  
* Comparte kernel con el host  
* No emula hardware  
- ### No *inventó* nada
* Concepto "container" ya existía en Linux (LxC)
* cgroups (cpu, memoria, i/o, red)  
* namespaces (procesos aislados, user IDs, filesystem)  

---

## Docker images
* "Molde" para crear containers
* Se construyen con Dockerfiles
* Se pueden publicar en repositorios publicos o privados

---

## Docker containers
* "Maquina virtual" conteniendo la aplicación
* Descartable
* Soporta persistencia mediante volumenes

---

## Dockerfiles
* Pasos para crear una imagen
* Archivo de texto con una sintaxis especial
- ### Comandos comunes
* FROM
* ADD
* COPY
* RUN
* EXPOSE
* ENTRYPOINT
* CMD
* (entre otros)

---

## Puertos
* Por default, containers aislados

* -P => Todos los puertos del container, mappeados a puertos random

* -p 8000 => El 8000 del container a un puerto random

* -p 8000:8000 => 8000 del container, mappeado al 8000 del host

---

## Persistencia
* Default: Containers volátiles

* -v /home/redbee => El path "/home/redbee" va a ser persistente (no accesible por el host)

* -v $HOME/redbee:/home/redbee => ~/redbee en el host se mappea a /home/redbee en el container

---

## Nuevos proyectos
* Docker Compose
* Docker Machine
* Docker Swarm
- ### Compose
![compose](md/images/compose.png)
- ### Machine
![machine](md/images/machine.png)
- ### Swarm
![swarm](md/images/swarm.png)
