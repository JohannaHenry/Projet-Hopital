public class Chirurgien extends Medecin implements Operer{
  //ATTRIBUTS
  public String type_chirurgie;
  public boolean cage_thoracique;
  public boolean probleme;

  //CONSTRUCTEURS
  public Chirurgien(){
    nom_Medecin="Shepherd";
    prenom_Medecin="Derek";
    age_Medecin=40;
    sexe_Medecin="Homme";
    tab= new Patient[4];
    type_chirurgie="thoracique";
  }

  public Chirurgien(String nm, String pm, int a, String s, String t){
    super(nm, pm, a, s);
    tab= new Patient[4];
    t=type_chirurgie; //"orthopedique";
  }

  //METHODES
  public void rendre_visite(Patient p){
    super.rendre_visite(p);
  }

  public void operer_thoracique(){
    probleme=true;
    super.anesthesier(true); //anesthesie_generale=true;
    cage_thoracique=true; //La cage thoracique est ouverte
    probleme=false;
    cage_thoracique=false; //Une fois le problème réglé on referme la cage thoracique
  }

  public void operer_orthopedique(){
    super.anesthesier(true); //anesthesie_generale=true;
  }

}
