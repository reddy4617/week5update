public class Bread {
    Wrapped raped;
    Baked baked;
    Order order;

    State bread;
    int count = 0;

    public Bread()
    {
        order = new Order(this);
        raped = new Wrapped(this);
        baked = new Baked(this);

        bread = order;
    }

    public void Ready() {
        bread.AmericanBread_Ready();
    }

    public void Not_Ready() {
        bread.AmericanBread_NotReady();
    }

    public void setBread(State bread) {
        this.bread = bread;
    }

    public Wrapped getRaped() {
        return raped;
    }

    public Baked getBaked() {
        return baked;
    }

    public Order getOrder() {
        return order;
    }

    public State getBread() {
        return bread;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\"Welcome to American Bread Breakfast\"");
        if (count != 1) {
            result.append("");
        }
        result.append("\n");
        return result.toString();
    }
}