
package bolentin17_2;

/**
 * @author Guillermo
 */
public class Bolentin17_2 {

    
    public static void main(String[] args) {
        
        Gato Gat1=new Gato();
        Gat1.nadar();
        Gat1.caminar();
        
        Mamiferos Mam1=new Mamiferos();
        Mam1.caminar();
        
        Papagayo Pap1=new Papagayo();
        Pap1.caminar();
        
        Tigre Tig1 = new Tigre();
        System.out.println("Los tigres");
        Tig1.caminar();
        Tig1.nadar();

        Avestruz Ave1 = new Avestruz();
        System.out.println("Las avestruces");
        Ave1.caminar();
        Ave1.volar();

        Murcielago Murc1 = new Murcielago();
        System.out.println("Los murcielagos");
        Murc1.caminar();
        Murc1.volar();
    }
    
}
