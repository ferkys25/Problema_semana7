package udla.grupo.progra;

public class Lacteos extends Productos {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }



    public String toString(){
        return "\nNombre: " + getNombre() + "\nCantidad: " + getCantidad() +
                "\nFecha: " + getFecha() + "\nCosto: " + getCosto() + "\nTipo: " + tipo;
    }
}
