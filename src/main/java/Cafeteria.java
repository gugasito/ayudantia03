import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private String rs;
    private ArrayList<Cafe> listaCafes = new ArrayList<Cafe>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRs() {
        return rs;
    }

    public void setRs(String rs) {
        this.rs = rs;
    }

    public ArrayList<Cafe> getListaCafes() {
        return listaCafes;
    }

    public void setListaCafes(ArrayList<Cafe> listaCafes) {
        this.listaCafes = listaCafes;
    }

    public Cafeteria(String nombre, String direccion, String rs) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.rs = rs;
    }

    public void agregarcafe(Cafe newcafe) {
        getListaCafes().add(newcafe);
    }

    public void vendercafe(String nombrecafe) {
        this.getListaCafes().remove(buscarcafe(nombrecafe));
    }

    public int buscarcafe(String cafe) {
        int posi = 0;
        for (int i = 0; i < getListaCafes().size(); i++) {
            if (getListaCafes().equals(cafe)) {
                posi = i;
                break;
            }
        }
        return posi;
    }
}

