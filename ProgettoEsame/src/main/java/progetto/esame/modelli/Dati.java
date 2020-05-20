package progetto.esame.modelli;

public class Dati 
{
	public int id;
	public String media_type;
	public String media_url;
	public String username;
	public String timestamp;
	
	public Dati(int id, String media_type, String media_url, String username, String timestamp)
	{
		this.id = id;
		this.media_type = media_type;
		this.media_url = media_url;
		this.username = username;
		this.timestamp = timestamp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedia_type() {
		return media_type;
	}

	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}

	public String getMedia_url() {
		return media_url;
	}

	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	

}
