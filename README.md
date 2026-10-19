# gauss-jordan-practica


**Materia:** Métodos Numéricos — Unidad 3
**Instituto Tecnológico Superior de Xalapa ** 
**Docente:** Víctor Hugo Vásquez Herrera
**Alumna:** Andrés Garrido Denisse Itzel

Implementación del método de Gauss-Jordan, reutilizando el módulo de Eliminación Gaussiana
(`Gauss.eliminacionGaussiana`) y trabaja sobre la matriz por referencia en memoria RAM.

## Cómo compilar y ejecutar

Requisito: JDK 11 o superior.

```bash
git clone <URL-DE-TU-REPOSITORIO>
cd <carpeta-del-repositorio>
mkdir out
javac -d out src/*.java
java -cp out Main
```

## Ejemplo de prueba

Sistema (Prueba 1):

```
 2x1 +  x2 -  x3 = -3
-3x1 -  x2 + 2x3 = -1
-2x1 +  x2 + 2x3 =  2
```

Salida por consola (ejecución completa):

```text
=== PRUEBA 1 ===
Matriz aumentada inicial:
[    2.0000    1.0000   -1.0000 |   -3.0000 ]
[   -3.0000   -1.0000    2.0000 |   -1.0000 ]
[   -2.0000    1.0000    2.0000 |    2.0000 ]

Matriz final (identidad | soluciones):
[    1.0000    0.0000    0.0000 |  -17.0000 ]
[    0.0000    1.0000    0.0000 |   10.0000 ]
[    0.0000    0.0000    1.0000 |  -21.0000 ]

Vector de soluciones:
  x1 = -17.0000
  x2 = 10.0000
  x3 = -21.0000

=== PRUEBA 2 ===
Matriz aumentada inicial:
[    0.0000    2.0000    1.0000 |    8.0000 ]
[    1.0000    1.0000    1.0000 |    6.0000 ]
[    2.0000    1.0000   -1.0000 |    1.0000 ]

Matriz final (identidad | soluciones):
[    1.0000    0.0000    0.0000 |    0.6000 ]
[    0.0000    1.0000    0.0000 |    2.6000 ]
[    0.0000    0.0000    1.0000 |    2.8000 ]

Vector de soluciones:
  x1 = 0.6000
  x2 = 2.6000
  x3 = 2.8000

=== PRUEBA 3 ===
Matriz aumentada inicial:
[    1.0000    1.0000    1.0000    1.0000 |   10.0000 ]
[    2.0000   -1.0000    1.0000    0.0000 |    5.0000 ]
[    1.0000    2.0000   -1.0000    1.0000 |    6.0000 ]
[    3.0000    1.0000    0.0000   -1.0000 |    4.0000 ]

Matriz final (identidad | soluciones):
[    1.0000    0.0000    0.0000    0.0000 |    1.9286 ]
[    0.0000    1.0000    0.0000    0.0000 |    1.7143 ]
[    0.0000    0.0000    1.0000    0.0000 |    2.8571 ]
[    0.0000    0.0000    0.0000    1.0000 |    3.5000 ]

Vector de soluciones:
  x1 = 1.9286
  x2 = 1.7143
  x3 = 2.8571
  x4 = 3.5000

=== PRUEBA 4 ===
Matriz aumentada inicial:
[    1.0000    2.0000    3.0000 |    6.0000 ]
[    2.0000    4.0000    6.0000 |   12.0000 ]
[    1.0000    1.0000    1.0000 |    3.0000 ]

Error: Sistema singular: ultimo pivote nulo.

```

Las pruebas 2 y 3 cubren un pivote inicial igual a cero y un sistema 4x4, la prueba 4 muestra
la detección de un sistema singular.
