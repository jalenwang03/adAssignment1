package adAssignment1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Bid {
	//需要考虑是否需要为变量设定初值
	private int ItemId;
	private int BidderId;
	private Date Time;
	private int Amount;
	private String split="<--->";
	public void setItemId(int itemId){
		this.ItemId=ItemId;
	}
	public void setBidderId(int BidderId){
		this.BidderId=BidderId;
	}
	public void setTime(Date Time){
		//传入String类型日期，在这里转换为日期类型
		this.Time=Time;
	}
	public void setAmount(int Amount){
		this.Amount=Amount;
	}
	public void writeTOcsv() throws IOException{
		FileWriter fw = new FileWriter("./Bid.csv",true); 
		fw.write(ItemId);
		fw.write(split);
		fw.write(BidderId);
		fw.write(split);
		fw.write(Time.toString());
		fw.write(split);
		fw.write(Amount);
		fw.write(split);
		
	}
	
}
