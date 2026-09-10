import java.time.LocalDateTime;

public class ObjPaginaWeb {
    private String Url;
    private String Titulo;
    private LocalDateTime FechaAcceso;
    
    public ObjPaginaWeb(String url, String titulo) {
        Url = url;
        Titulo = titulo;
        FechaAcceso = LocalDateTime.now();
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public LocalDateTime getFechaAcceso() {
        return FechaAcceso;
    }

    
    
}
