
package copamundial;
import java.util.Random;
public class Copamundial {

    public static void main(String[] args) {
       for (int i=0; i<9; i++){
        Random Rand = new Random();
        int golesA = Rand.nextInt(5);
        int golesB = Rand.nextInt(5);
        int golesC = Rand.nextInt(5);
        int golesD = Rand.nextInt(5);
       
        System.out.println("Grupo# "+ i);
        System.out.println("A"+(golesA)+" - B"+(golesB));
        System.out.println("C"+(golesC)+" - D"+(golesD));
       }
    }
    
}
