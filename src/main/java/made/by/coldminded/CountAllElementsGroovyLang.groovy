package made.by.coldminded

class CountAllElementsGroovyLang {

    String countAllElementsOfArray(int[] array) {
        def listOfDoubles = [:]

        for (int i = 0; i < array.length; i++) {
            int temp1 = array[i]
            if (listOfDoubles.containsKey(temp1)) {
                int temp2 = listOfDoubles[temp1] + 1
                listOfDoubles[temp1] = temp2
            } else {
                listOfDoubles[temp1] = 1
            }
        }

        String maps = ""

        listOfDoubles.each { key, value ->
            if (value != 0)
                maps += "$key : $value, "
        }
        String result = maps.substring(0, maps.length() - 2)

        return result
    }

    String countAllElementsOfList(List<Integer> list) {
        def listOfDoubles = [:]

        for (int i = 0; i < list.size(); i++) {
            int temp1 = list[i]
            if (listOfDoubles.containsKey(temp1)) {
                int temp2 = listOfDoubles[temp1] + 1
                listOfDoubles[temp1] = temp2
            } else {
                listOfDoubles[temp1] = 1
            }
        }

        String maps = ""

        listOfDoubles.each { key, value ->
            if (value != 0)
                maps += "$key : $value, "
        }
        String result = maps.substring(0, maps.length() - 2)

        return result
    }
}
