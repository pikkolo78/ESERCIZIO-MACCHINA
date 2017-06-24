public class EsercizioMacchina
{
   public static void main (String[] args)
   {
    Concessionario concessionario = new Concessionario("SA.PU. CAR",50000);
    Benzinaio ip=new Benzinaio("Ip",1000,1.45,7500);
    Auto automobile1= new Auto("ford","fiesta",25,6500);
    Auto automobile2= new Auto("fiat","bravo",32,10000);
    Auto automobile3= new Auto("fiat","panda",37,5000);
    Auto automobile4= new Auto("ford","focus",33,4378);
    Auto automobile5= new Auto("fiat","500",39,5674);
    Auto automobile6= new Auto("seat","ibiza",15,5768);
    Auto automobile7= new Auto("fiat","bravo",25,2940);

    //Cliente mario= new Cliente("mario","rossi",15000);
    //mario.aggiungiAutoCliente(automobile1);
  //  mario.stampaInfoCliente();
    Cliente antonio =new Cliente("antonio","dacc",10000);
    concessionario.aggiungiAutoConcessionario(automobile5);
  concessionario.aggiungiAutoConcessionario(automobile3);
    concessionario.aggiungiAutoConcessionario(automobile2);

    antonio.stampaInfoCliente();
    //ip.stampaInfoRifornimento();
    antonio.aggiungiAutoCliente(automobile1);
    antonio.stampaInfoCliente();
    System.out.println(concessionario.numeroAuto());
    System.out.println("il prezzo totale auto e': "+ concessionario.prezzoTotaleAuto());


   }

   /*public static void clienteCompraMacchina(Cliente compra,Auto daComprare,Concessionario macchinaDaVendere)
   {


   }*/













   public static void cornicetta()
   {
       System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
   }










}
