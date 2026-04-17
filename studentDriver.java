import java.util.Scanner;

interface Department {
    void getData();
    void printData();
}

class Hostel {
    private String hostelName;
    private String hostelLocation;
    private int noOfRooms;

    public Hostel() {}

    public void getHostelData() {
        Scanner sc = new Scanner(System.in);
        this.hostelName = sc.nextLine();
        this.hostelLocation = sc.nextLine();
        this.noOfRooms = sc.nextInt();
    }

    public void printHostelData() {
        System.out.println(hostelName + " " + hostelLocation + " " + noOfRooms);
    }
}

class Student extends Hostel implements Department {
    private String studentName;
    private int regNo;
    private String electiveSubject;
    private double avgMarks;
    private String depName;
    private String depHead;

    public Student() { super(); }

    public void getData() {
        Scanner sc = new Scanner(System.in);
        this.depName = sc.nextLine();
        this.depHead = sc.nextLine();
    }

    public void printData() {
        System.out.println(depName + " " + depHead);
    }

    public void getStudentData() {
        Scanner sc = new Scanner(System.in);
        getHostelData();
        getData();
        this.studentName = sc.nextLine();
        this.regNo = sc.nextInt();
        sc.nextLine();
        this.electiveSubject = sc.nextLine();
        this.avgMarks = sc.nextDouble();
    }

    public void printStudentData() {
        printHostelData();
        printData();
        System.out.println(studentName + " " + regNo + " " + electiveSubject + " " + avgMarks);
    }
}

class StudentDriver {
    public static void main(String[] args) {
        Student s = new Student();
        s.getStudentData();
        s.printStudentData();
    }
}
