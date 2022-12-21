package collectionBufferreader;

import java.io.BufferedReader;
import java.io.FileReader;

public class Work_Duration {
	public static void main(String[]args) {
		String filePath="C:\\Users\\91885\\OneDrive\\Documents\\code\\Assignment10\\src\\collectionBufferreader\\work_duration";
		int sumHours=0;
		int sumMinutes=0;
		
		try(FileReader fr=new FileReader(filePath);
				BufferedReader br= new BufferedReader(fr)){
			while(true) {
				 String line=br.readLine();
				 if(line==null)
					 break;
				 
			String[] values= line.split(":");
			String WorkingHours= values[0];
			String WorkingMinutes= values[1];
			System.out.println("Working hours of a worker are "+WorkingHours+" and minutes are "+WorkingMinutes);
			
			int Hours=Integer.parseInt(WorkingHours);
			sumHours=sumHours+Hours;
			
			int Minutes=Integer.parseInt(WorkingMinutes);
			sumMinutes=sumMinutes+Minutes;
			}
			
			sumHours=sumHours+(sumMinutes/60);
			System.out.println("Total working hours of worker are:"+sumHours);
			int RemMin=sumMinutes%60;
			System.out.println("Total working minutes of worker are:"+RemMin);
			}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
