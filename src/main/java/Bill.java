import java.util.Scanner;

public class Bill {
    int hours;
    int minutes;
    double rate;


    public void inputTimeWorked(){
        System.out.println("Enter number of full hours worked\n" +
                "\n" + "followed by number of minutes:");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();
        minutes = scanner.nextInt();

        System.out.println("Time worked: /n" + hours + "hours and " + minutes + "minutes");

        System.out.println("Enter your rate: ");
        rate = scanner.nextDouble();


    }

    public void updateFee(){
        System.out.printf("Rate: $%.2f per quarter hour." , rate);
        double hourlyRate = rate * 4;

    }

    public void outputBill(){

    }
}
