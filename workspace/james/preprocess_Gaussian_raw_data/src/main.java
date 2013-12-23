import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		FileReader fr = null;
		LineNumberReader lnr = null;
		String file1 = "/Users/anjinliu/Desktop/experiment_datasets/gaussian_data/raw1.csv";
		double max=0;
		double min=30;
		double raw_value;
		
		try {
			file = new File(file1);
			fr = new FileReader(file);
			lnr = new LineNumberReader(fr);
			String line = "";

			while ((line = lnr.readLine()) != null) {
				
				raw_value = Double.parseDouble(line.split(";")[1]);
				if(max < raw_value){
					max = raw_value;
				}
				if(min > raw_value){
					min = raw_value;
				}
				
//				if (line.toLowerCase().contains(args[0].toLowerCase())) {
//					
//				}
			}

			fr.close();
			lnr.close();
			
			System.out.println("Max: " + max);
			System.out.println("Min: " + min);
			System.out.println("Interval: " + (max - min)/50);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
