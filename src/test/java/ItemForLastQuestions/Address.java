package ItemForLastQuestions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address{

	@JsonProperty("zipcode")
	private String zipcode;

	@JsonProperty("geo")
	private Geo geo;

	@JsonProperty("suite")
	private String suite;

	@JsonProperty("city")
	private String city;

	@JsonProperty("street")
	private String street;

	public String getZipcode(){
		return zipcode;
	}

	public Geo getGeo(){
		return geo;
	}

	public String getSuite(){
		return suite;
	}

	public String getCity(){
		return city;
	}

	public String getStreet(){
		return street;
	}
}