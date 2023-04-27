public class Cafe {
    private int gramos;
    private float ml;
    private String tamaño;

    public int getGramos() {
        return gramos;
    }

    public void setGramos(int gramos) {
        this.gramos = gramos;
    }

    public float getMl() {
        return ml;
    }

    public void setMl(float ml) {
        this.ml = ml;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Cafe(int gramos, float ml, String tamaño) {
        this.gramos = gramos;
        this.ml = ml;
        this.tamaño = tamaño;
    }

    public String toString() {
        String msj = "";
        for (int i = 0; i < 3; i++) {
            msj += getGramos() + "-" + getMl() + "-" + getTamaño();
        }
        return msj;
    }
}
