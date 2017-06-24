import java.util.ArrayList;
public class Concessionario
{
  private String nome;
  private double contoBancaConcessionario;
  private ArrayList<Auto> car =new ArrayList <Auto>();

  public Concessionario(String nome,double contoBancaConcessionario)
  {
    this.nome=nome;
    this.contoBancaConcessionario=contoBancaConcessionario;
  }
  public String getNome()
  {
    return this.nome;
  }
  public double getContoConcessionario()
  {
    return this.contoBancaConcessionario;
  }
  public void aumentoConcoConcessionario(double prezzoMacchinaVenduta)
  {
    this.contoBancaConcessionario =+ prezzoMacchinaVenduta;
  }
  public void decrementoContoConcessionario(double prezzoMacchinaAcquistata)
  {
    this.contoBancaConcessionario =- prezzoMacchinaAcquistata;
  }
  public void rimuoviAutoConcessionario(Auto venduta)
  {
    car.remove(venduta);
  }
  public void aggiungiAutoConcessionario(Auto acquistata)
  {
    car.add(acquistata);
  }
  public int numeroAuto()
  {
    return car.size();
  }
  public double prezzoTotaleAuto()
  {
    double prezzoTotale=0;
    for (Auto auto: car)
    {
      prezzoTotale=prezzoTotale + auto.getPrezzo();

    }
    return prezzoTotale;
  }

}
