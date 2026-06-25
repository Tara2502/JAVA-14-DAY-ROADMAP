package Practice;

public class PracticeDemo {
    public static void main(String[] args) {
        Manager manager=new Manager(1,"Tara",890000.9,"Engineering");
        manager.displayManagerInfo();

        Report report=new Report("Montly sale","Sales increased by 15% this month.");
        report.print();
    }
}
