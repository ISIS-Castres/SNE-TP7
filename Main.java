import java.util.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Collections = HaspMap");


  }
  /*
   * initialiser un référentiel d'actes
   * données : 
   * résultats : 
   */


  /*
   * afficher un référentiel d'actes
   * données : 
   * résultats : 
   */


  /*
   * chercher le libellé d'un acte
   * données : 
   * résultats : 
   */
 

  /*
   * saisie d'un code acte au clavier
   * données : aucune -> paramètre -> aucun
   * résultats : un code -> valeur de retour -> String
   */
  public static String saisieCodeClavier() {
    Scanner sc = new Scanner(System.in);
    System.out.print("un code d'acte ? : ");
    return sc.next();
  }

  /*
   * saisie du choix de poursuivre la recherche ou pas
   * données : aucune -> paramètre -> aucun
   * résultats : vrai si continuer, faux sinon -> valeur de retour -> boolean
   */
  public static boolean saisieContinuer() {
    Scanner sc = new Scanner(System.in);
    System.out.print("nouvelle recherche (O/N) ? : ");
    return (sc.next().equals("O"));
  }
}