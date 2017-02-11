import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by shilpakanumuri on 2/11/17.
 */
public class StringParser {
    static ArrayList<String> list;

    public static ArrayList<String> splitString(String stringList){
        list = new ArrayList<String>(Arrays.asList(stringList.split(",")));
        return list;
    }
}
