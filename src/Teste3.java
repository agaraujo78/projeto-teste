import javax.swing.JOptionPane;

public class Teste3 {

	public static void main(String[] args) {
		
	String texto = JOptionPane.showInputDialog("Digite Alguma Coisa");
	
	JOptionPane.showMessageDialog(null, "Olá " + texto );
	}
}