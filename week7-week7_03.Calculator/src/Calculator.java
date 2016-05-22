
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dev
 */
public class Calculator {

    private Reader reader;
    private int calculations;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();

            } else if (command.equals("difference")) {
                difference();

            } else if (command.equals("product")) {
                product();

            }

        }

        statistics();
    }

    private int[] readTwoValues() {
        calculations++;

        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = reader.readInteger();
        System.out.print("value2: ");
        values[1] = reader.readInteger();

        return values;
    }

    private void sum() {

        int values[] = readTwoValues();

        int sum = values[0] + values[1];

        System.out.println("sum of the values " + sum);
        System.out.println();
    }

    private void difference() {
        int values[] = readTwoValues();

        int difference = values[0] - values[1];

        System.out.println("difference of the values " + difference);
        System.out.println();

    }

    private void product() {
        int values[] = readTwoValues();

        int product = values[0] * values[1];

        System.out.println("product of the values " + product);
        System.out.println();

    }

    private void statistics() {

        System.out.println("Calculations done " + calculations);

    }
}
