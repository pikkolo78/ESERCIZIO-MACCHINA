public class Cliente
{
private String nome;
private String cognome;
private double contoBanca;
private Auto autoCliente;


   public Cliente(String nome,String cognome,double contoBanca)
   {
     this.nome=nome;
     this.cognome=cognome;
     this.contoBanca=contoBanca;
   }
   public void cornicetta()
   {
     System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
   }

   public String getNome()
   {
     return this.nome;
   }

   public String getCognome()
   {
     return this.cognome;
   }

   public double getcontoBanca()
   {
     return this.contoBanca;
   }
   public void stampaInfoCliente()
   {
     cornicetta();
     System.out.println("Nome: "+ getNome());
     System.out.println("Cognome: "+ getCognome());
     System.out.println("Conto in Banca: "+ getcontoBanca());
     if (autoCliente != null)
     {
        autoCliente.stampaInfoMacchina();
     }
     else
     {
       System.out.println("nessuna auto");
     }

     cornicetta();
   }
   public void aggiungiAutoCliente(Auto clienteAcquistata)
   {
    this.autoCliente =clienteAcquistata;
   }

   public Auto rimuoviAutoCliente()
   {
    Auto personale= autoCliente;
    autoCliente = null;
    return personale;
   }

    public void aumentaContoCliente(double prezzoMacchinaVenduta)
    {
      this.contoBanca =+ prezzoMacchinaVenduta;
    }

    public void diminuisciContocliente(double prezzoMacchinaAcquistata)
    {
      this.contoBanca =- prezzoMacchinaAcquistata;
    }



}
