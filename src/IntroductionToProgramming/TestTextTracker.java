package IntroductionToProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestTextTracker {

    @Test
    public void TestCharCounter() {
        //Räknar hur många tecken(med mellanslag) finns i "text" ordet

        //Arrange
        TextTracker charCounterTest = new TextTracker();
        int expected = 6;

        //Act                         //mellanslag +
        charCounterTest.CharCounter("Hej ho");
        charCounterTest.CharCounter("");

        int actual = charCounterTest.GetCharacterCount();
        //Assert
        assertEquals(expected,actual);

    }

    @Test
    public void TestRowCounter() {
        //Räknar hur många rader bli när man skirver in text rad för rad

        //Arrange
        TextTracker rowCounterTest = new TextTracker();
        int expected = 3;

        //Act
        rowCounterTest.CharCounter("Hej ho");
        rowCounterTest.CharCounter("Hej ho");
        rowCounterTest.CharCounter("Hej ho");

        int actual = rowCounterTest.GetRowCount();
        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void TestNbOfWords(){
        //Arrange
        TextTracker numberOfWordsTest = new TextTracker();
        int expected = 7;

        //Act
        numberOfWordsTest.NumberOfWords("Hej Staffan hoppas du mår bra idag!");


      int actual = numberOfWordsTest.GetWordCounter();

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void TestLongestWord(){
        TextTracker longestWordTest = new TextTracker();
        String expected = "eftermiddag";

        longestWordTest.setLongestWord("Jag mår jättebra idag.");
        longestWordTest.setLongestWord("Okej vi se på eftermiddag då.");


        String actual = longestWordTest.GetTheLongestWord();

        System.out.println(actual);

        //Assert
        assertEquals(expected, actual);

    }

}
