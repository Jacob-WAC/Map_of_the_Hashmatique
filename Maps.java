import java.util.HashMap;
import java.util.Set;
public class Maps {
public static void main(String[] args) {
  HashMap<String, String> trackList = new HashMap<String, String>();
  trackList.put("Where Did the Rock Go?", "Where? Tell me where, oh where did my rock collection goooooo");
  trackList.put("I got rocks","hey world, I GOT ROCKKKKKKKS");
  trackList.put("I found my rocks", "what was lost is found, my rocks are all around!!!!");
  trackList.put("lay me down", "when i am dead, put rocks on top my head");
  String track = trackList.get("Where Did the Rock Go?");
  System.out.print(track + "\n" + "\n");

  Set<String> keys = trackList.keySet();
        for(String key : keys) {
            String kvp = String.format("%s: \"%s\"",key,trackList.get(key));
            System.out.println(kvp);
}
}
}