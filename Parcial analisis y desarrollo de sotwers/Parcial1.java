import java.util.Scanner;

public class Parcial1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final int SALDO_INICIAL = 800000;
            System.out.println("Saldo inicial: " + SALDO_INICIAL);
            // System.out.println("Bienvenido al Cajero UNIAJC");
            System.out.print("Digite la cantidad a retirar: ");
            int retiro = sc.nextInt();

            if (retiro > 200000) {
                retiro = retiro + 2000; // Se cobra comisión
            }
        if (retiro <= SALDO_INICIAL) {

            int nuevoSaldo = SALDO_INICIAL - retiro;
            System.out.println("Su saldo actual es: " + nuevoSaldo + " Muchas Gracias!!!!");

        } else {

            System.out.println("El valor solicitado más el costo de la transacción es mayor al saldo.");

        }

        sc.close();
        }
    }
}
