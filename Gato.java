
package bolentin17_2;

/**
 * @author Guillermo
 */
public class Gato extends Mamiferos implements IPuedeNadar{
    
    @Override
    public void nadar(){
        System.out.println("Los gatos pueden nadar");
    }
}
