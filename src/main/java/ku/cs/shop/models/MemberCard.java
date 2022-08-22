package ku.cs.shop.models;

public class MemberCard {
    private String name;
    private String phone;
    private double cumulativePurchase;
    private int stamp;
    public MemberCard(String name, String phone, int stamp) {
        this.name = name;
        this.phone = phone;
        this.stamp = stamp;
        cumulativePurchase = 0;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public double getCumulativePurchase() {
        return cumulativePurchase;
    }

    public int getStamp() {
        return stamp;
    }

    public void addPurchase(double purchase) {
        cumulativePurchase += purchase;
        stamp += purchase / 50;
    }

    public boolean useStamp(int stamp) {
        if (this.stamp >= stamp && stamp > 0) {
            this.stamp -= stamp;
            return true;
        }
        return false;
    }

    public MemberCard(String name, String phone) {
        this(name, phone, 0);
    }

    @Override
    public String toString() {
        return name + " [" + stamp + " point]";
    }

    @Override
    public boolean equals(Object obj){
        if ( obj instanceof MemberCard) {
            MemberCard m = (MemberCard) obj;
            if (m != null) {
                if (name.equals(m.name) && phone.equals(m.phone)) {
                    return true;
                }
            }
        }
        return false;
    }
}
