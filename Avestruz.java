
package bolentin17_2;

/**
 * @author Guillermo
 */
public class Avestruz extends Aves implements IPuedeCaminar{
    
    @Override
    public void caminar(){
        System.out.println("La avestruz solo puede caminar");
    }
}
