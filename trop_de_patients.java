public class trop_de_patients extends Exception{
  public String toString(){
    return "Le médecin a trop de patients !";
  }

  public void message(){
    System.out.println("Nombre maximal de patient(s) déjà atteint, impossible d'ajouter un nouveau patient !");
  }

}
