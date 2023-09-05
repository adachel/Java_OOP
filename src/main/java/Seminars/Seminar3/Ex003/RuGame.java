package Seminars.Seminar3.Ex003;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();
        for (int i = 'a'; i <= 'я'; i++) {
            list.add(String.valueOf((char) i));
        }
        list.add(String.valueOf('ё'));
        return list;
    }
}
