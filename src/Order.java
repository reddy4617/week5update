public class Order  implements State{

    Bread bread;

    public Order(Bread bread) {
        this.bread = bread;
    }

    @Override
    public void AmericanBread_Ready() {
        System.out.println("Your order of Bread is Start.");
    }

    @Override
    public void AmericanBread_NotReady() {
        System.out.println("Your order of Bread is Stop.");
    }
}
