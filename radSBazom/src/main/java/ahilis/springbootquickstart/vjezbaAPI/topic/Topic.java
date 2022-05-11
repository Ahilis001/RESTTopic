package ahilis.springbootquickstart.vjezbaAPI.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {
	
	@Id
	private String strID;
	private String strIme;
	private String strOpis;
	
	public Topic() {
		
	}
	
	public Topic(String strID, String strIme, String strOpis) {
		super();
		this.strID = strID;
		this.strIme = strIme;
		this.strOpis = strOpis;
	}
	
	public String getStrID() {
		return strID;
	}
	public void setStrID(String strID) {
		this.strID = strID;
	}
	public String getStrIme() {
		return strIme;
	}
	public void setStrIme(String strIme) {
		this.strIme = strIme;
	}
	public String getStrOpis() {
		return strOpis;
	}
	public void setStrOpis(String strOpis) {
		this.strOpis = strOpis;
	}

	
}
