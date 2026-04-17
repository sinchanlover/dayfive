import java.util.Scanner;

class Staff {
    private int code;
    private String name;

    public Staff() {}

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Code: ");
        code = Integer.parseInt(sc.nextLine());
        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher() { super(); }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getPublication() { return publication; }
    public void setPublication(String publication) { this.publication = publication; }

    @Override
    public void create() {
        super.create();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject: ");
        subject = sc.nextLine();
        System.out.print("Enter Publication: ");
        publication = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    public Officer() { super(); }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public void create() {
        super.create();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grade: ");
        grade = sc.nextLine();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    private int speed;

    public Typist() { super(); }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    @Override
    public void create() {
        super.create();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Speed (wpm): ");
        speed = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Speed: " + speed + " wpm");
    }
}

class RegularTypist extends Typist {
    private double remuneration;

    public RegularTypist() { super(); }

    public double getRemuneration() { return remuneration; }
    public void setRemuneration(double remuneration) { this.remuneration = remuneration; }

    @Override
    public void create() {
        super.create();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Remuneration: ");
        remuneration = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Remuneration: " + remuneration);
    }
}

class CasualTypist extends Typist {
    private double dailyWages;

    public CasualTypist() { super(); }

    public double getDailyWages() { return dailyWages; }
    public void setDailyWages(double dailyWages) { this.dailyWages = dailyWages; }

    @Override
    public void create() {
        super.create();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Daily Wages: ");
        dailyWages = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class InstitutionDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Teacher\n2. Officer\n3. Regular Typist\n4. Casual Typist");
        System.out.print("Select Type: ");
        int choice = Integer.parseInt(sc.nextLine());

        Staff person = null;

        switch(choice) {
            case 1: person = new Teacher(); break;
            case 2: person = new Officer(); break;
            case 3: person = new RegularTypist(); break;
            case 4: person = new CasualTypist(); break;
            default: System.out.println("Invalid choice"); return;
        }

        System.out.println("\n--- Create Entry ---");
        person.create();

        System.out.println("\n--- Retrieve Information ---");
        person.display();
    }
}
