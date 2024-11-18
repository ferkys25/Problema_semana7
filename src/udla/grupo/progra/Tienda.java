package udla.grupo.progra;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Tienda {
    public static void main(String[] args) {

        // Crear una lista de productos
        List<String> listaProductos = new ArrayList<>();

        int option = 1, cual, contador = 0;



        // Crear algunos objetos Producto
        do{
            switch (option) {
                case 1:
                    cual = Integer.parseInt(JOptionPane.showInputDialog(null, "Que quiere añadir (Lacteo: 1, Fritura: 2)", null, JOptionPane.QUESTION_MESSAGE));
                    if (cual == 1){
                        Lacteos lacteo = new Lacteos();
                        String nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto: ", null, JOptionPane.QUESTION_MESSAGE);
                        lacteo.setNombre(nombre);
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad del producto: ", null, JOptionPane.QUESTION_MESSAGE));
                        lacteo.setCantidad(cantidad);
                        String tipo = JOptionPane.showInputDialog(null, "Ingresa el tipo del lacteo: ", null, JOptionPane.QUESTION_MESSAGE);
                        lacteo.setTipo(tipo);
                        float costo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el costo del producto: ", null, JOptionPane.QUESTION_MESSAGE));
                        lacteo.setCosto(costo);
                        String fecha = JOptionPane.showInputDialog(null, "Ingresa el fecha del producto: ", null, JOptionPane.QUESTION_MESSAGE);
                        lacteo.setFecha(fecha);
                        listaProductos.add(lacteo.toString());
                        contador++;
                    } else if (cual == 2) {
                        Frituras fritura = new Frituras();
                        String nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del producto: ", null, JOptionPane.QUESTION_MESSAGE);
                        fritura.setNombre(nombre);
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la cantidad del producto: ", null, JOptionPane.QUESTION_MESSAGE));
                        fritura.setCantidad(cantidad);
                        String marca = JOptionPane.showInputDialog(null, "Ingresa el marca del producto: ", null, JOptionPane.QUESTION_MESSAGE);
                        fritura.setMarca(marca);
                        float costo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el costo del producto: ", null, JOptionPane.QUESTION_MESSAGE));
                        fritura.setCosto(costo);
                        String fecha = JOptionPane.showInputDialog(null, "Ingresa el fecha del producto: ", null, JOptionPane.QUESTION_MESSAGE);
                        fritura.setFecha(fecha);
                        listaProductos.add(fritura.toString());
                        contador++;
                    } else {
                        System.out.println("No existe esa opcion");
                    }
                    break;

                case 2:

                    break;

                case 3:
                    listaProductos.removeLast();
                    JOptionPane.showMessageDialog(null,"Ultimo producto eliminado con exito!");
                    contador--;
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, listaProductos);
                    break;
                default:
                    System.out.println("Esa opcion no es valida");
                    break;
            }



            option = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseas añadir otro producto(Si: 1, No:2, Eliminar el producto añadido: 3, Mostrar inventerio: 4) ", null, JOptionPane.QUESTION_MESSAGE));
        }while (option == 1 || option == 3 || option == 4);


     }


}
