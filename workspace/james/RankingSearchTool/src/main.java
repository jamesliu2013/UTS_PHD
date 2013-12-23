import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;





public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
	    FileReader fr = null;
	    LineNumberReader lnr = null;
		String file1="/Users/anjinliu/Desktop/Rating/ERA2010_conference_list.csv";
		String file2="/Users/anjinliu/Desktop/Rating/ERA2010 journal+Impact Factor.csv";
		String file3="/Users/anjinliu/Desktop/Rating/ERA2010_journal_title_list.csv";
		try {
	        file = new File(file1);
	        fr = new FileReader(file);           
	        lnr = new LineNumberReader(fr);
	        String line = "";           
			while ((line = lnr.readLine()) != null) {	
				//System.out.println(line.replace("\t", "\n"));
				if(line.toLowerCase().contains(args[0].toLowerCase())){
					System.out.println(line.replace("\t", "\n"));
				}
			}
			fr.close();
			lnr.close();
			
			file = new File(file2);
	        fr = new FileReader(file);           
	        lnr = new LineNumberReader(fr);
	        line = "";           
			while ((line = lnr.readLine()) != null) {
				//System.out.println(line.replace("\t", "\n"));
				if(line.toLowerCase().contains(args[0].toLowerCase())){
					System.out.println(line.replace("\t", "\n"));
				}
			}
			fr.close();
			lnr.close();
			
			file = new File(file3);
	        fr = new FileReader(file);           
	        lnr = new LineNumberReader(fr);
	        line = "";           
			while ((line = lnr.readLine()) != null) {
				//System.out.println(line.replace("\t", "\n"));
				if(line.toLowerCase().contains(args[0].toLowerCase())){
					System.out.println(line.replace("\t", "\n"));
				}
			}
			fr.close();
			lnr.close();
	    }catch(IOException ex){
	    	System.out.println("cannot find files");
	    }
		
		System.out.println("Finish");
	}

}
