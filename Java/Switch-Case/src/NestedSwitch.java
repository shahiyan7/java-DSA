import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the empID and department");
        int empID=in.nextInt();
        Scanner dep=new Scanner(System.in);
        String department=dep.nextLine();
        switch (empID){
            case 1:
                System.out.println("Shahiyan Khan");
                break;
            case 2:
                System.out.println("Ayan Khan");
                break;
            case 3:
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("Enter the valid department");
                }
                break;
            default:
                System.out.println("Enter the valid empID");
        }
    }
}
