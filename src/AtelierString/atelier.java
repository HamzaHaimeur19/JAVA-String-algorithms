package AtelierString;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

public class atelier {
	
	public static void main (String [] args) {
		//1 caractere d'un indice d'une chaine
		
		String chaine = "Hello friends";
		int pos = 1;
		char car = chaine.charAt(pos);
		
		System.out.println("le caractere a la position " + pos + " est " + car);
		
		// obtenir code ASCII
		
		int codeASCII = (int) chaine.charAt(pos);
		System.out.println(" code ascii" + " de " + car + " est " + codeASCII);
		
		// nombre de caracteres d'une chaine
		int nbrCaracteres = chaine.length();	
		System.out.println("nbr de caracteres de la chaine " + chaine + " est " +nbrCaracteres);
		
		//comparer deux chaines 
		       String chaine2 = "HELLO FRIENDS";

				
				int comparaison = chaine.compareTo(chaine2);
				
				if(comparaison == 0) {
					System.out.println(chaine + " est egal a " + chaine2);
				} else {
					System.out.println("les deux chaines ne sont pas egaux");
					
				}
		
		//comparer deux chaines (ignorer case)
		
		
		int comparaisonIgnoreCase = chaine.compareToIgnoreCase(chaine2);
		
		if(comparaisonIgnoreCase == 0) {
			System.out.println(chaine + " est egal a " + chaine2);
		} else {
			System.out.println("les deux chaines ne sont pas egaux");
			
		}
		
		//concatener deux chaine
		
		String string1 = "Exercices PHP et ";
		String string2 = "Exercices Python";
		
		
		
		System.out.println(string1+=string2); //pour ne pas créer un nouveau objet
		
		
		// tester chaine donnee
		
		boolean test = string1.contains("et");
		
		System.out.println("Resultat: " + test);
		
		
		// créer objet String avec contenu d'un tableau de caracteres
		
		char [] tab = {'h', 'a', 'm', 'z' , 'a' };
		
		String nvchaine = new String(tab);
		
		System.out.println(nvchaine);
		
		// chaine donnee se termine par contenu d'autre chaine
		String terminc = "on";
		
		System.out.println(string2 + " se termine par " + "? " +string2.endsWith(terminc));
		
		//comparer chaine donnee a une autre chaine, en ignorant diff de casse
		
		String string3 = "Stephen Edwin King";
		String string4 = "Walter Winchell";
		String string5 = "walter winchell";
		
		boolean compareStrings = string4.equalsIgnoreCase(string5);
		
		System.out.println(string4 + " equivaut a " + string5 + "? " + compareStrings);
		
		// imprimer date et heure
		Date date = new Date();
	    SimpleDateFormat formatter = new SimpleDateFormat("d MMMM yyyy HH'h' mm");
	    String formattedDate = formatter.format(date);
	    System.out.println("Date et heures actuelles: " + formattedDate);

	    
	    // chaine sous forme de tableau
	    
	    String newstring = "My name is Hamza";
	    
	    char [] newchar = newstring.toCharArray();
	    
	    System.out.println(newchar);
	    
	    // identifiant unique
	    String java = "les exercices java";
	    Random random = new Random();
	    
	    int id =random.nextInt();
	    
	    System.out.println("l'identifiant de " + java + " est " + id);
	    
	    //longueur chaine
	    
	    String chainelong = "fefefefefsdzdezdezdezf";
	    
	    System.out.println("La longueur de la chaîne de caractères de " + chainelong+ " est " + chainelong.length());
	    
	    // convertir miniscule
	    
	    String chaineoriginale = "Le Renard BruN Est Très Rapide!";
	    
	    String chaineminiscule = chaineoriginale.toLowerCase();
	    String chainemajuscule = chaineoriginale.toUpperCase();
	    
	    System.out.println("Chaîne en minuscules : " +chaineminiscule);
	    System.out.println("Chaîne en majuscules : " +chainemajuscule);
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
	}

}
