public class Wrapped implements State{
    Bread bread;

    public Wrapped(Bread bread) {
        this.bread = bread;
    }

    @Override
    public void AmericanBread_Ready() {
        System.out.println("Bread Wrapping Starts.");
    }

    @Override
    public void AmericanBread_NotReady() {
        System.out.println("Bread Wrapping is Done.");
    }
}
