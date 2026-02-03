
package videoherencia;

/**
 *
 * @author abner
 */
public class Procesos {
    
    public void iniciar(){
        
        Humano adulto=new Humano();
        adulto.setNombre("Fredy");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        
        System.out.println();
        
        Hombre padre=new Hombre();
        padre.setNombre("Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarse();
        
        System.out.println();
        
        Hombre hijo=new Hombre();
        hijo.setNombre("Abner");
        hijo.comer(hijo.getNombre());
        hijo.dormir();
        hijo.afeitarse();
        hijo.conducir();
        
        System.out.println();
        
        Mujer madre=new Mujer();
        madre.setNombre("Gloria");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
        
        System.out.println();
        
        Mujer hija=new Mujer();
        hija.setNombre("Maria");
        hija.comer(hija.getNombre());
        hija.dormir();
        hija.maquillarse(hija.getNombre());
        hija.bailar(hija.getNombre());
        
        
                
    }
}
