package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CitaTutoria {
    private int id = 0;
    private Date fecha;
    private String hora;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public CitaTutoria(String fecha, String hora) {
        try {
            this.fecha = formato.parse(fecha);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public String getFecha() {
        return formato.format(fecha);
    }
    public Date getFechaDate() {
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
