public class Auto
{
  private String marcaAuto;
  private String modelloAuto;
  private double litriBenzina;
  private double prezzoAuto;
  public Auto (String marcaAuto,String modelloAuto,double litriBenzina,double prezzoAuto)
  {
  this.marcaAuto= marcaAuto;
  this.modelloAuto= modelloAuto;
  this.litriBenzina=  litriBenzina;
  this.prezzoAuto= prezzoAuto;
  }
  public double getPrezzo()
  {
    return this.prezzoAuto;
  }
  public void stampaInfoMacchina()
  {
    System.out.println("Macchina: "+this.marcaAuto + " "+ this.modelloAuto);
    System.out.println("Litri benzina: "+ this.litriBenzina);

  }

}
