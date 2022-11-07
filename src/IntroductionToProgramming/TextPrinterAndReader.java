package IntroductionToProgramming;


import java.util.Scanner;

public class TextPrinterAndReader {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TextTracker tracker = new TextTracker();

        System.out.println("Write a desired text: ");

        System.out.println("To exit the program write word stop or Stop.");

        String inputText = "";
        //Control if word "stop" has been entered and loopar
        while (!inputText.equals("stop") && !inputText.equals("Stop")) {
            inputText = scan.nextLine();
            //Continue if word "stop" has  not been entered
            if (!inputText.equals("stop") && !inputText.equals("Stop")) {
                tracker.CharCounter(inputText);
                tracker.NumberOfWords(inputText);
                tracker.setLongestWord(inputText);

            }

        }
        tracker.GetResult();

        System.out.println("You have exited the program!");

        /*
        System.out.println("Result of how many characters: " + tracker.GetCharacterCount());
        System.out.println("Result of how many rows: " + tracker.GetRowCount());
        System.out.println("Result of how many words: " + tracker.GetWordCounter());
        System.out.println("Result of the longest word in text: " + tracker.GetTheLongestWord());
        */


    }


}
