//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details like rateofinterest etc,print details of every banks
public class Eleventh {
    public static void main(String[] args) {
        Eleventh_ICICI ICICI=new Eleventh_ICICI();
        ICICI.getDetails();
        Eleventh_SBI SBI=new Eleventh_SBI();
        SBI.getDetails();
        Eleventh_BOI BOI=new Eleventh_BOI();
        BOI.getDetails();
    }
}

