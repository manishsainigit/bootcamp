public class Eleventh_SBI extends Eleventh{
    private static double rate = 5.0;
    private static String Name="Welcome SBI Bank";

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
