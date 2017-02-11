import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shilpakanumuri on 2/11/17.
 */
public class MatchWordsTest {
    MatchWords test;
    String testWord;
    String testWord2;
    String testWord3;
    String testWord4;
    String testWord5;
    String testWord6;
    String testWord7, testWord8, testWord9;

    @Before
    public void setUp() {
        test = new MatchWords();
        testWord = "Cookies";
        testWord2 = "CooKieS";
        testWord3 = "Coookies";
        testWord4 = "Fish";
        testWord5 = "F!sh";
        testWord6 = "F!$h";
        testWord7 = "F!!h";
        testWord8 = "C00kies";
        testWord9 = "C0*kies";
    }

    @Test
    public void perfectMatchTest(){
        boolean actual = test.perfectMatch(testWord, testWord2);
        Assert.assertTrue("Expect result to be true, same word", actual);
    }
    @Test
    public void matchBySizeTest(){
        boolean actual = test.matchBySize(testWord, testWord2);
        Assert.assertTrue("Expect result to be true, same word", actual);
    }

    @Test
    public void matchBySizeMismatchTest(){
        boolean actual = test.matchBySize(testWord, testWord3);
        Assert.assertFalse("Expect result to be false, Different Length", actual);
    }

    @Test
    public void matchFirstCharTest(){
        boolean actual = test.firstCharMatcher(testWord, testWord2);
        Assert.assertTrue("Expect result to be true, First Char match", actual);
    }

    @Test
    public void matchFirstCharFalseTest(){
        boolean actual = test.firstCharMatcher(testWord, testWord4);
        Assert.assertFalse("Expect result to be false, Different First Char", actual);
    }

    @Test
    public void matchCharMismatchTest(){
        boolean actual = test.singleCharMismatch(testWord4, testWord5);
        Assert.assertTrue("Expect result to be true, There is only 1 Mismatch", actual);
    }

    @Test
    public void matchCharMismatchFalseTest(){
        boolean actual = test.singleCharMismatch(testWord4, testWord6);
        Assert.assertFalse("Expect result to be False, There is more than 1 Mismatch", actual);
    }

    @Test
    public void matchCharMismatchTrueC00kiesTest(){
        boolean actual = test.singleCharMismatch(testWord, testWord8);
        Assert.assertTrue("Expect result to be True, Words match", actual);
    }

    @Test
    public void matchCharMismatchFalseCookiesTest(){
        boolean actual = test.singleCharMismatch(testWord, testWord9);
        Assert.assertFalse("Expect result to be True, Words mismatch", actual);
    }
}
