package Package1;
public class Main {
        
    public static void main(String[] args) {
        Report r1 = new Report(456,"good","Marzia");
        System.out.println("Doctor Activities--->>");
        Doctor d1 = new Doctor();
        d1.checkingReport(r1);
        System.out.println("Nurse Activities--->>");
        Nurse n1 = new Nurse();
        n1.checkingReport(r1);
        System.out.println("Patient Activities--->>");
        Patient pt1 = new Patient();
        pt1.checkingReport(r1);
        Prescription p1 = new Prescription(12356,2);
        System.out.println("Senior Doctor Activities--->>");
        SeniorDoctor sd1= new SeniorDoctor();
        sd1.writePresciption(p1);
        System.out.println("Juniour Doctor Activities--->>");
        JuniorDoctor jd1 = new JuniorDoctor();
        jd1.writePresciption(p1);
        jd1.writePresciption();
    }
    
}
