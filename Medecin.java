public class Medecin{
  //ATTRIBUTS
  protected String nom_Medecin;
  protected String prenom_Medecin;
  protected int age_Medecin;
  protected String sexe_Medecin;
  protected Patient tab[];
  protected int nbpat;
  protected boolean anesthesie_generale;
  //protected boolean visite;

  //CONSTRUCTEURS
  public Medecin(){
    nom_Medecin="Lemaire";
    prenom_Medecin="Philippe";
    age_Medecin=50;
    sexe_Medecin="Homme";
    tab = new Patient[4];
  }

  public Medecin(String nm, String pm, int a, String s){
    nom_Medecin= nm;
    prenom_Medecin= pm;
    age_Medecin=a;
    sexe_Medecin=s;
    tab= new Patient[5];
  }

  //METHODES
  public void caracteristiques_medecin(){ //afficher_medecin
    System.out.println("Le nom du medecin est : "+nom_Medecin);
    System.out.println("Le prénom du medecin est : "+prenom_Medecin);
    System.out.println("L'âge du medecin est : "+age_Medecin);
    System.out.println("Le medecin est un(e): "+sexe_Medecin);
    System.out.print("Le medecin a "+nbpat+" patient(s).");
    int j;
    for (j=0;j<nbpat;j++){
      tab[j].caracteristiques_Patient();
    }
    System.out.println();
  }

  public void ajouterPatient(Patient p){
    if (nbpat<=4){
      tab[nbpat]=p;
      nbpat++;
    }
  }

  public void ajouterPatient2(Patient p) throws trop_de_patients{
    if (nbpat<=4){
      tab[nbpat]=p;
      nbpat++;
    }
    else {
      throw new trop_de_patients();
    }
  }

  public void retirerPatient(Patient p){
    int i;
    for (i=0;i<nbpat;i++){
      if (tab[i].equals(p)==true){
        //tab[i]=null;
        tab[i]=tab[nbpat-1];
        tab[nbpat-1]=null;
      }
    }
  }

  public void rendre_visite(Patient p){
    //v=true;
    System.out.println("Le médecin a rendu visite à ce(tte) patient(e) !");
  }


  public void anesthesier(boolean g){
    if (g==true){
      anesthesie_generale=g;
    }
    else {
      anesthesie_generale=false;
    }
  }


}
