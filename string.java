import java.util.Arrays;
import java.util.Scanner;
class string {   
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String :");
            String m_string =sc.nextLine();
            System.out.println("Enter the sub String to Search :");
           String s_string = sc.nextLine();
           int countV1 = count_sub_str_in_main_str(m_string, s_string);
           System.out.println(s_string + "' has occured " + countV1 + " times in '" + m_string + "'");            
       }
      public static int count_sub_str_in_main_str(String m_string, String s_string) {
           if (m_string == null || s_string == null) {
               throw new IllegalArgumentException("The given strings cannot be null");
           }
           if (m_string.isEmpty() || s_string.isEmpty()) {
               return 0;
           }
           int position = 0;
           int ctr = 0;
           int n = s_string.length();
           while ((position = m_string.indexOf(s_string, position)) != -1) {
               position = position + n;
               ctr++;
           }
           return ctr;
       }
}