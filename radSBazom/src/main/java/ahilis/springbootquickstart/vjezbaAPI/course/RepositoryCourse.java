package ahilis.springbootquickstart.vjezbaAPI.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryCourse extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicStrID(String strTopicID);
	
	
}
