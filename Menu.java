import java.util.Scanner;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();

        Stack<ObjPaginaWeb> atras = new Stack<>();
        // Stack<ObjPaginaWeb> adelante = new Stack<>();

        boolean continuar = true;
        System.out.println();
        System.out.println("===Navegador S&J===");

        while (continuar) {
            System.out.println();
            System.out.println(" Ingrese una opción");
            System.out.println("1) Visitar Página");
            System.out.println("2) Salir");
            System.out.print("Opción: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    atras = m.VisitarPagina(atras, sc);
                    break;
                case 2:
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
