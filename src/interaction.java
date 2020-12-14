import java.util.Scanner;

public class interaction {
    public static void main(String[] args){
        // AsciiChars.printNumbers();
       // AsciiChars.printUpperCase();
       // AsciiChars.printLowerCase();
        final int numQs = 7;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        String name;

        //Takes users name
        System.out.println("Please enter your name: ");
        name = scanner.nextLine();

        //Print users name
        System.out.println("Hello " + name);

        System.out.println("Would you like to continue?");
        String yes = scanner.nextLine();

        if ((yes.equals("y") | yes.equals("yes"))) {
            while (count < numQs) {
                // Question number one
                System.out.println("What is the name of your favorite pet?");
                String petName = scanner.next();

                // Question number two
                System.out.println("What is the age of your pet?");
                int petAge = scanner.nextInt();

                // Question number three
                System.out.println("What is your lucky number?");
                int luckyNum = scanner.nextInt();

                // Question number four
                System.out.println("Do you have a favorite quarterback? If so what is their jersey number?");
                int qbNum = scanner.nextInt();

                // Question number five
                System.out.println("What is the two-digit model year of your car?");
                int modelYear = scanner.nextInt();

                // Question number six
                System.out.println("What is the first name of their favorite actor or actress?");
                String actName = scanner.next();

                // Question number seven
                System.out.println("Enter a random number between 1 and 50.");
                int ranNum = scanner.nextInt();



                int ranOne = (int) ((Math.random() * (65 - 1)) + 1);
                int ranTwo = (int) ((Math.random() * (65 - 1)) + 1);
                int ranThree = (int) ((Math.random() * (65 - 1)) + 1);
                // Magic ball number
                int magicBall = Math.min(qbNum * ranThree,75);

                // First number using random number minus generated number
                int numberOne = ranNum - ranTwo;
                if (numberOne < 0) {
                    numberOne = numberOne + luckyNum;
                }

                // Second number using value 42
                int numberTwo = 42;
                if (numberTwo < 0) {
                    numberTwo = numberTwo + qbNum;
                }
                // Third number using petAge and modelYear
                int numberThree = petAge + modelYear;
                if (numberThree < 0) {
                    numberThree = numberThree + petAge;
                }

                // Fourth number using qbNum + petAge + luckyNum
                int numberFour = qbNum + petAge + luckyNum;
                if (numberFour < 0) {
                    numberFour = numberFour + qbNum + luckyNum;
                }

                // Fifth number using modelYear + luckyNum
                int numberFive = modelYear + luckyNum;
                if (numberFive < 0) {
                    numberFive = numberFive + petAge;
                }

                System.out.println("Lottery numbers: " + numberOne + ", " + numberTwo + ", " + numberThree + ", " + numberFour + ", " + numberFive + "  Magic ball: " + magicBall);

                System.out.println("Would you like to play again?");
                String playAgain = scanner.next();
                if ((playAgain.equals("n") | playAgain.equals("no"))) {
                   System.out.println("I hope you have the winning numbers! Come back and play again.");
                   break;
                }
            }
        }
        else {
            System.out.println("Okay please return later to complete the survey!");
            return;
        }



    }
}
