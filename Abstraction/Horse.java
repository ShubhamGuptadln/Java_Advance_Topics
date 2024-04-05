public class Horse extends Mammal{
    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void shedHairs() {
        System.out.println(getExplicitType() + "shed hairs in spring");

    }



    @Override
    public void makeNoise() {

    }


}
