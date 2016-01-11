package Bataille;

import java.awt.EventQueue;

public class BatailleMain {

	private static JeuDeCarte jeuDeCarte;

	public BatailleMain(){
	}
	
	// Demmarre l'application
		public static void main(String[] args) {
			// Demarrage de l'interface primaire de l'application
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					jeuDeCarte = new JeuDeCarte();
				}
			});
		}
	
}
