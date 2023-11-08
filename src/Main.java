import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Elefant elefant = new Elefant("Elefantul Ram", 11);
        elefant.adaugaAliment("iarba");
        elefant.adaugaAliment("fructe");
        zoo.adaugaAnimal(elefant);

        Lup lup = new Lup("Lupul Ram", 3);
        lup.adaugaAliment("carne");
        zoo.adaugaAnimal(lup);

        Leu leu = new Leu("Leul BOX", 5);
        leu.adaugaAliment("carne");
        zoo.adaugaAnimal(leu);

        Jaguar jaguar = new Jaguar("Jaguarul Jaggy", 7);
        jaguar.adaugaAliment("carne");
        zoo.adaugaAnimal(jaguar);

        Zebra zebra = new Zebra("Zebra Marta", 12);
        zebra.adaugaAliment("iarba");
        zoo.adaugaAnimal(zebra);

        zoo.afiseazaAnimale();

    }
}