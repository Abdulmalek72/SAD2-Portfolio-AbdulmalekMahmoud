public class Main {
    public static void main(String[] args) {
        HospitalManagement hm = new HospitalManagement();

        Patient p1 = new Patient("001", "Ali Mohamed", "ali@gmail.com", "0100000001");
        Doctor d1 = new Doctor("101", "Hossam", "hossam@gmail.com", "0111111111", "Cardiology");
        Nurse n1 = new Nurse("201", "Nour", "nour@gmail.com", "0122222222");
        Admin a1 = new Admin("301", "Mona", "mona@gmail.com", "0133333333");

        hm.addPatient(p1);
        hm.addDoctor(d1);
        hm.addNurse(n1);
        hm.addAdmin(a1);
        hm.addRoom(new Room("R-1", "General"));
        hm.addRoom(new Room("R-2", "ICU"));

        n1.assignPatient(p1);
        n1.recordVitals(p1, "BP:120/80, Temp:36.6");
        d1.writePrescription(p1, "Paracetamol", "500mg", "3 days");

        hm.listPatients();
        hm.listDoctors();
        hm.listRooms();
        p1.viewMedicalRecord();
    }
}