public class Obstetricien extends Medecin{
  //ATTRIBUTS

  //CONSTRUCTEURS
  public Obstetricien(){
    nom_Medecin="Fields";
    prenom_Medecin="Lucy";
    age_Medecin=30;
    sexe_Medecin="Femme";
    tab= new Patient[3];
  }

  public Obstetricien(String nm, String pm, int a, String s){
    super(nm, pm, a, s);
    tab= new Patient[3];
  }

  //METHODES
  public void ajouterPatient(Patient pa){
    if (pa instanceof FemmeEnceinte && ((FemmeEnceinte)pa).getChambre_reserve()==true && nbpat<=3){
      super.ajouterPatient(pa);
    }
    if (nbpat>3){
      System.out.println("Impossible de suivre une patiente de plus");
    }
    if (((FemmeEnceinte)pa).getChambre_reserve()==false) {
      int n=nbpat+1;
      System.out.println("La patiente "+n+" n'a pas réservé de chambre");
    }
  }


  public void retirerPatient(Patient pa){
    if (((FemmeEnceinte)pa).getAccouchement_fini()==true){
      super.retirerPatient(pa);
    }
  }


  public void rendre_visite(Patient p){
    if (p instanceof FemmeEnceinte){
      super.rendre_visite(p);
    }
    else {
      System.out.println("Le médecin ne peut pas rendre visite à ce(tte) patient(e) !");
    }
  }


  public void cesarienne(){
    super.anesthesier(false); //anesthesie_generale=true;
  }


}
