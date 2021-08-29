package ItemForLastQuestions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geo{

	@JsonProperty("lng")
	private String lng;

	@JsonProperty("lat")
	private String lat;

	public String getLng(){
		return lng;
	}

	public String getLat(){
		return lat;
	}
}