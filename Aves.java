
package bolentin17_2;

/**
 * @author Guillermo
 */
public class Aves implements IPuedeVolar,IPuedeCaminar{
    
    @Override
    public void caminar(){
        System.out.println("Las aves pueden caminar");
    }
    @Override
    public void volar(){
        System.out.println("Las aves pueden volar");
    }
    
}
