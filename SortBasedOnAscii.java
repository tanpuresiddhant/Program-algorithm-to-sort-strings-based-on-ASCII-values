
 
import java.util.Arrays;
import java.util.Comparator;
public class SortBasedOnAscii implements Comparator {
    public int compare(Object obj1, Object obj2) {
        String string_One = obj1.toString();
        String string_Two = obj2.toString();
 
        if (string_Two == null || string_One == null) {
            return 0;
        }
 
        int length_String_One = string_One.length();
        int length_String_Two = string_Two.length();
 
        int index1 = 0;
        int index2 = 0;
 
        while (index1 < length_String_One && index2 < length_String_Two) {
            char ch1 = string_One.charAt(index1);
            char ch2 = string_Two.charAt(index2);
 
            char[] temp_str1 = new char[length_String_One];
            char[] temp_str2 = new char[length_String_Two];
 
            int loc1 = 0;
            int loc2 = 0;
            
            temp_str1[loc1++] = ch1;
            index1++;

            while (index1 < length_String_One && Character.isDigit(temp_str1[0]) ){
                ch1 = string_One.charAt(index1);
                if(!Character.isDigit(ch1)) break;
                temp_str1[loc1++] = ch1;
                index1++;

            }
            
            temp_str2[loc2++] = ch2;
            index2++;
            
            while (index2 < length_String_Two && Character.isDigit(temp_str2[0])){
                ch2 = string_Two.charAt(index2);
                if(!Character.isDigit(ch2)) break;
                temp_str2[loc2++] = ch2;
                index2++;
            }
            
            
            String str1 = new String(temp_str1);
            String str2 = new String(temp_str2);
 
            int result;
            if (Character.isDigit(temp_str1[0]) && Character.isDigit(temp_str2[0])) {
                Integer firstNumberToCompare = new Integer(
                        Integer.parseInt(str1.trim()));
                Integer secondNumberToCompare = new Integer(
                        Integer.parseInt(str2.trim()));
                result = firstNumberToCompare.compareTo(secondNumberToCompare);
            } 
            else{
                result = str1.trim().compareTo(str2.trim());
            }
            
            if (result != 0) {
                return result;
            }
        }
        return length_String_One - length_String_Two;
    }
 
    public static void main(String[] args) {
        String[] n1 = new String[]{"t9.txt", "t5.txt", "t10.txt", "t0.txt", "t19.txt", "t.txt", "t3.txt", "t007.txt"};
    
        Arrays.sort(n1, new SortBasedOnAscii());
 
        for (int i = 0; i < n1.length; i++) {
            System.out.println(n1[i]);
        }
 
    }
 
}