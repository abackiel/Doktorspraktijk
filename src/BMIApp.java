public class BMIApp {
    public static void main(String[] args){
        Persoon aimee = new Persoon("Aimée",1.68,80);
        double aimeeBMI = aimee.berekenBMI();
        System.out.println(aimee.naam + "'s BMI is " + aimeeBMI);

        Persoon john = new Persoon("John",1.82,110);
        Persoon susan = new Persoon("Susan",1.54,68);

        Dokterspraktijk myOffice = new Dokterspraktijk(aimee,john,susan);
        System.out.println("Gemiddelde BMI is: " + myOffice.berekenGemiddeldeBMI());

        System.out.println("Er zijn " + myOffice.nummerPatientenBMIMeerDan30() + " patiënten met BMI >= 30");
    }
}
