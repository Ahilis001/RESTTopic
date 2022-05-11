package ahilis.springbootquickstart.vjezbaAPI.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import ahilis.springbootquickstart.vjezbaAPI.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String strID;
	private String strIme;
	private String strOpis;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {
		
	}
	
	public Course(String strID, String strIme, String strOpis, String topicID) {
		super();
		this.strID = strID;
		this.strIme = strIme;
		this.strOpis = strOpis;
		this.topic = new Topic(topicID,"","");
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

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	
}
