package javav;
import java.util.*;
public class AreaBajoLaCurva {
    private int numTrapecios;
    private double rango;
    private double area;

    public void rango(double a, double b, int num){
        this.rango = (b - a)*1.0/num;

    }
    public void hallarArea(double a, double b){
        double a1 = a;
        double b1 = 0;
        while(a1 < b){
            a1 = hallarPunto(a1);
            b1 = hallarPunto(a1 + this.rango);
            this.area += Trapecio.area(a1, b1, b1 - a1);
            a1 += this.rango;
        }
        
    }

    public double hallarPunto(double x){
        return 2 * Math.pow(x, 2) + 3*x + 1/2.0;
    }

    public static void main(String[] args) {
        
        AreaBajoLaCurva abc = new AreaBajoLaCurva();
        abc.rango(0, 10, 100);
        abc.hallarArea(0, 10);
        System.out.println("El area bajo la curva es: " + abc.area);
    }
}