public class Hopital{
  public static void main(String[] args){
    Patient monpatient1 = new Patient("Ozannat", "Justin", "23/12/1998",false);
    Patient monpatient2 = new Patient("Henry", "Johanna", "04/11/1998",false);
    Medecin monmedecin1 = new Medecin("Grey", "Meredith",35,"Femme");

    try {monmedecin1.ajouterPatient2(monpatient1);}
    catch (trop_de_patients tp){
      System.out.println(tp.toString());
    }

    try {monmedecin1.ajouterPatient2(monpatient2);}
    catch (trop_de_patients tp){
      System.out.println(tp.toString());
    }

    //monmedecin1.caracteristiques_medecin();

    Obstetricien monObstetricien1 = new Obstetricien("Montgomery","Addison",40,"Femme");
    FemmeEnceinte maFemmeEnceinte1 = new FemmeEnceinte("Masure", "Elodie", "21/07/1998",false,true,"24/12/2019",false);
    FemmeEnceinte maFemmeEnceinte2 = new FemmeEnceinte("Henry", "Johanna", "04/11/1998",false,false,"02/01/2020",false);

    monObstetricien1.ajouterPatient(maFemmeEnceinte1);
    monObstetricien1.ajouterPatient(maFemmeEnceinte2);
    monObstetricien1.caracteristiques_medecin();
    monObstetricien1.rendre_visite(maFemmeEnceinte1);

    Interne monInterne1 = new Interne("DeLuca","Andrew",20,"Homme");
    //Chirurgien monChirurgien1 = new Chirurgien("Sloan","Mark",40,"Homme"); 

  }
}
