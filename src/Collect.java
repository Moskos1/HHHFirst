import java.util.HashSet;
import java.util.Set;

public class Collect {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(){
            {
                this.add("one");
                this.add("two");
                this.add("ten");
            }
        };
        System.out.println(set);

    }
}
