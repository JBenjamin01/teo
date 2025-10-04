import java.utils;
import Trapecio;
public class AreaBajoCurva {
    private int numTrapecios;
    private double rango;
    private double area;

    public void rango(double a, double b, int num){
        this.rango = (b - a)*1.0/num;

    }
    public void hallarArea(int a, int b){
        Trapecio t = new Trapecio(); 
        int a1 = a;
        int b1 = 0;
        while(a1 < b){
            a1 = hallarPunto(a1);
            b1 = hallarPunto(a1 + this.rango);
            this.area += t.area(a1, b1, b1 - a1);
            a1 += this.rango
            ;
        }
        
    }

    public double hallarPunto(double x){
        return 2 * Math.pow(x, 2) + 3x + 1/2.0;
    }
}