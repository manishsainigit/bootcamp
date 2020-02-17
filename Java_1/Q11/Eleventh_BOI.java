public class Eleventh_BOI extends Eleventh{
    private static double rate =6.0;
    private static String Name="Welcome BOI Bank";

    public double getRate() {
        return rate;
    }

    public String getName() {
        return Name;
    }
    public void getDetails()
    {
        System.out.println(getName());
        System.out.println("Rate of interest: "+getRate());
    }
}
