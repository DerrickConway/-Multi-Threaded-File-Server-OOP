//Derrick Conway G00328406
package ie.gmit.sw.client.conf;

public class Parsetor {

	public static final String CONF = "config.xml";
	private String username;
	private String host;
	private String dir;
	private int port;
	
	
	public Parsetor() {
		super();
	}// end super
	
	/**
	 * creating getters and setters for username, host, dir, port
	 * @return
	 */
	// Getter & Setter for user name
	/*=======================================================================================	*/
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	/*=======================================================================================	*/
	
	// Getter & Setter for hosts
	/*=======================================================================================	*/
	public String getHosts() {
		return host;
	}
	public void setHosts(String host) {
		this.host = host;
	}
	/*=======================================================================================	*/
	
	// Getter & Setter for diro
	/*=======================================================================================	*/
	public String getDiror() {
		return dir;
	}
	public void setDiror(String dir) {
		this.dir = dir;
	}
	/*=======================================================================================	*/
	
	// Getter & Setter for port
	/*=======================================================================================	*/
	public int getPortnum() {
		return port;
	}
	public void setPortnum(int port) {
		this.port = port;
	}
	/*=======================================================================================	*/
	
	@Override
	public String toString() {
		return "Parsetor [username = " + username + ", host = " + host + ", port = " + port + ", dir = " + dir + "]";
	}// end override

}//end class
