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

    public void agregarCafe(Cafe newcafe) {
        getListaCafes().add(newcafe);
    }

    public void eliminarCafe(int i) {
        this.getListaCafes().remove(i);
    }


    public int buscarcafe(Cafe.Tamaño tamaño) {
        int posi = 0;
        for (int i = 0; i < getListaCafes().size(); i++) {
            if (getListaCafes().get(i).getTamaño().equals(tamaño)) {
                posi = i;
                System.out.println("Cafe " + tamaño + " en la posicion: " + posi);
            }
        }
        return posi;
    }
}

