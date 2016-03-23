package adAssignment1;

import java.io.FileWriter;
import java.io.IOException;

public class User {
	private int UserId;
	private int BidRating;
	private int UserRating;
	private String Location;
	private String Country;
	
	private String split="<--->";
	public void setUserId(int UserId){
		this.UserId=UserId;
	}
	public void setBidRating(int setBidRating){
		this.BidRating=BidRating;
	}
	public void setUserRating(int UserRating){
		this.UserRating=UserRating;
	}
	public void setLocation(String Location){
		this.Location=Location;
	}
	public void setCountry(String Country){
		this.Country=Country;
	}
	public void writeTOcsv() throws IOException{
		FileWriter fw = new FileWriter("./Bid.csv",true); 
		fw.write(UserId);
		fw.write(split);
		fw.write(BidRating);
		fw.write(split);
		fw.write(UserRating);
		fw.write(split);
		fw.write(Location);
		fw.write(split);
		fw.write(Country);		
	}
}
