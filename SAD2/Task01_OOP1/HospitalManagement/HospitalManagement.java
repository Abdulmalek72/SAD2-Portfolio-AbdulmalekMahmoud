import java.util.ArrayList;

public class HospitalManagement {
    private ArrayList<Patient> patients = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Nurse> nurses = new ArrayList<>();
    private ArrayList<Admin> admins = new ArrayList<>();
    private ArrayList<Appointment> appointments = new ArrayList<>();
    private ArrayList<Room> rooms = new ArrayList<>();

    public void addPatient(Patient p) { patients.add(p); }
    public void addDoctor(Doctor d) { doctors.add(d); }
    public void addNurse(Nurse n) { nurses.add(n); }
    public void addAdmin(Admin a) { admins.add(a); }
    public void addRoom(Room r) { rooms.add(r); }



    public void listPatients() {
        System.out.println("---- Patients ----");
        for (Patient p : patients) System.out.println(p);
    }

    public void listDoctors() {
        System.out.println("---- Doctors ----");
        for (Doctor d : doctors) System.out.println(d);
    }

    public void listRooms() {
        System.out.println("---- Rooms ----");
        for (Room r : rooms) System.out.println(r);
    }
}