import java.util.HashMap;
import java.util.Set;

public class HashMapTrack {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Near Rhythm", "Free Commission");
        trackList.put("Breaking Future", "Dreams Of Limit");
        trackList.put("More Lola", "Nervous Trip");
        trackList.put("Classic", "Voices Of Triumph");

        trackList.get("Classic");

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}