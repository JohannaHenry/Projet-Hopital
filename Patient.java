public class Patient{
  //ATTRIBUTS
  protected String nom_Patient;
  protected String prenom_Patient;
  protected String date_naissance;
  protected boolean allergique;

  //CONSTRUCTEURS
  public Patient(String n, String p, String d, boolean al){
    nom_Patient=n;
    prenom_Patient=p;
    date_naissance=d;
    allergique=al;
  }

  public Patient(){
    nom_Patient="Masure";
    prenom_Patient="Elodie";
    date_naissance="21/07/98";
    allergique=false;
  }

  //METHODES
  public void caracteristiques_Patient(){ //afficher
    System.out.println("Le nom du patient est: "+nom_Patient);
    System.out.println("Le prénom du patient est: "+prenom_Patient);
    System.out.println("La date de naissance du patient est: "+date_naissance);
    System.out.println("Patient allergique à l'anesthesie : "+allergique);
  }

    public boolean equals(Patient pat){
    if (nom_Patient==pat.nom_Patient && prenom_Patient==pat.prenom_Patient && date_naissance==pat.date_naissance) {
      System.out.println("Ce sont les mêmes patients");
      return true;
    }
    else {
      System.out.println("Ce ne sont pas les mêmes patients");
      return false;
    }
  }


}
