//Derrick Conway G00328406
package ie.gmit.sw.client.conf;

public class Parsetor {

	public static final String CONF = "conf.xml";
	private String username;
	private String hosts;
	private String diror;
	private int portnum;
	
	
	public Parsetor() {
		super();
	}// end super
	
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
		return hosts;
	}
	public void setHosts(String host) {
		this.hosts = host;
	}
	/*=======================================================================================	*/
	
	// Getter & Setter for diro
	/*=======================================================================================	*/
	public String getDiror() {
		return diror;
	}
	public void setDiror(String dir) {
		this.diror = dir;
	}
	/*=======================================================================================	*/
	
	// Getter & Setter for port
	/*=======================================================================================	*/
	public int getPortnum() {
		return portnum;
	}
	public void setPortnum(int port) {
		this.portnum = port;
	}
	/*=======================================================================================	*/
	
	@Override
	public String toString() {
		return "Parsetor [username = " + username + ", host = " + hosts + ", port = " + portnum + ", dir = " + diror + "]";
	}// end override

}//end class
