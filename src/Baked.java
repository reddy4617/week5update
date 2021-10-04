public class Baked implements State{
    Bread bread;

    public Baked(Bread bread) {
        this.bread = bread;
    }

    @Override
    public void AmericanBread_Ready() {
        System.out.println("Your Bread Order will be Served.");
    }

    @Override
    public void AmericanBread_NotReady() {
        System.out.println("Bread has Served.");
    }
}
