public class FemmeEnceinte extends Patient{
  //ATTRIBUTS
  private boolean chambre_reserve;
  private String dateTerme;
  private boolean accouchement_fini;

  //CONSTRUCTEURS
  public FemmeEnceinte(){
    chambre_reserve=true;
    dateTerme="08/10/2019";
    accouchement_fini=true;
  }

  public FemmeEnceinte(String n, String p, String d, boolean al, boolean r, String dt, boolean a){
    super(n, p, d, al);
    chambre_reserve=r;
    dateTerme=dt;
    accouchement_fini=a;
  }

  //METHODES
  public void caracteristiques_FemmeEnceinte(){
    if (chambre_reserve==false){
      if (accouchement_fini==false){
        caracteristiques_Patient();
        System.out.println("Chambre non réservée "+dateTerme+" N'a pas accouchée");
      }
      else{
        caracteristiques_Patient();
        System.out.println("Chambre non réservée "+dateTerme+" A accouchée");
      }
    }
    else{
      if (accouchement_fini==false){
        caracteristiques_Patient();
        System.out.println("Chambre réservée "+dateTerme+" N'a pas accouchée");
      }
      else {
        caracteristiques_Patient();
        System.out.println("Chambre réservée "+dateTerme+" A accouchée");
      }
    }
  }

  public boolean getChambre_reserve(){
    return chambre_reserve;
  }

  public boolean getAccouchement_fini(){
    return accouchement_fini;
  }


}
