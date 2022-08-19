import java.util.*;
import java.util.regex.*;

public class TagExtractor {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		int testCases = Integer.parseInt(scanner.nextLine());
        
		while(testCases > 0) {
            String line = scanner.nextLine();
			
            String pattern ="\\<(.+)\\>([^\\<\\>]+)\\<\\/\\1\\>";

            int count = 0;

            Pattern p = Pattern.compile(pattern);
            Matcher m =  p.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                count++;
            }
            
            if (count == 0) {
                System.out.println("None");
            }
			
			testCases--;
		}
        
        scanner.close();
	}
}
