package generate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import entity.*;

public class GeneratePerson implements IGenerateData {

	private static ArrayList<String> listPersonName = new ArrayList<String>();
	private static ArrayList<String> listDescription = new ArrayList<String>();
	private static ArrayList<Source> listSource = new ArrayList<Source>();
	
	public GeneratePerson() throws IOException{
		BufferedReader inputStream = null;
		
		try{
			inputStream = new BufferedReader(new FileReader("personInfor.txt"));
			
			String vs;
			while((vs = inputStream.readLine()) != null && !vs.equals("-1")){
				listPersonName.add(vs);
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
	
	public Entity generateData() {
		Random rand = new Random();				
		Person ps = new Person();
		
		int pos = rand.nextInt(listPersonName.size());
		ps.setName(listPersonName.get(pos));
		
		pos = rand.nextInt(listDescription.size());
		ps.setDescription(listDescription.get(pos));
		
		pos = rand.nextInt(listSource.size());
		ps.setSource(listSource.get(pos));
		
		return ps;
	}
public static void main(String[] args) {
	try{
		GeneratePerson ps = new GeneratePerson();
		Person pes = (Person)ps.generateData();
		
		System.out.println(pes.getName());
		System.out.println(pes.getDes());
		System.out.println(pes.getSource().getLink());
		System.out.println(pes.getSource().getDate());
	}
	catch(IOException ex){
		
	}
}
}
