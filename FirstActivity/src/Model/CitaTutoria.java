package Model;

import java.util.Date;

public class CitaTutoria {
    private int id = 0;
    private Date fecha;
    private String hora;


    public CitaTutoria(Date fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Fecha: "+fecha+" Hora: "+hora;
    }
}
