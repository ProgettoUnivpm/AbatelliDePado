/**
 * 
 */
package esame.modelli;

/**
 * @author depad
 *
 */
public class dati {
	public int id;
	public String media_type;
	public String media_url;
	public String username;
	public String timestamp;
	
	public dati(int id, String media_type, String media_url, String username, String timestamp)
	{
		this.id = id;
		this.media_type = media_type;
		this.media_url = media_url;
		this.username = username;
		this.timestamp = timestamp;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the media_type
	 */
	public String getMedia_type() {
		return media_type;
	}

	/**
	 * @param media_type the media_type to set
	 */
	public void setMedia_type(String media_type) {
		this.media_type = media_type;
	}

	/**
	 * @return the media_url
	 */
	public String getMedia_url() {
		return media_url;
	}

	/**
	 * @param media_url the media_url to set
	 */
	public void setMedia_url(String media_url) {
		this.media_url = media_url;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	
	

}