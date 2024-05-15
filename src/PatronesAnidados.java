import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {

        int opcion;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("======= Menu =======");
            System.out.println("[1] mostrar Patrón Anidado 1");
            System.out.println("[2] mostrar Patrón Anidado 2");
            System.out.println("[3] mostrar Patrón Anidado 3");
            System.out.println("[4] mostrar Patrón Anidado 4");
            System.out.println("[0] salir");
            System.out.println("\n<- Elige una opción ->");
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número.");
                opcion = -1; // Asignamos -1 para volver al bucle del menú
                continue;
            }


            switch (opcion) {
                case 1: patron1();
                    break;
                case 2: patron2();
                    break;
                case 3: patron3();
                    break;
                case 4: patron4();
                    break;
                case 0: System.out.println("Gracias por usar nuestros Patrones Anidados");
                    break;
                default: System.out.println("error, debe ingreasr una opcion correcta");
                    break;
            }
        } while (opcion != 0);

    }

    public static void patron1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("____________________");
        System.out.println("  Patron Anidado 1  ");
        System.out.println("____________________");
        for (int i = 0; i < n; i++) {// nos da las filas
            for (int j = 0; j < n; j++) {// nos da las columnas
                if (i == 0 || i == n - 1) {
                    System.out.printf("*  ");
                } else if (j == 0 || j == n - 1) {
                    System.out.printf("*  ");
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("____________________");
        System.out.printf("\n");
    }

    public static void patron2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("____________________");
        System.out.println("  Patron Anidado 2  ");
        System.out.println("____________________");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i + j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("____________________");
        System.out.println();
    }

    public static void patron3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("____________________");
        System.out.println("  Patrón Anidado 3  ");
        System.out.println("____________________");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("x ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("____________________");
        System.out.println();
    }

    public static void patron4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("____________________");
        System.out.println("  Patrón Anidado 4  ");
        System.out.println("____________________");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(n == 2 && i == 1 && j == 0){
                    System.out.print("  ");
                }
                else if ((i == 0 && j < n - 2) || (j > 0 && j < n -2) || j == n - 2 || i == n -1 && j == n - 1) {
                    System.out.print("* ");
                } else {
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
            System.out.println("____________________");
            System.out.println();
    }
}


