import java.util.Scanner;

import static java.lang.System.in;


    public class AdvancedCalculator {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(in);

            System.out.println("Menu");
            System.out.println("1.Sum");
            System.out.println("2.Minus");
            System.out.println("3.Multiple");
            System.out.println("4.Dividing");
            System.out.println("5.Expotential Number Calculation");
            System.out.println("6.Mdode Calculation");
            System.out.println("7.Rectangele Area Calculation");
            System.out.println("8.Retangle Enviroment Calculation");
            System.out.println("0.Exit");

            while (true) {

                System.out.println("Please Choose a Transaction..:");
                int select = scanner.nextInt();
                if (select == 0) {
                    break;
                }
                System.out.print("Please Enter First Number..:");
                int firstNumber = scanner.nextInt();
                System.out.print("Please Enter Second Number..:");
                int secondNumber = scanner.nextInt();

                switch (select) {
                    case 1:
                        sum(firstNumber, secondNumber);
                        break;
                    case 2:
                        minus(firstNumber, secondNumber);
                        break;
                    case 3:
                        multiple(firstNumber, secondNumber);
                        break;
                    case 4:
                        dividing(firstNumber, secondNumber);
                        break;
                    case 5:
                        power(firstNumber, secondNumber);
                        break;

                    case 6:
                        mod(firstNumber, secondNumber);
                        break;

                    case 7:
                        rectangleArea(firstNumber, secondNumber);
                        break;

                    case 8:
                        retangleEnvoriment(firstNumber, secondNumber);
                        break;


                }
            }

        }

        static int sum(int a, int b) {
            int result = a + b;
            System.out.println("Toplam...:" + result);
            return result;
        }

        static int minus(int a, int b) {
            int result = (a - b);
            System.out.println("Çıkarma...:" + result);
            return result;

        }

        static int multiple(int a, int b) {
            int result = a * b;
            System.out.println("Çarpma...:" + result);
            return result;

        }

        static int dividing(int a, int b) {
            int result = a / b;
            System.out.println("Bölme...:" + result);
            return result;
        }

        static int power(int a, int b) {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
            System.out.println("Üs Hesabı...:" + result);
            return result;

        }

        static int mod(int a, int b) {
            int result = a % b;
            System.out.println("Mod Bulma...:" + result);
            return result;
        }

        static int rectangleArea(int a, int b) {
            int result = a * b;
            System.out.println("Rectangle Area..:" + result);
            return result;

        }

        static int retangleEnvoriment(int a, int b) {
            int result = 2 * (a + b);
            System.out.println("Retangele Enviroment..:"+result);
            return result;
        }


    }

