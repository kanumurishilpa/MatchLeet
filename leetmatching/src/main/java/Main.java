
import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by shilpakanumuri on 2/11/17.
 */
public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        MatchWords matchWords = new MatchWords();
        String output = (new Main()).readRawDataToString();
        System.out.println(output);

        ArrayList<String> strings = StringParser.splitString(output);
        System.out.println(strings);

        for (int i = 0; i < StringParser.list.size()-1; i++) {

            for(int j = 1 ; j < StringParser.list.size()-1 ; j++) {

                matchWords.singleCharMismatch(StringParser.list.get(i), StringParser.list.get(j));
            }

            }
        }
    }



