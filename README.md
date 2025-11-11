# Práctica ES - Git IA

## Roles

- Alumno 1 -> Salvador Moreno Mendoza 
- Alumno 2 -> Rubén María Márquez González

## Comandos usados:

### Alumno 1

#### Apartado 3: Creación e inicialización
- mkdir Git_IA
- cd Git_IA
- git init
- git status
- git add .
- git commit -m "Inicialización del repositorio con archivos Farmacia"
- git remote add origin https://github.com/smormen13/ES_GIT_IA.git
- git remote
- git push origin main

#### Apartado 5: Actualización README
- git pull origin main
- git add README.md
- git commit -m "Actualización README"
- git push origin main

#### Apartado 7: Creación de ramas
- git branch
- git checkout -b ramaAlumno1

#### Apartado 8: Listar ramas
- git branch

##### ¿Qué significa el asterisco encima de una de las ramas?
- el asterisco indica cuál es la rama activa en ese momento, es decir, la rama en la que estamos situados y trabajando actualmente.

#### Apartado 9: Modificar archivos distintos en ramas
- nano almacen_cli.java
- git add almacen_cli.java
- git commit -m "Añadiendo fichero almacen_cli.java"


### Alumno 2

#### Apartado 4: Clonar Repositorio
- git clone https://github.com/smormen13/ES_GIT_IA.git
- nano README.md

#### Apartado 7: Creación de ramas
- git branch ramaAlno2
- git checkout ramaAlno2
- git branch -m ramaAlumno2

#### Apartado 8: Listar ramas
Para listar las ramas he utilizado el comando:
- git branch
El asterisco que se observa sobre el nombre de una de las ramas indica la rama en la cual está situado el usuario.

#### Apartado 9: Modificación en rama de archivos distintos
- git checkout ramaAlumno2

- nano cliente.java
- git add cliente.java
- git commit -m "Añadiendo fichero cliente.java"

#### Apartado 10: Ver las diferencias
He quedado bien con el jefe, menos mal...
- git diff ramaAlumno2 ramaAlumno1

#### Apartado 11: Merge sin conflictos

1. git pull
2. git merge ramaAlumno2
3. git checkout ramaAlumno2
4. git push
5. git checkout main
6. git push
7. git pull