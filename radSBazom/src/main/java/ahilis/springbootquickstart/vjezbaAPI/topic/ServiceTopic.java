package ahilis.springbootquickstart.vjezbaAPI.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTopic {
	
	@Autowired
	private RepositoryTopic repositoryTopic;
	
	public List<Topic> dajSveTopic() {
		
		//return lstListaTopicsa;
		List<Topic> lstTopic = new ArrayList<>();
		
		
		
			for (Topic topic : repositoryTopic.findAll()) {
				lstTopic.add(topic);
			}

		return lstTopic;
				
	}
	
	public Topic dajTopic(String strID) {

		try {

			return repositoryTopic.findById(strID).get();
		} catch (Exception e) {
			return null;
		}
	}

	public void dodajTopic(Topic topic) {
//		repositoryTopic.save(topic);
		repositoryTopic.save(topic);
		
	}

	public void promijeniTopic(Topic topic, String strID) {
//		for (Iterator<Topic> iterator = lstListaTopicsa.iterator(); iterator.hasNext();) {
//			Topic topicPomocni = (Topic) iterator.next();
//			
//			if (topicPomocni.getStrID().equals(strID)) {
//				
//				topicPomocni.setStrIme(topic.getStrIme());
//				topicPomocni.setStrOpis(topic.getStrOpis());
//				return;
//			}
//		}
		repositoryTopic.save(topic);
		
	}

	public void obrisiTopic(String strID) {
//		for (Iterator<Topic> iterator = lstListaTopicsa.iterator(); iterator.hasNext();) {
//			Topic topicPomocni = (Topic) iterator.next();
//			
//			if (topicPomocni.getStrID().equals(strID)) {
//				lstListaTopicsa.remove(topicPomocni);
//				return;
//			}
//		}
		repositoryTopic.deleteById(strID);
		
	}
}
