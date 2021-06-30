import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author git-leon
 * @version 1.0.0
 * @date 6/30/21 2:02 PM
 */
public class MainApplication {
    public static void main(String[] args) {
        Nate nate = new Nate();
        Zach zach = new Zach();
        Sitara sitara = new Sitara();
        NotePrinter notePrinter = new NotePrinter();
        notePrinter.printNotes("peep my interface game", nate,zach,sitara);
    }

    public static void numberInterface() {
        Number x = 5;
        Number y = 7.1;
        List<Integer> integerList = new Stack<>();
        Stack<Integer> integerStack;
        integerList.subList(0, 10);
        boolean isStack = integerList instanceof Stack;
        if(isStack) {
            integerStack = (Stack)integerList;
        }
    }

    public static void programAgainstInterfaces() {
        List<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.size();
    }
}
