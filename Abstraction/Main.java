import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

      Dog dog = new Dog("wolf","Small",10.5);
      dog.makeNoise();
      doAnimalStuff(dog);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Sphered","large",50));
        animals.add(new Fish("GoldFish","Small",0.25));
        animals.add(new Dog("Rockweiler","large",50));
        animals.add(new Fish("Hilsa","Small",1.252));
        animals.add(dog);
        animals.add(new Horse("Xyz","Large",500));

        for(Animal animal:animals)
        {
            doAnimalStuff(animal);
            if(animal instanceof Mammal mammal)
            {
                mammal.shedHairs();
            }
        }


    }

    private static void doAnimalStuff(Animal animal)
    {
        animal.makeNoise();
        animal.move("slow");



        // we can't create the object of the abstract class but that doesn't stop us from using type in methods,lists
        // this is what makes our code more flexible and scalable
    }
}