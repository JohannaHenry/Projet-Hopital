public class Interne extends Medecin{
  //ATTRIBUTS

  //CONSTRUCTEURS
  public Interne(){
    nom_Medecin="Grey";
    prenom_Medecin="Lexie";
    age_Medecin=20;
    sexe_Medecin="Femme";
    tab= new Patient[0];
  }

  public Interne(String nm, String pm, int a, String s){
    super(nm, pm, a, s);
    tab= new Patient[0];
  }

  public void rendre_visite(Patient p){
    super.rendre_visite(p);
  }


}
