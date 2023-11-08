import java.util.*;
import java.util.ArrayList;

// Clasa de baza Animal
class Animal {
    String nume;
    int varsta;
    List<String> alimente = new ArrayList<>();
    private String aliment;

    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void adaugaAliment(String aliment) {
        this.aliment = aliment;
        alimente.add(aliment);
    }
}

// Clasa Elefant extinde Animal
class Elefant extends Animal {
    public Elefant(String nume, int varsta) {
        super(nume, varsta);
    }
}

// Clasa Lup extinde Animal
class Lup extends Animal {
    public Lup(String nume, int varsta) {
        super(nume, varsta);
    }
}

// Clasa Leu extinde Animal
class Leu extends Animal {
    public Leu(String nume, int varsta) {
        super(nume, varsta);
    }
}

// Clasa Jaguar extinde Animal
class Jaguar extends Animal {
    public Jaguar(String nume, int varsta) {
        super(nume, varsta);
    }
}

// Clasa Zebra extinde Animal
class Zebra extends Animal {
    public Zebra(String nume, int varsta) {
        super(nume, varsta);
    }
}

// Clasa Zoo
class Zoo {
    List<Animal> animale = new ArrayList<>();

    public void adaugaAnimal(Animal animal) {
        animale.add(animal);
    }

    public void afiseazaAnimale() {
        for (Animal animal : animale) {
            System.out.println("Nume: " + animal.nume);
            System.out.println("Varsta: " + animal.varsta);
            System.out.println("Prefera sa manance: " + animal.alimente);
                     System.out.println();
        }
    }
}
