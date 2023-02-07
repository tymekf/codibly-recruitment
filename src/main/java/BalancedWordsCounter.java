import java.util.*;

public class BalancedWordsCounter {

    public int count(String input) {

        if ((input == null) || (!input.matches("^[a-zA-Z]*$"))) {
            throw new RuntimeException();
        } else if (input.equals("")) {
            return 0;
        }

        List<String> substrings = substringify(input);

        return countNumberOfBalancedSubstrings(substrings);
    }

    public List<String> substringify(String input) {

        int size = input.length();
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            for (int j = i + 1; j <= size; j++) {
                substrings.add(input.substring(i, j));
            }
        }
        return substrings;
    }

    public int countNumberOfBalancedSubstrings(List<String> substrings) {
        int balancedSubstringsCounter = 0;
        for (String s : substrings) {
            HashMap<Character, Integer> characters = new LinkedHashMap<>();
            int count;
            Character c;
            for (int i = 0; i < s.length(); i++) {
                c = s.charAt(i);
                if (characters.containsKey(c)) {
                    count = characters.get(c);
                    characters.put(c, count + 1);
                } else {
                    characters.put(c, 1);
                }
            }

            Set<Integer> numbers = new HashSet<>(characters.values());
            if (numbers.size() == 1) {
                balancedSubstringsCounter++;
            }
        }
        return balancedSubstringsCounter;
    }

}