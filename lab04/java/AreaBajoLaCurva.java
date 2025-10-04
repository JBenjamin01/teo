import java.utils;
import Trapecio;
public class AreaBajoCurva {
    private int numTrapecios;
    private double rango;
    private double area;

    public void rango(double a, double b, int num){
        this.rango = (b - a)*1.0/num;

    }
    public hallarArea(int n, int a, int b, int h){
        Trapecio t = new Trapecio();
        for(int i = 0;i < n; i++){
            t.area(a, b, h);
        }
        
    }
    public ingresarFuncion(){

    }
}