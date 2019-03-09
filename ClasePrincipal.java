package juego;

public class ClasePrincipal {
  public static void main(String[] args) {
	  ParteLogica parte = new ParteLogica();
		parte.setBounds(0,0,500,500);
		parte.setVisible(true);
		parte.setResizable(false);
		parte.setLocationRelativeTo(null);
		parte.raiz();
  }
}
