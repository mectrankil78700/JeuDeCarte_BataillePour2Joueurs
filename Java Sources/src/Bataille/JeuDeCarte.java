package Bataille;

import java.util.ArrayList;

public class JeuDeCarte {
	
	int nombreDeCartes = 52;
	int nombreDeTypeDeCartes = 4;
	int nombreDeCartesParTypes = 13;
	int nombreDeValeursDeCartes = 13;
	ArrayList<String> idDeCartes = new ArrayList<String>();
	ArrayList<String> typesDeCartes = new ArrayList<String>();
	ArrayList<String> valeursDeCartes = new ArrayList<String>();
	ArrayList<String> nomsDeCartes = new ArrayList<String>();
	private Carte carte;
	
	public JeuDeCarte(){
		
		int jeuDeCarte_IDCartes = nombreDeCartes;
		int jeuDeCarte_NbCartes = nombreDeCartes;
		int jeuDeCarte_NbCartesTypes = nombreDeCartesParTypes;
		int jeuDeCarte_NbTypesCartes = nombreDeTypeDeCartes;
		int jeuDeCarte_NbValeursCartes = nombreDeValeursDeCartes;
		carte = new Carte(); 
		// - - [ ID de cartes ] - - //
		for(int i=1; i<=jeuDeCarte_IDCartes; i++){
			idDeCartes.add(""+i+"");
		}
		// - - [ Liste des types de cartes ] - - //
		typesDeCartes.add("Pique");
		typesDeCartes.add("Carreau");
		typesDeCartes.add("Coeur");
		typesDeCartes.add("Trèfle");
		// - - [ Liste des valeurs de cartes ] - - //
		valeursDeCartes.add("2");
		valeursDeCartes.add("3");
		valeursDeCartes.add("4");
		valeursDeCartes.add("5");
		valeursDeCartes.add("6");
		valeursDeCartes.add("7");
		valeursDeCartes.add("8");
		valeursDeCartes.add("9");
		valeursDeCartes.add("10");
		valeursDeCartes.add("11");
		valeursDeCartes.add("12");
		valeursDeCartes.add("13");
		valeursDeCartes.add("14");
		// - - [ Liste des noms de cartes ] - - //
		nomsDeCartes.add("2");
		nomsDeCartes.add("3");
		nomsDeCartes.add("4");
		nomsDeCartes.add("5");
		nomsDeCartes.add("6");
		nomsDeCartes.add("7");
		nomsDeCartes.add("8");
		nomsDeCartes.add("9");
		nomsDeCartes.add("10");
		nomsDeCartes.add("Valet");
		nomsDeCartes.add("Dame");
		nomsDeCartes.add("Roi");
		nomsDeCartes.add("As");
		// - - [ Création du jeu de cartes de 52 cartes ] - - //
		System.out.println("Jeu de cartes à 52 cartes");
		/*
		for(int i=1; i<=jeuDeCarte_NbTypesCartes; i++){
			for(int j=1; j<=jeuDeCarte_NbCartesTypes; j++){
				System.out.println("=>I : "+i+"\n-J :"+j);
			}
		}
		*/
		for(int i=1; i<=jeuDeCarte_NbTypesCartes; i++){
			for(int j=0; j<jeuDeCarte_NbCartesTypes; j++){
				
				/*
				 * PROBLEME LORS DE LA CREATION D'UNE NOUVELLE CARTE :
				 *  => réation d'un nouvel objet carte pour chaque nouvelle carte
				 */
				
				carte.idDeLaCarte = idDeCartes.get(j);
				carte.nomDeLaCarte = nomsDeCartes.get(j)+" de "+typesDeCartes.get(j);
				carte.typeDeLaCarte = typesDeCartes.get(j);
				carte.valeurDeLaCarte = valeursDeCartes.get(j);
				// carte.imageDeLaCarte = __;
				
				// - - [ Afficher les cartes ] - - //
				System.out.println("- - - - - - - - - - - - -");
				System.out.println("Nouvelle carte : ");
				System.out.println("Carte ID : "+carte.idDeLaCarte);
				System.out.println("Carte Nom : "+carte.nomDeLaCarte);
				System.out.println("Carte Type : "+carte.typeDeLaCarte);
				System.out.println("Carte Valeur : "+carte.valeurDeLaCarte);
				// System.out.println("Carte ID : "+carte.imageDeLaCarte+"\n");
			}
		}
		
	}
	
}
