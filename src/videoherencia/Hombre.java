
package videoherencia;

/**
 *
 * @author abner
 */
public class Hombre extends Humano{
    
    public void afeitarse (){
        System.out.println(getNombre()+" Esta afeitandose desde la clase Hombre");  
    }
    public void conducir (){
        System.out.println(getNombre()+" Esta conduciendo desde la clase Hombre");
    }
}
