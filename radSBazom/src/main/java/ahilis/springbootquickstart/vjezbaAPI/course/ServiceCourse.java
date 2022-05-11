package ahilis.springbootquickstart.vjezbaAPI.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceCourse {
	
	@Autowired
	private RepositoryCourse repositoryCourse;
	
	public List<Course> dajSveCourse(String strID) {
		
		//return lstListaTopicsa;
		List<Course> lstCourse = new ArrayList<>();
		
		
		
			for (Course topic : repositoryCourse.findByTopicStrID(strID)) {
				lstCourse.add(topic);
			}

		return lstCourse;
				
	}
	
	
	
	
	public Course dajCourse(String strID) {

		try {

			return repositoryCourse.findById(strID).get();
		} catch (Exception e) {
			return null;
		}
	}

	public void dodajCourse(Course course) {
//		repositoryTopic.save(topic);
		repositoryCourse.save(course);
		
	}

	public void promijeniCourse(Course course) {
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
		repositoryCourse.save(course);
		
	}

	public void obrisiCourse(String strID) {
//		for (Iterator<Topic> iterator = lstListaTopicsa.iterator(); iterator.hasNext();) {
//			Topic topicPomocni = (Topic) iterator.next();
//			
//			if (topicPomocni.getStrID().equals(strID)) {
//				lstListaTopicsa.remove(topicPomocni);
//				return;
//			}
//		}
		repositoryCourse.deleteById(strID);
		
	}
}
