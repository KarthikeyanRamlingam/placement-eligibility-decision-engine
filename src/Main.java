
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("percentage: ");
        double percentage = scanner.nextDouble();
        System.out.print("Backlogs: ");
        int backlogs = scanner.nextInt();
        System.out.print("pass year: ");
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);

        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);
        //check the percentage
        boolean percentagePass = candidate.getPercentage() >= job.getMinimumPercentage();
        //check blacklog
        boolean backlogPass = candidate.getBacklogs() <= job.getMaximumBacklogs();
        //check year
        boolean yearPass = candidate.getGraduationYear() == job.getRequiredGraduationYear();
        //check all pass
        boolean eligible = percentagePass && backlogPass && yearPass;

        //print
        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");
        System.out.println();

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());
        System.out.println();

        //pass or fail
        if (percentagePass) {
            System.out.println("Percentage      : PASS");
        } else {
            System.out.println("Percentage      : FAIL");
        }

        if (backlogPass) {
            System.out.println("Backlogs        : PASS");
        } else {
            System.out.println("Backlogs        : FAIL");
        }

        if (yearPass) {
            System.out.println("Graduation Year : PASS");
        } else {
            System.out.println("Graduation Year : FAIL");
        }
        System.out.println();
        //eligible or not
        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        // System.out.println("================================");
        // System.out.println("Minimum Percentage: " + job.getMinimumPercentage());
        // System.out.println("Maximum Backlogs: " + job.getMaximumBacklogs());
        // System.out.println("Required Graduation Year: " + job.getRequiredGraduationYear());
        //System.out.println("Percentage: " + candidate.getPercentage());
        //System.out.println("Backlogs: " + candidate.getBacklogs());
        //System.out.println("Graduation Year: " + candidate.getGraduationYear());
        scanner.close();
    }
}
