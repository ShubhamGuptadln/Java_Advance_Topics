public class Dog extends Mammal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHairs() {
        System.out.println(getExplicitType() + "shed Hairs all time");
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow"))
        {
            System.out.println("Walking");
        }
        else {
            System.out.println("Running");
        }

    }

    @Override
    public void makeNoise() {
        if (type.equals("wolf"))
        {
            System.out.println(getExplicitType()+" Howling! ");
        }
        else {
            System.out.println(getExplicitType()+" woof! ");
        }

    }
}
