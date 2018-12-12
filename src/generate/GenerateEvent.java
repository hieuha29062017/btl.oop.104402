package generate;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import entity.*;

public class GenerateEvent implements IGenerateData {

	private static ArrayList<String> listEventName = new ArrayList<String>();
	private static ArrayList<String> listDescription = new ArrayList<String>();
	private static ArrayList<Source> listSource = new ArrayList<Source>();
		
	public GenerateEvent() throws IOException{
		BufferedReader inputStream = null;
	
		try{
			inputStream = new BufferedReader(new FileReader("EventInfor.txt"));
				
			String vs;
			while((vs = inputStream.readLine()) != null && !vs.equals("-1")){
				listEventName.add(vs);
			}
				
			while((vs = inputStream.readLine()) != null && !vs.equals("-2")){
				listDescription.add(vs);
			}
			
			while((vs = inputStream.readLine()) != null && !vs.equals("-3")){
				Source temp = new Source(vs);
				listSource.add(temp);
			}
		}
		finally{
			if(inputStream != null)
				inputStream.close();
		}
	}

	public Entity generateData(int idNumber) {
		Random rand = new Random();				
			
		int pos = rand.nextInt(listEventName.size());
		String name = listEventName.get(pos);
			
		pos = rand.nextInt(listDescription.size());
		String des = listDescription.get(pos);
			
		pos = rand.nextInt(listSource.size());
		Source src = listSource.get(pos);
		
		String id = name.replaceAll(" ", "_");
		id = id + "_" + Integer.toString(idNumber, 8);
			
		Event lct = new Event(id, name, des, src);
		
		return lct;	
	}
}


