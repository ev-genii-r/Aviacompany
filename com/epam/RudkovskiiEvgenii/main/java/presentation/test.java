package presentation;

import dao.Reader;
import dao.plane.Selector;

import java.io.IOException;

public class test {
    public static void main(String args[]) throws IOException {
        Selector selector = new Selector();
        String str = "1   2 3 4 5 6   ";
        System.out.println(selector.findNextElement(str , 0));
    }
}
