/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act01_apple;

/**
 *
 * @author Pablo
 */
public class Act01_Apple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Software producto = new Software();
        FechaDeSalida fecha = new FechaDeSalida("Enero",1,2020);
 
        producto.setNombre("Hola");
        producto.setCategoria("Software");
        producto.setPrecio(10.5);
        producto.setIdSoftware(1);
        producto.setCategoriaSoftware("Audio");
        producto.setVersionSoftware(1.3);
        producto.setFecha(fecha);
        
        System.out.println(producto);
        

        
        
    }
    
}
