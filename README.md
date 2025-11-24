# Práctica ES - Git IA
## Dirección

- https://github.com/smormen13/ES_GIT_IA 

## Roles

- Alumno 1 -> Salvador Moreno Mendoza 
- Alumno 2 -> Rubén María Márquez González
- Alumno 3 -> Diego Atalaya Ramírez
- Alumno 4 -> Jose Bello González
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

#### Apartado 10: Ver las diferencias 
- git diff ramaAlumno1 ramaAlumno2

##### ¿Lo lograsteis hacer en menos de dos minutos o habéis quedado fatal delante del jefe?
Sí, conseguimos quedar bien delante del jefe.
#### Apartado 11: Merge sin conflictos 
- git checkout main
- git pull origin main
- git merge ramaAlumno1
- git push origin main

##### ¿Habéis podido realizar los pasos de este ejercicio de forma idéntica?
- No, el primer alumno en hacer push lo hizo sin problemas. El segundo alumno, al intentar hacer push, se encontró con un rechazo porque su main local se había quedado desactualizado. Tuvo que ejecutar un git pull origin main adicional para descargar los cambios del primer alumno antes de poder subir los suyos.

#### Apartado 12: Credenciales
- git config --global credential.helper 'cache --timeout=86400'
- git checkout ramaAlumno1
- git merge main
- git log main > LogAlumno1.txt
- git add LogAlumno1.txt
- git commit -m "Añade LogAlumno1.txt"
- git checkout main
- git pull origin main
- git merge ramaAlumno1
- git push origin main

##### ¿Funcionó la configuración de credenciales?
- Sí, tras configurar el 'credential.helper' y hacer el primer 'push' (donde me pidió la clave por última vez), el segundo 'push' del Apartado 12 subió los cambios directamente sin solicitar usuario ni token.

#### Apartado 14: Unión de nuevos miembros
##### Se incorporan al equipo dos nuevos desarrolladores:
- Alumno 3: @Jose039
- Alumno 4: @Streif44

#### Apartado 15: Crear ramas remotas y una extra para investigar
- git branch investigacion
- git push origin investigacion
- git branch -r


#### Apartado 16: Modifican los alumnos en sus ramas, cada un en su rama
- git checkout ramaAlumno1
- nano src/jungle/Pantalla.java
- git add src/jungle/Pantalla.java
- git commit -m "Añade método addMedicamento_Almacen en Pantalla.java

#### Apartado 17: ¿Qué ha cambiado?
- git whatchanged -1 --pretty=format:"Hash: %h | Autor: %an | Committer: %cn | Mensaje: %s"

#### Apartado 18: Merge sin conflictos
- git checkout main
- git merge ramaAlumno1
- git push origin main

#### Apartado 19: Modifican los alumnos en sus ramas, en el mismo archivo
- git checkout ramaAlumno1
- nano src/jungle/Compra.java
- git add src/jungle/Compra.java
- git commit -m "Añade clase Compra.java
- git push origin ramaAlumno1
- git add src/jungle/LineaDeCompra.java
- git commit -m "Mejora código LineaDeCompra

#### Apartado 20: Merge con conflictos
- git checkout main
- git pull origin main
- git merge ramaAlumno1
- git push origin main (Resultado: Fallo (rejected - non-fast-forward) porque otro alumno subió cambios antes.)
- git pull origin main
- code .
- git add src/jungle/lineaDeCompra.java
- git commit -m "Solucion de conflicto en lineaDeCompra"
- git push origin main

##### Ganador de la carrera: Rubén

##### ¿Por qué ha sucedido esto?
- El conflicto ha ocurrido porque todos los integrantes del equipo modificamos el mismo archivo (lineaDeCompra.java) en nuestras ramas y tratamos de subirlo a la rama remota main al mismo tiempo. Git rechaza los push posteriores al primero para evitar sobrescribir el trabajo de los demás sin revisión previa.

