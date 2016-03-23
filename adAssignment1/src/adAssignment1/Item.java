package adAssignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Item {
	private int itermId;
	private String name;
	private int Currently;
	private Float BuyPrice;
	private Float FirstBid;
	private int NumberOfBids;
	private String Country;
	private Float Latitude;
	private Date start;
	private Date ends;
	private int SellerId;
	private String Description;
	
	private String split="<--->";
	public void setitermId(int itermId){
		this.itermId=itermId;
	}
	public void setname(String name){
		this.name=name;
	}
	public void setCurrently(int Currently){
		this.Currently=Currently;
	}
	public void BuyPrice(float BuyPrice){
		this.BuyPrice=BuyPrice;
		
	}
	public void setFirstBid(float FirstBid){
		this.FirstBid=FirstBid;
	}
	public void setNumberOfBids(int NumberOfBids){
		this.NumberOfBids=NumberOfBids;
	}
	public void Country(String Country){
		this.Country=Country;
	}
	public void setLatitude(float Latitude){
		this.Latitude=Latitude;
	}
	public void setstart(Date start){
		//传入String类型日期，在这里转换为日期类型
		this.start=start;
	}
	public void setends(Date ends){
		//传入String类型日期，在这里转换为日期类型
		this.ends=ends;
	}
	public void seSellerId(int SellerId){
		//传入String类型日期，在这里转换为日期类型
		this.SellerId=SellerId;
	}
	public void setDescription(String Description){
		//传入String类型日期，在这里转换为日期类型
		this.Description=Description;
	}
	public void writeTOcsv() throws IOException{
		FileWriter fw = new FileWriter("./Bid.csv",true); 
		fw.write(itermId);
		fw.write(split);
		fw.write(name);
		fw.write(split);
		fw.write(Currently);
		fw.write(split);
		fw.write(BuyPrice.toString());
		fw.write(split);
		fw.write(FirstBid.toString());
		fw.write(split);
		fw.write(NumberOfBids);
		fw.write(split);
		fw.write(Country);
		fw.write(split);
		fw.write(Latitude.toString());
		fw.write(split);
		fw.write(start.toString());
		fw.write(split);
		fw.write(ends.toString());
		fw.write(split);
		fw.write(SellerId);
		fw.write(split);
		fw.write(Description);
		
		
	}
	
}
