package generate;

<<<<<<< HEAD

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;



import entity.*;

public class GenerateLocation implements IGenerateData {

		private static ArrayList<String> listLocationName = new ArrayList<String>();
		private static ArrayList<String> listDescription = new ArrayList<String>();
		private static ArrayList<Source> listSource = new ArrayList<Source>();
		
		public GenerateLocation() throws IOException{
			BufferedReader inputStream = null;
	
			try{
				inputStream = new BufferedReader(new FileReader("locationInfor.txt"));
				
				String vs;
				while((vs = inputStream.readLine()) != null && !vs.equals("-1")){
					listLocationName.add(vs);
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
=======
import entity.Entity;

public class GenerateLocation implements IGenerateData {

	public Entity generateData(int idNumber) {
		return null;
		// TODO Auto-generated method stub
>>>>>>> 8e2f8a84bff6cdd9756cf71054607df7ca458a50

		public Entity generateData() {
			Random rand = new Random();				
			Location lct = new Location();
			
			int pos = rand.nextInt(listLocationName.size());
			lct.setName(listLocationName.get(pos));
			
			pos = rand.nextInt(listDescription.size());
			lct.setDescription(listDescription.get(pos));
			
			pos = rand.nextInt(listSource.size());
			lct.setSource(listSource.get(pos));
			
			return lct;
		
		}
		public static void main(String[] args) {
			try{
				GenerateLocation lct = new GenerateLocation();
				Location pes = (Location)lct.generateData();
				
				System.out.println(pes.getName());
				System.out.println(pes.getDes());
				System.out.println(pes.getSource().getLink());
				System.out.println(pes.getSource().getDate());
			}
			catch(IOException ex){
				
			}
		}
	}


