package udla.grupo.progra;

public class Frituras extends Productos {
    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String toString(){
        return "\nNombre: " + getNombre() + "\nCantidad: " + getCantidad() +
                "\nFecha: " + getFecha() + "\nCosto: " + getCosto() + "\nMarca: " + marca;
    }
}
