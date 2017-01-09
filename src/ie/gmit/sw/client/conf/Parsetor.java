//Derrick Conway G00328406
package ie.gmit.sw.client.conf;

public class Parsetor {

	public static final String CONF = "conf.xml";
	private String username;
	private String host;
	private String dir;
	private int port;
	
	
	public Parsetor() {
		super();
	}
	
	// Getters & Setters
	/*=======================================================================================	*/
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	/*=======================================================================================	*/
	
	/*=======================================================================================	*/
	public String getHosts() {
		return host;
	}
	public void setHosts(String host) {
		this.host = host;
	}
	/*=======================================================================================	*/
	
	/*=======================================================================================	*/
	public String getDiror() {
		return dir;
	}
	public void setDiror(String dir) {
		this.dir = dir;
	}
	/*=======================================================================================	*/
	
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
	}

}
