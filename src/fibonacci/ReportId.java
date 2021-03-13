/*
 * First solution: create a script executed from this class
 * and write the result on a file
 * Second solution: execute the command directly from the class 
 */
package fibonacci;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//second solution
public class ReportId {
	
	public static void main(String[] args) {
		
		Process p;
		String pathScript = "/home/mattia/Desktop/ingegneria_software_2/Falessi/homework/first_hw/src/fibonacci/script.sh";
		
		try {
			
			String[] cmd = { "sh", pathScript};
		    p = Runtime.getRuntime().exec(cmd); 
		    p.waitFor(); 
		    BufferedReader reader=new BufferedReader(new InputStreamReader(
		    p.getInputStream())); 
		    String line; 
		    
		    //read output of script
		    while((line = reader.readLine()) != null) { 
		    	System.out.println(line);
		    } 
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

