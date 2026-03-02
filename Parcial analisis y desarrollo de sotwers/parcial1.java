import java.util.Scanner;

public class parcial1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            final int CLAVE = 1234;
    final int SALDO_INICIAL = 800000;
    int claveUsuario;
    int retiro;
    int nuevosaldo;
    
    System.out.print("Ingrese su clave: ");
    claveUsuario = sc.nextInt();
                
                if (claveUsuario == CLAVE) {
                    System.out.print("Ingrese el monto a retirar: ");
                    retiro = sc.nextInt();
                    nuevosaldo = SALDO_INICIAL - retiro;
                    System.out.println("Nuevo saldo: " + nuevosaldo);

                } else {
                    System.out.println("El valor solicitado mas el costo de la trasacción es mayor a el saldo");
                
                    System.out.println("Clave incorrecta");
                    sc.close();
                }
            }
     }
}

   

