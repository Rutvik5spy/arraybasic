import java.util.Arrays;
import java.util.Comparator;

public class Sortedlist{
    public static void main(String[] args) {
        String[] cities = {"ROME", "PARIS", "LONDON", "ZURICH", "ABCD", "WERTHG"};

        // Sort by length, then by name
        Arrays.sort(cities, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return Integer.compare(s1.length(), s2.length());
                }
            }
        });
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
