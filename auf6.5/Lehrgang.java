public class Lehrgang
{
   public static void main(String[] args)
   {
      Teilnehmer teilnehmer1;
      Teilnehmer teilnehmer2;
      Teilnehmer teilnehmer3;
      Teilnehmer teilnehmer4;
      Teilnehmer teilnehmer5;
      
      teilnehmer1 = new Teilnehmer();
      teilnehmer2 = new Teilnehmer();
      teilnehmer3 = new Teilnehmer();
      teilnehmer4 = new Teilnehmer();
      teilnehmer5 = new Teilnehmer();

      teilnehmer1.name           = "Berschneider";
      teilnehmer1.vorname        = "Marc Anton";
      teilnehmer1.alter          = 31;
      teilnehmer1.fachrichtung   = "Anwendungsentwicklung";

      teilnehmer2.name           = "Hinz";
      teilnehmer2.vorname        = "Patrick";
      teilnehmer2.alter          = 45;
      teilnehmer2.fachrichtung   = "Anwendungsentwicklung";

      teilnehmer3.name           = "Salihovic";
      teilnehmer3.vorname        = "Mirza";
      teilnehmer3.alter          = 30;
      teilnehmer3.fachrichtung   = "Systemintegration";

      teilnehmer4.name           = "Aleric";
      teilnehmer4.vorname        = "Ivana";
      teilnehmer4.alter          = 39;
      teilnehmer4.fachrichtung   = "Anwendungsentwicklung";

      teilnehmer5.name           = "Arenas";
      teilnehmer5.vorname        = "Maximiliano";
      teilnehmer5.alter          = 47;
      teilnehmer5.fachrichtung   = "Anwendungsentwicklung";

      System.out.println("");
      System.out.printf("%15s "  + " %15s " + " %2d " + " %15s" + "\n", teilnehmer1.name, teilnehmer1.vorname, teilnehmer1.alter,teilnehmer1.fachrichtung);
      System.out.printf("%15s "  + " %15s " + " %2d " + " %15s" + "\n", teilnehmer2.name, teilnehmer2.vorname, teilnehmer2.alter,teilnehmer2.fachrichtung);
      System.out.printf("%15s "  + " %15s " + " %2d " + " %15s" + "\n", teilnehmer3.name, teilnehmer3.vorname, teilnehmer3.alter,teilnehmer3.fachrichtung);
      System.out.printf("%15s "  + " %15s " + " %2d " + " %15s" + "\n", teilnehmer4.name, teilnehmer4.vorname, teilnehmer4.alter,teilnehmer4.fachrichtung); 
      System.out.printf("%15s "  + " %15s " + " %2d " + " %15s" + "\n", teilnehmer5.name, teilnehmer5.vorname, teilnehmer5.alter,teilnehmer5.fachrichtung);
      System.out.println("");
   }
}