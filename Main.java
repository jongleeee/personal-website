import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main
{
    public static void main (String[] args)
            throws IOException
    {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
		int number;

        while ((line = in.readLine()) != null) {

            line = line.trim();
			number = Integer.parseInt(line);
           	print_fibonnaci(number);	 
        }
    }


	public static void print_fibonnaci(int number) {
        
        int first = 1;
        int second = 1;
        
        if (number <= 2) {
            System.out.println(first);
            return;
        }
        
        else {
            int carry;
            while (number > 2) {
                carry = second;
                second = first + second;
                first = carry;
                number--;
            }
            System.out.println(second);
            return;
            
        }
        
    }





}





