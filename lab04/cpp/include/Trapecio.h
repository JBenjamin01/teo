#ifndef TRAPECIO_H
#define TRAPECIO_H

class Trapecio {
public:
    // Declaramos el método como 'static' para poder llamarlo luego sin necesidad de crear objeto
    // de clase Trapecio. Por ejemplo Trapecio::calcular_area(...)
    static double calcular_area(double y1, double y2, double h) {
        return ((y1 + y2) * h) / 2.0;
    }
};

#endif