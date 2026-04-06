package core_programming_intermediate.java_methods.level2;

import java.util.Scanner;

public class TeamBMI {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInCm = data[i][1];
            double heightInMeter = heightInCm / 100;

            double bmi = weight / (heightInMeter * heightInMeter);
            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3];

        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter details for Person " + (i + 1));

            System.out.print("Enter weight in kg: ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height in cm: ");
            data[i][1] = sc.nextDouble();
        }

        calculateBMI(data);
        String[] status = getBMIStatus(data);

        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t\t%s%n",
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    status[i]);
        }
    }
}