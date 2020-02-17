public class Eleventh_ICICI extends Eleventh{

        private static double rate = 4.0;
        private static String Name="Welcome ICICI Bank";

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
