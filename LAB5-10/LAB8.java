import java.util.Scanner;

public class LAB8 {
    public static void main(String[] args) {
        int timeInhour,timeInmin;
        int timeOuthour,timeOutmin;
        int hourProcess = 0, minProcess=0; 
        int limit_in_hour = 4,limit_out_hour = 20; 
        int totalMin = 0 ,freeTime = 10;
        double priceMin = 0 ;
        String unit ;
        boolean accept = true; 
        Scanner input = new Scanner(System.in); 
        System.out.print("Input Time In Hour:"); 
        timeInhour = input.nextInt();
        System.out.print("Input Time In Minute:"); 
        timeInmin = input.nextInt();
        System.out.print("Input Time Out Hour:"); 
        timeOuthour = input.nextInt();
        System.out.print("Input Time Out Minute:"); 
        timeOutmin = input.nextInt();

        if ((timeOuthour >= limit_in_hour & timeOuthour <= limit_out_hour) & (timeOuthour >= timeInhour)) {
            if (timeOuthour == 20 & timeOutmin > 0) {
                accept = false;
            } else {
                if ((timeInmin >= 0 & timeInmin <= 59) & (timeOutmin >= 0 & timeOutmin <= 59)) {
                    if (timeOutmin >= timeInmin) {
                        hourProcess = timeOuthour - timeInhour;
                        minProcess = timeOutmin - timeInmin;
                    } else {
                        hourProcess = (timeOuthour-1) - timeInhour; 
                        minProcess = (timeOutmin + 60) - timeInmin;
                    }
                } else {
                    System.out.println("Minute over");
                    accept = false;
                }
            }
        } else {
            System.out.println("Time over");
            accept = false;
        }

        if (accept) {
            minProcess = (hourProcess * 60) + minProcess;
            totalMin = minProcess;
            if (minProcess >= 181) {
                unit = "2.50 Bath";
                minProcess = minProcess - freeTime;
                priceMin = minProcess * 2.50;
            } else if (minProcess >= 121) {
                unit = "2 Bath";
                minProcess = minProcess - freeTime;
                priceMin = minProcess * 2;
            } else if (minProcess >= 61) {
                unit = "1.50 Bath";
                minProcess = minProcess - freeTime;
                priceMin = minProcess * 1.50;
            } else if (minProcess >= 11) {
                unit = "1 Bath";
                minProcess = minProcess - freeTime;
                priceMin = minProcess * 1;
            } else {
                unit = "Free";
                priceMin = 0.0;
            }
            System.out.println("===================================================");
            System.out.print("Time In: " + timeInhour + ": " + timeInmin);
            System.out.println(" -- Time Out: " + timeOuthour + ": " + timeOutmin);
            System.out.println("Total Time\t: " + totalMin);
            System.out.println("First 10 minutes Free" + "\tAmount Time: " + minProcess);
            System.out.println("Unit:" + unit + "\t\tTotal Price: " + priceMin);
            System.out.println("===================================================");
        } else {
            System.out.println("Time Over");
        }

    }
}
