package testProject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class mathTest {

	public static void main(String[] args) throws IOException{

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.print("Enter String");
	        String s = br.readLine();
	        System.out.print("Enter Integer:");
	        try{
	            int i = Integer.parseInt(br.readLine());
	        }catch(NumberFormatException nfe){
	            System.err.println("Invalid Format!");
	        }
	        System.out.print("Int One");
	        int b = Integer.parseInt(br.readLine());
	        System.out.print("Int Two");
	        int c = Integer.parseInt(br.readLine());
	        int d = b + c;
	        System.out.printf("%s", d);
		}
	}

