import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        Stack<ObjPaginaWeb> atras = new Stack<>();
        Stack<ObjPaginaWeb> adelante = new Stack<>();

        boolean continuar = true;
        System.out.println();
        System.out.println("===Navegador Web===");

        while (continuar) {
            System.out.println();
            System.out.println(" Ingrese una opción");
            System.out.println("1) Visitar Página");
            System.out.println("2) Página anterior");
            System.out.println("3) Página siguiente");
            System.out.println("4) Ver historial de navegación");
            System.out.println("5) Salir");
            System.out.print("Opción: ");
            int opt = m.ValidarEntero(sc);

            switch (opt) {
                case 1:
                    atras = m.VisitarPagina(atras, adelante, sc);
                    break;
                case 2:
                    atras = m.Retroceder(atras, adelante);
                    break;
                case 3:
                    atras = m.Avanzar(atras, adelante);
                    break;
                case 4:
                    m.VerHistorial(atras);
                    break;
                case 5:
                    continuar = false;
                    JOptionPane.showMessageDialog(null, "¡Hasta Luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "¡Opción inválida!");
                    break;
            }
        }
    }

}
