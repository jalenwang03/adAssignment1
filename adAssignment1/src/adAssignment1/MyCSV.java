package adAssignment1;

import java.io.FileWriter;
import java.io.IOException;

public  class MyCSV {
	protected String split="<--->";
	protected String csvName="./newcsv.csv";
	protected FileWriter fw;
	protected void writeTocsv() throws IOException{
	fw = new FileWriter(csvName,true); 
	}
}
