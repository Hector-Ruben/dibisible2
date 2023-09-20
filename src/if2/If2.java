package if2;
import java.util.Scanner;
public class If2 {
    public void Divisible(){
        int n, d;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca primer valor ");
        n = entrada.nextInt();
        System.out.print("Introduzca segundo valor ");
        d = entrada.nextInt();
        
        if (n%d == 0) {
            System.out.println(n + " es divisible entre " + d);
        } else {
            System.out.println(n + " no es divisible entre " + d);
        }
    }
    public static void main(String[] args) {
        If2 divisible = new If2();
        divisible.Divisible();
    }
}
