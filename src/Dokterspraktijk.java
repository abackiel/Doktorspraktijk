public class Dokterspraktijk {
    Persoon patient1, patient2, patient3;

    public Dokterspraktijk(Persoon p1, Persoon p2, Persoon p3){
        patient1 = p1;
        patient2 = p2;
        patient3 = p3;
    }

    public double berekenGemiddeldeBMI(){
        double avg = (patient1.berekenBMI()
                + patient2.berekenBMI()
                + patient3.berekenBMI()) / 3;
        return avg;
    }

    public int nummerPatientenBMIMeerDan30(){
        int teller = 0;
        if(patient1.berekenBMI() >= 30) teller ++;
        if(patient2.berekenBMI() >= 30) teller ++;
        if(patient3.berekenBMI() >= 30) teller ++;
        return teller;
    }
}
