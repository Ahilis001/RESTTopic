package ahilis.springbootquickstart.vjezbaAPI.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ahilis.springbootquickstart.vjezbaAPI.topic.Topic;

@RestController
public class ControllerCourse {
	
	@Autowired
	private ServiceCourse serviceCourse;
	
	@RequestMapping("/topics/{strID}/courses")
	public List<Course> dajSveTopic(@PathVariable String strID) {
		
		return serviceCourse.dajSveCourse(strID);
	}
	
	@RequestMapping("/topics/{topicStrID}/courses/{courseStrID}")
	public Course dajTopic(@PathVariable String courseStrID){
		return serviceCourse.dajCourse(courseStrID);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicStrID}/courses")
	public void dodajTopic(@RequestBody Course course, @PathVariable String topicStrID) {
		course.setTopic(new Topic(topicStrID,"",""));
		serviceCourse.dodajCourse(course);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicStrID}/courses/{courseStrID}")
	public void promijeniTopic(@RequestBody Course course, @PathVariable String topicStrID, @PathVariable String courseStrID) {

		course.setTopic(new Topic(topicStrID,"",""));
		serviceCourse.promijeniCourse(course);
		
	}
	

	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicStrID}/courses/{courseStrID}")
	public void promijeniTopic(@PathVariable String courseStrID) {
		serviceCourse.obrisiCourse(courseStrID);
		
	}

}
 