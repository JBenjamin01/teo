# Laboratorio 04: Método del Trapecio con Programación Paralela

### Descripción del Repositorio

Este repositorio contiene la resolución del Laboratorio 04 del laboratorio de Tecnología de Objetos sobre la Programación Concurrente. En él, se implementa el método del trapecio para la aproximación de integrales definidas, utilizando tres lenguajes de programación distintos: Java, C++ y Go. El objetivo principal es explorar y comparar la programación paralela a través del uso de hilos y, de forma más avanzada, mediante la implementación de *pools de hilos*.

### Actividades consideradas

Los puntos clave a considerar son:
1.  **Implementación del Método del Trapecio**: Se calcula el área bajo la curva de la función definida.
2.  **Programación Paralela**: La solución se implementa utilizando hilos en cada uno de los lenguajes.
3.  **Uso de Pool de Hilos**: Se investiga e implementa el uso de un *pool de hilos* para optimizar la gestión de recursos.
4.  **Criterio de Parada**: El cálculo se detiene cuando el valor de la integral aproximada deja de variar significativamente (converge).
5.  **Comparativa**: Se comparan las ventajas y desventajas de la programación paralela en Java, C++ y Go.

El código se encuentra organizado por lenguaje, con las implementaciones correspondientes para hilos básicos y *thread pools* en cada caso.