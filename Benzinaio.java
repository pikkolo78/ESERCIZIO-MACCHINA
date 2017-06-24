public class Benzinaio
{
private String nomeRifornimento;
private double litriSerbatoio;
private double prezzoBenzina;
private double contoBancaBenzianaio;
   public Benzinaio(String nomeRifornimento,double litriSerbatoio,double prezzoBenzina,double contoBancaBenzianaio)
   {
     this.nomeRifornimento=nomeRifornimento;
     this.litriSerbatoio=litriSerbatoio;
     this.prezzoBenzina=prezzoBenzina;
     this.contoBancaBenzianaio=contoBancaBenzianaio;
   }
   public double getLitriSerbatoio()
   {
     return this.litriSerbatoio;
   }
   public double getPrezzoBenzina()
   {
     return prezzoBenzina;
   }
   public double getcontoBanca()
   {
     return contoBancaBenzianaio;
   }

   public void aumentoContoRifornimento(double litrivenduti)
   {
     double ricavato=this.prezzoBenzina*litrivenduti;
     this.contoBancaBenzianaio =+ ricavato;
   }
   public void dimimuisciLitriSerbatoio(double litrivenduti)
   {
     this.litriSerbatoio =- litrivenduti;
   }
   public void stampaInfoRifornimento()
   {
     EsercizioMacchina.cornicetta();
     System.out.println("Nome rifornimento: "+ this.nomeRifornimento);
     System.out.println("Litri benzina: "+getLitriSerbatoio() +" "+"Prezzo benzina: " +getPrezzoBenzina());
     System.out.println("Conto bancario: " + getcontoBanca());
     EsercizioMacchina.cornicetta();
   }



}
