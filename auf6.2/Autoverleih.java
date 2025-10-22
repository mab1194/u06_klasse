// loe06_klasse
// auf6.1

public class Autoverleih
{
   public static void main(String[] args)
   {
      Auto auto1;
      Auto auto2;
      Auto auto3;
      Kunde kunde1;
   
      auto1 = new Auto();
      auto2 = new Auto();
      auto3 = new Auto();
      kunde1 = new Kunde();

      auto1.autonummer = "HH-MB-194";
      auto2.autonummer = "HH-BA-158";
      auto3.autonummer = "HH-MA-111";
      kunde1.name      = "Schindler";
      

      auto1.tagespreis = 60;
      auto2.tagespreis = 50;
      auto3.tagespreis = 70;
      
      auto1.farbe = Farbe.schwarz;
      auto2.farbe = Farbe.blau;
      auto3.farbe = Farbe.gelb;

      

      
      // Hier soll der Programmcode stehen, mit dem neue
      // Auto-Objekte erzeugt und den deklarierten Variablen
      // auto1, auto2 und auto3 zugewiesen werden.
      
      // Hier soll der Programmcode stehen, mit dem den
      // Auto-Objekten die vorgesehenen Attributwerte
      // zugewiesen werden.
      
      // Die folgende Zeile darf nicht veraendert werden:
      Darsteller.zeige(auto1, auto2, auto3, kunde1);
   }
}