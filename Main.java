import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        ArrayList<String> doubleItems = new ArrayList<>();
        String subStr[];
        final String source = "Если вы можете мечтать об этом вы можете это сделать";
        subStr = source.split(" ");
        for (String string : subStr) {
            int key = string.length();
            String value = string;
            if (treeMap.containsKey(key)){
                doubleItems.add(value);
                treeMap.put(key, value);
            }
            else {
                treeMap.put(key, value);
            }

        }
        Set set = treeMap.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()){
            Map.Entry me = (Map.Entry) i.next();
            int len = me.getValue().toString().length();
            System.out.print(me.getValue() + " ");
            for (String item : doubleItems) {
                if (item.length() == len) {
                    System.out.print(item + " ");

                }
            }
        }
    }
    public String getSortedIncludesWords(final Map<Integer, String> map){

        return "";
    }
}