package adAssignment1;

import java.io.FileWriter;
import java.io.IOException;

public class ItemCategory {
	private int itemId;
	private String Category;
	
	private String split="<--->";
	public void setitemId(int itemId){
		this.itemId=itemId;
		
	}
	public void setCategory(String Category){
		this.Category=Category;
	}
	public void writeTOcsv() throws IOException{
		FileWriter fw = new FileWriter("./Bid.csv",true); 
		fw.write(itemId);
		fw.write(split);
		fw.write(Category);
		
	}
}
