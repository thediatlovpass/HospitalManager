public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.add(new Doctor("Jan","Kowalski",16000,5000));
        hospital.add(new Nurse("Anissa","Kate",8000,10));
        hospital.add(new Nurse("Lisa","Boyle",8000,10));

        hospital.getInfo();
    }
}
