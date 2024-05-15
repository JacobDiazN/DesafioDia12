import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {

        int opcion;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("======= Menu =======");
            System.out.println("[1] mostrar Patrón 1");
            System.out.println("[2] mostrar Patrón 2");
            System.out.println("[3] mostrar Patrón 3");
            System.out.println("[0] salir");
            System.out.println("====================");
            System.out.println("\n<- Elige una opción ->");
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número.");
                opcion = -1; // Asignamos -1 para volver al bucle del menú
                continue;
            }


            switch (opcion){
                case 1: patron1();
                    break;
                case 2: patron2();
                    break;
                case 3: patron3();
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestros Patrones");
                    break;
                default:
                    System.out.println("error, debe ingreasr una opcion correcta");
                    break;
            }

        }while(opcion != 0);

    }

    public static void patron1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("____________________");
        System.out.println("      Patron 1      ");
        System.out.println("____________________");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                System.out.printf("*");
            }else{
                System.out.printf(".");
            }
        }
        System.out.println();
        System.out.println("____________________");
        System.out.printf("\n");
    }

    public static void patron2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("____________________");
        System.out.println("      Patron 3      ");
        System.out.println("____________________");
        for (int i = 0; i < n; i++) {
            System.out.printf("1234" , n);
        }
        System.out.println();
        System.out.println("____________________");
        System.out.printf("\n");
    }

    public static void patron3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("____________________");
        System.out.println("      Patron 3      ");
        System.out.println("____________________");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                System.out.printf("||");
            }else{
                System.out.printf("*");
            }
        }
        System.out.println();
        System.out.println("____________________");
        System.out.printf("\n");
    }
}