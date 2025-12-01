import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Boj27889 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Nlcs.from(br.readLine()));

    }

    public enum Nlcs {
        NLCS("North London Collegiate School"),
        BHA("Branksome Hall Asia"),
        KIS("Korea International School"),
        SJA("St. Johnsbury Academy");

        private final String label;
        private static final Map<String, String> lookUp = new HashMap<>();
        static {
            for (Nlcs ab : values()) {
                lookUp.put(ab.name(), ab.label);
            }
        }

        Nlcs(String label) {
            this.label = label;
        }

        public static String from(String abbr) {
            String lb = lookUp.get(abbr);
            return lb;
        }
    }

}
