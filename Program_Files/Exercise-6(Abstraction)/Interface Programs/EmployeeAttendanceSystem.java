interface Attendance {
    void markAttendance();
}

class BiometricAttendance implements Attendance {
    public void markAttendance() {
        System.out.println("Attendance marked using fingerprint scanner.");
    }
}

class RFIDAttendance implements Attendance {
    public void markAttendance() {
        System.out.println("Attendance marked using RFID card.");
    }
}

public class EmployeeAttendanceSystem {
    public static void main(String[] args) {
        Attendance bio = new BiometricAttendance();
        Attendance rfid = new RFIDAttendance();

        bio.markAttendance();
        rfid.markAttendance();
    }
}
