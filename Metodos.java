import java.util.Scanner;
import java.util.Stack;

public class Metodos {
    public Stack<ObjPaginaWeb> VisitarPagina(Stack<ObjPaginaWeb> historial, Stack<ObjPaginaWeb> adelante, Scanner sc) {
        System.out.println("Ingrese la URL del sitio web");
        String url = ValidarString(sc);
        System.out.println("Ingrese el nombre de la Página Web");
        String titulo = ValidarString(sc);
        ObjPaginaWeb o = new ObjPaginaWeb(url, titulo);
        historial.push(o);
        adelante.clear();
        System.out.println("Visitando: " + o.getTitulo());
        return historial;
    }

    public Stack<ObjPaginaWeb> Retroceder(Stack<ObjPaginaWeb> historial, Stack<ObjPaginaWeb> adelante) {
        if (historial.isEmpty()) {
            System.out.println("No hay páginas para retroceder");

        } else {
            ObjPaginaWeb actual = historial.pop();
            adelante.push(actual);
            System.out.println("Saliendo de: " + actual.getTitulo());
            if (!historial.isEmpty()) {
                ObjPaginaWeb siguiente = historial.peek();
                System.out.println("Ahora en: " + siguiente.getTitulo());
            } else {
                System.out.println("No hay más páginas en el historial");
            }
        }
        return historial;
    }

    public Stack<ObjPaginaWeb> Avanzar(Stack<ObjPaginaWeb> historial, Stack<ObjPaginaWeb> adelante) {
        if (adelante.isEmpty()) {
            System.out.println("No hay páginas para avanzar");
        } else {
            ObjPaginaWeb siguiente = adelante.pop();
            historial.push(siguiente);
            System.out.println("Avanzado a: " + siguiente.getTitulo());
        }
        return historial;
    }

    public void VerHistorial(Stack<ObjPaginaWeb> historial) {
        for (int i = historial.size() - 1; i >= 0; i--) {
            ObjPaginaWeb o = historial.get(i);
            System.out.println("Titulo: " + o.getTitulo());
            System.out.println("URL: " + o.getUrl());
            System.out.println("Fecha de acceso: " + o.getFechaAcceso());
            System.out.println("------------------------");
        }
    }

    public String ValidarString(Scanner sc) {
        String entrada = sc.next();
        while (entrada.trim().isEmpty()) {
            System.out.println("No puede estar vacío. Intente de nuevo");
            entrada = sc.next();
        }
        return entrada;
    }

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Ingrese un dato entero numérico");
            sc.next();
        }
        return sc.nextInt();
    }
}
