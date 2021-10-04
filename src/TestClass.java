public class TestClass {
    public static void main(String[] args) {
        Bread bread = new Bread();
        System.out.println(bread);
        bread.setBread(new Order(bread));
        bread.Ready();

        bread.setBread(new Wrapped(bread));
        bread.Ready();
        bread.Not_Ready();

        bread.setBread(new Baked(bread));
        bread.Ready();
        bread.Not_Ready();

        bread.setBread(new Order(bread));
        bread.Not_Ready();

    }
}
