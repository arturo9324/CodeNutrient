package v1.app.com.codenutrient.POJO;

public class Nutrient {
    private float cantidad;
    private int nutrient_id;
    private String nombre;

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getNutrient_id() {
        return nutrient_id;
    }

    public void setNutrient_id(int nutrient_id) {
        this.nutrient_id = nutrient_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
