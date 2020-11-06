package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jhamil Gonzales
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		double r,area,circunferecnia;
        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Introduzca el radio: ");
            r=leer.nextDouble();
            if(r<0){
                circunferecnia =0 ;
                area= 0;
            }
            else{
                circunferecnia =2 * Math.PI*r;
                area= Math.PI*Math.pow(r, 2);
            }
            System.out.println("Circulo con radio "+r+",");
            System.out.println(" la circunferencia es "+circunferecnia);
            System.out.println(" y el area es "+area+".");
        }catch(InputMismatchException e){
            System.out.println(e);
        }
	}
}
