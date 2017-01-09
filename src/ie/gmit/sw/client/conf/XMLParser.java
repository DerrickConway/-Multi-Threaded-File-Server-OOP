//Derrick Conway G00328406
package ie.gmit.sw.client.conf;

import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XMLParser {

	private Parsetor x;

	public XMLParser(Parsetor x) {
		super();
		this.x = x;
	}
	
	public void init() throws Throwable{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(Parsetor.CONF);
		
		Element root = doc.getDocumentElement();
		NodeList children = root.getChildNodes(); 
	
		for (int i = 0; i < children.getLength(); i++){ //Loop over the child nodes
		
			Node next = children.item(i); 
			
			if (next instanceof Element){
				
				Element e = (Element) next;
				
				if (e.getNodeName().equals("client-config")){
					
					NamedNodeMap atts = e.getAttributes();
					
					for (int j = 0; j < atts.getLength(); j++){
						
						if (atts.item(j).getNodeName().equals("username"))
							x.setUsername(atts.item(j).getNodeValue());

					}
				}
				
				else if (e.getNodeName().equals("server-host"))
					x.setHosts(e.getFirstChild().getNodeValue());
				
				else if(e.getNodeName().equals("server-port"))
					x.setPortnum(Integer.parseInt(e.getFirstChild().getNodeValue()));
				
				else if(e.getNodeName().equals("download-dir"))
					x.setDiror(e.getFirstChild().getNodeValue());
				
			}// need to make sure this is right first!!!!!!!
		}		
		
	} 

	
	public void setx(Parsetor x) {
		this.x = x;
	}
	public Parsetor getx() {
		return x;
	}

	
}
