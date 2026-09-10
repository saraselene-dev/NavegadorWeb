import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<ObjPaginaWeb> VisitarPagina(Stack<ObjPaginaWeb> historial, Scanner sc) {
        System.out.println("Ingrese la URL del sitio web");
        String url = ValidarString(sc);
        System.out.println("Ingrese el nombre de la Página Web");
        String titulo = ValidarString(sc);
        ObjPaginaWeb o = new ObjPaginaWeb(url, titulo);
        historial.push(o);
        System.out.println("Visitando: " + o.getTitulo());
        return historial;
    }

    public String ValidarString(Scanner sc) {
        String entrada = sc.next();
        while (entrada.trim().isEmpty()) {
            System.out.println("No puede estar vacío. Intente de nuevo");
            entrada = sc.next();
        }
        return entrada;
    }

}
