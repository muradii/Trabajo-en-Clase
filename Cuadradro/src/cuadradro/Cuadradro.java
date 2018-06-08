
package cuadradro;

import java.util.Scanner;

public class Cuadradro {

    public static void imprimirLineaCompleta (int size){
        for (int j=0;j<size;j++){
            System.out.print("*");
        }
    }
    
    public static void imprimirLineaVacia (int lado){
        System.out.print("*");
        for (int j=0;j<lado-2;j++){
            System.out.print(" ");
        }
        System.out.print("*");
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int size = scan.nextInt();
        for (int i = 0;i<size;i++){
            if (i == 0 || i == size-1){
                imprimirLineaCompleta(size);
            }else {
                imprimirLineaVacia(size);
            }
            System.out.print("\n");
        }
    }
    
}
