public class Persoon {
    //instance variables: data to store about people
    double lengte;
    double gewicht;
    String naam;
    //Constructor: to create new People
    public Persoon(String pNaam, double pLengte, double pGewicht){
        naam = pNaam;
        lengte = pLengte;
        gewicht = pGewicht;
    }
    //methods: what can a person do?
    public double berekenBMI(){
        double bmi = gewicht / (lengte*lengte);
        return bmi;
    }

}
