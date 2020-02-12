
package bolentin17_2;

/**
 * @author Guillermo
 */
public class Murcielago extends Mamiferos implements IPuedeVolar{
    
    @Override
    public void volar(){
        System.out.println("Los murcielagos pueden volar");
    }
}
