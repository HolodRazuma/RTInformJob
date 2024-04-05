package made.by.coldminded;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountAllElements {

    public String countAllElementsOfArray(int[] array) {
        HashMap<Integer, Integer> listOfDoubles = new HashMap<Integer, Integer>();

        for(int i = 0; i < array.length; i++) {
            Integer temp1 = array[i];
            if(listOfDoubles.containsKey(temp1)) {
                int temp2 = listOfDoubles.get(temp1) + 1;
                listOfDoubles.put(temp1, temp2);
            } else {
                listOfDoubles.put(temp1, 1);
            }
        }

        String maps = "";

        for (Map.Entry<Integer,Integer> entry : listOfDoubles.entrySet()) {
            if(!entry.getValue().equals(0))
                maps += entry.getKey() + " : " + entry.getValue() + ", ";
        }
        String result = maps.substring(0, maps.length()-2);

        return result;
    }

    public String countAllElementsOfList(List<Integer> list) {
        HashMap<Integer, Integer> listOfDoubles = new HashMap<Integer, Integer>();

        for(int i = 0; i < list.size(); i++) {
            Integer temp1 = list.get(i);
            if(listOfDoubles.containsKey(temp1)) {
                int temp2 = listOfDoubles.get(temp1) + 1;
                listOfDoubles.put(temp1, temp2);
            } else {
                listOfDoubles.put(temp1, 1);
            }
        }

        String maps = "";

        for (Map.Entry<Integer,Integer> entry : listOfDoubles.entrySet()) {
            if(!entry.getValue().equals(0))
                maps += entry.getKey() + " : " + entry.getValue() + ", ";
        }
        String result = maps.substring(0, maps.length()-2);

        return result;
    }
}