##### ¿Por qué el Alumno más rápido no ha tenido problemas?
- El alumno más rápido no tuvo problemas porque, en el momento exacto de su push, la rama main remota no había cambiado respecto a su copia local.

#### Apartado 21: Historial de commits
- git shortlog -sn
- git cherry -v main ramaAlumno1

##### Historial de commits por autor
- 22  smormen13
- 11  rubenmmg88
- 4  Jose039
- 2  Streif44

#### Apartado 22: Eliminar rama remota secundaria
- git push origin --delete investigacion


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

No hemos podido hacer el apartado con los mismos comandos ya que uno ha subido los cambios antes que otro y por tanto el último en subir los cambios ha tenido que actualizarlo con los cambios subidos por el otro.

#### Apartado 12: Credenciales
- git config --global credential.helper 'cache --timeout=86400'
- git checkout ramaAlumno2
- git merge main
- git log main > LogAlumno2.txt
- git add LogAlumno2.txt
- git commit -m "Añadiendo LogAlumno2.txt"
- git checkout main
- git pull origin main
- git merge ramaAlumno2
- git push origin main

##### ¿Funcionó la configuración de credenciales?
- Sí, una vez configurado el 'credential.helper' y hacer el primer push donde pidió la clave por última vez, en el segundo push no pidió usuario ni token.

#### Apartado 14: Unión de nuevos miembros
##### Se incorporan al equipo dos nuevos desarrolladores:
- Alumno 3: @Jose039
- Alumno 4: @Streif44

#### Apartado 15: Crear ramas remotas y una extra para investigar
- git branch investigacion
- git push origin investigacion
- git branch -r

#### Apartado 16: Modifican los alumnos en sus ramas, cada un en su rama
- git checkout ramaAlumno2
- nano src/jungle/Pantalla.java
- git add src/jungle/Pantalla.java
- git commit -m "Añadiendo menú de consultas de clientes en Pantalla.java"

#### Apartado 17: ¿Qué ha cambiado?
- git whatchanged -1 --pretty=format:"Hash: %h | Autor: %an | Committer: %cn | Mensaje: %s"

#### Apartado 18: Merge sin conflictos
- git checkout main
- git merge ramaAlumno2
- git push origin main

#### Apartado 19.4.: Modifican los alumnos en sus ramas, en el mismo archivo
- git checkout ramaAlumno2
- nano src/jungle/lineaDeCompra.java
- git add src/jungle/lineaDeCompra.java
- git commit -m "Modificando archivo lineaDeCompra.java"
- git push origin ramaAlumno2

#### Apartado 20: Merge con conflictos
- git checkout main
- git pull origin main
- git merge ramaAlumno2
- git push origin main (Se hizo correctamente ya que fui el primero en hacer el push)

##### Ganador de la carrera: Rubén (Yo)

##### ¿Por qué ha sucedido esto?
- El conflicto sucede porque varios miembros del equipo modificaron el mismo archivo (lineaDeCompra.java) en sus ramas. Git solo acepta el primer push al servidor remoto (main). Rechaza los push posteriores para obligarte a traer los cambios del compañero a tu copia local (git pull), resolver los conflictos en ese archivo y luego subir el resultado, evitando así sobrescribir el trabajo de los demás sin revisión.

##### ¿Por qué el Alumno más rápido no ha tenido problemas?
- El alumno más rápido no tuvo problemas porque, en el momento exacto de su push, la rama remota main estaba exactamente en el mismo estado que su copia local más reciente, es decir, no había recibido ningún commit nuevo de nadie más. Esto permitió a Git aceptar sus cambios directamente sin ningún tipo de conflicto.

#### Apartado 21: Historial de commits
- git shortlog -sn
- git cherry -v main ramaAlumno2

##### Historial de commits por autor
- 22  smormen13
- 11  rubenmmg88
- 4  Jose039
- 2  Streif44