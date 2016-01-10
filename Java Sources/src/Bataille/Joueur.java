package Bataille;

public class Joueur {

	String nom = "";
	String prenom = "";
	int numeroDeJoueur = 0;
	private Main mainDeRecuperation;
	private Main mainDeJeu;
	
	public Joueur(){
		
		int joueurID = numeroDeJoueur;
		String joueurNom = nom;
		String joueurPrenom = prenom;
		mainDeJeu = new Main();
		mainDeRecuperation = new Main();
		
	}
	
}
