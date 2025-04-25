import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Soln3 
{
    HashMap<Character,char[]> h = new HashMap<>();
    ArrayList<String> result = new ArrayList<>();

    
    void mix(String digits, int index, StringBuilder current)
    {
        if(index==digits.length())
        {
            result.add(current.toString());
            return;
        }

        char digit = digits.charAt(index);
        char[] letters = h.get(digit);

        for(char c : letters)
        {
            current.append(c);
            mix(digits, index+1, current);
            current.deleteCharAt(current.length()-1);
        }
    }

    void phone(String digits)
    {
        if (digits == null || digits.length() == 0) return;

        h.put('2', new char[]{'a','b','c'});
        h.put('3', new char[]{'d','e','f'});
        h.put('4', new char[]{'g','h','i'});
        h.put('5', new char[]{'j','k','l'});
        h.put('6', new char[]{'m','n','o'});
        h.put('7', new char[]{'p','q','r','s'});
        h.put('8', new char[]{'t','u','v'});
        h.put('9', new char[]{'w','x','y','z'});

        mix(digits, 0, new StringBuilder());

        System.out.println("All combinations: " + result);
        
    }
}
