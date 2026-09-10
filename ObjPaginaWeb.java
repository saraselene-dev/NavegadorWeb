import java.time.LocalDataTime;

public class ObjPaginaWeb {
    private String Url;
    private String Titulo;
    private LocalDataTime FechaAcceso;
    
    public ObjPaginaWeb() {
    }

    public ObjPaginaWeb(String url, String titulo, LocalDataTime fechaAcceso) {
        Url = url;
        Titulo = titulo;
        FechaAcceso = fechaAcceso;
    }
    
}
