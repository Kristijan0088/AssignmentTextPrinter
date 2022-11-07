package IntroductionToProgramming;

public class TextTracker {

    //private attribut måste gå genöm klass TextTracker
    private int charCounter;
    private int rowCounter;

    private int wordCounter;
    private String longestWord;


    public TextTracker() {
        charCounter = 0;
        rowCounter = 0;
        wordCounter = 0;
        longestWord = "";

    }

    public void CharCounter(String Text) {

        Text = Text.replaceAll("\\s", "");

        charCounter = charCounter + Text.length();

        rowCounter++;
    }

    public int GetCharacterCount() {

        return charCounter;
    }

    public int GetRowCount() {

        return rowCounter;
    }

    public void NumberOfWords(String text) {

        //int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) == ' ')) {
                wordCounter++;
            }
        }
        //om text length är större än 0 öka wordcounter med 1
        if (text.length() > 0) {
            wordCounter++;
        }
    }

    public int GetWordCounter() {

        return wordCounter;
    }


    public void setLongestWord(String inputText) {
        String[] words = inputText.split(" ");


        int largest = 0;
        String longest = "";

        for (int i = 0; i < words.length; i++) {
            if (largest < words[i].length()) {
                largest = words[i].length();
                longest = words[i];
            }
        }
            if (longestWord.length() < longest.length()){
                longestWord = longest;
            }


    }

    public String GetTheLongestWord() {

        return longestWord;
    }
    public void GetResult(){
        System.out.println("Result of how many characters: " + GetCharacterCount());
        System.out.println("Result of how many rows: " + GetRowCount());
        System.out.println("Result of how many words: " + GetWordCounter());
        System.out.println("Result of the longest word in text: " + GetTheLongestWord());

    }
}


