public class Orange{


  Double prix;

  String origine;


  //Constructeur
  public Orange(Double nprix, String norigine){

    //System.out.println("Test Création !");
    this.prix = nprix;
    this.origine = norigine;

  }

// les getteurs
  public String getOrigine()
  {
    return this.origine;
  }

  public Double getPrix()
  {
    return this.prix;
  }

// les setteurs
  public void setOrigine(String nOrigine)
  {
    this.origine = nOrigine;
  }

  public void setPrix(Double nPrix)
  {
    prix = nPrix;
  }

  public static void main(String[] args){

    Orange Orangeverte=new Orange(2.50, "Cameroun");
    Double prix=Orangeverte.getPrix();
    String origine=Orangeverte.getOrigine();
    System.out.println("le prix de l'Orange est et son origine est");

  }//Fin de la méthode main


}//Fin de votre classe
