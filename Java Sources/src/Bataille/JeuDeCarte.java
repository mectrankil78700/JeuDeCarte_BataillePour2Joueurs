package Bataille;

import java.util.ArrayList;

public class JeuDeCarte {
	
	int nombreDeCartes = 52;
	int nombreDeTypeDeCartes = 4;
	int nombreDeCartesParTypes = 13;
	int nombreDeValeursDeCartes = 13;
	ArrayList<String> typesDeCartes = new ArrayList<String>();
	ArrayList<String> valeursDeCartes = new ArrayList<String>();
	ArrayList<String> nomsDeCartes = new ArrayList<String>();
	private Carte carte;
	
	public JeuDeCarte(){
		
		int jeuDeCarte_NbCartes = nombreDeCartes;
		int jeuDeCarte_NbCartesTypes = nombreDeCartesParTypes;
		int jeuDeCarte_NbTypesCartes = nombreDeTypeDeCartes;
		int jeuDeCarte_NbValeursCartes = nombreDeValeursDeCartes;
		carte = new Carte(); 
		// - - [ Liste des types de cartes ] - - //
		for(int i=0; i<=jeuDeCarte_NbCartes; i++){
			typesDeCartes.add("Pique");
			typesDeCartes.add("Carreau");
			typesDeCartes.add("Coeur");
			typesDeCartes.add("Trèfle");
		}
		// - - [ Liste des valeurs de cartes ] - - //
		for(int i=0; i<=jeuDeCarte_NbTypesCartes; i++){
			valeursDeCartes.add("2");
			valeursDeCartes.add("3");
			valeursDeCartes.add("4");
			valeursDeCartes.add("5");
			valeursDeCartes.add("6");
			valeursDeCartes.add("7");
			valeursDeCartes.add("8");
			valeursDeCartes.add("9");
			valeursDeCartes.add("10");
			valeursDeCartes.add("Valet");
			valeursDeCartes.add("Dame");
			valeursDeCartes.add("Roi");
			valeursDeCartes.add("AS");
		}
		// - - [ Liste des noms de cartes ] - - //
		for(int i=0; i<=jeuDeCarte_NbValeursCartes; i++){
			nomsDeCartes.add("2");
			nomsDeCartes.add("3");
			nomsDeCartes.add("4");
			nomsDeCartes.add("5");
			nomsDeCartes.add("6");
			nomsDeCartes.add("7");
			nomsDeCartes.add("8");
			nomsDeCartes.add("9");
			nomsDeCartes.add("10");
			nomsDeCartes.add("11");
			nomsDeCartes.add("12");
			nomsDeCartes.add("13");
			nomsDeCartes.add("14");
		}
		// Création du jeu de cartes de 52 cartes
		for(int i=0; i<=jeuDeCarte_NbCartesTypes; i++){
			carte.idDeLaCarte = __;
		}
		
	}
	
}
