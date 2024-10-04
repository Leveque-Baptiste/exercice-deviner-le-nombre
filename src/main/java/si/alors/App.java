package si.alors;

import java.util.Random;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
    Scanner clavier = new Scanner(System.in);
    //System.out.println("nb vente :");
    //int nbvente = clavier.nextInt();
    //if (nbvente >=10){
    //    System.out.println("Félicitations cous avez fait " + nbvente);
    //}
    //else{
    //    int nbventemanque=10-nbvente;
    //    System.out.println("Il manque " + nbventemanque + " pour ateindre le quota.");
    //}
    Random randomNumbers = new Random();
    int nbrandom= (randomNumbers.nextInt(100)+1);
    System.out.println("Un nombre à été chosis aléatoirement entre 1 et 100? deviner lequel : ");
    int nbchoisi = clavier.nextInt();
    System.out.println("Vous avez chosi : " + nbchoisi);
    if (nbrandom == nbchoisi){
        System.out.println("Bravo vous avez gagner");
    }
    else{
        int nbdistance = nbchoisi - nbrandom ;
        if (nbdistance<0){
            nbdistance=nbdistance*(-1);
        }
        if(nbchoisi>nbrandom){
            System.out.println("Dommage le nombre était " + nbrandom + " avait dépasser de " + nbdistance );
        }
        else{
            System.out.println("Dommage le nombre était " + nbrandom + " il vous manque " + nbdistance);
        }
        
    }
    }
    
}
