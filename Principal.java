package GUI;

/**
 *
 * @author jonat
 */
public class Principal {
    public static void main(String[] args) {
        Login();
    }
    
    public static void Login(){
        FrmLogin v=new FrmLogin();
        v.setVisible(true);
    }   
}
