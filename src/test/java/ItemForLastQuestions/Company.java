package ItemForLastQuestions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company{

	@JsonProperty("bs")
	private String bs;

	@JsonProperty("catchPhrase")
	private String catchPhrase;

	@JsonProperty("name")
	private String name;

	public String getBs(){
		return bs;
	}

	public String getCatchPhrase(){
		return catchPhrase;
	}

	public String getName(){
		return name;
	}
}