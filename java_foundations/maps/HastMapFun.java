import java.util.HashMap;
import java.util.Set;

// key value pairs
// userMap
//      email | name
// akl@cd.com | Nancy
// dls@cd.com | Sam
//
// .get("akl@cd.com") => Nancy

public class HastMapFun {
    public static void main(String[] args) {
        //     <key,    value>
        HashMap<String, String> userMap = new HashMap<String, String>();
        // put method to insert
        userMap.put("kqdwl@solewcl.com", "sdkl adkl");
        userMap.put("kasdcwqwl@solewcl.com", "seflg fgdc");
        userMap.put("wecfswl@solewcl.com", "ecr cf");

        // get value with the key
        String name = userMap.get("kasdcwqwl@solewcl.com");
        System.out.println("The full name is: " + name);

        // get the keys by using the keySet method
        // Set collection un-order uniq value
        Set<String> keys = userMap.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}