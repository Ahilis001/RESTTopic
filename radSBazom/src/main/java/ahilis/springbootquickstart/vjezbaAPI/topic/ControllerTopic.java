package ahilis.springbootquickstart.vjezbaAPI.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * služi za REST
 * @author Ahilis
 *
 */
@RestController
public class ControllerTopic {
	
	@Autowired
	private ServiceTopic serviceTopic;
	
	@RequestMapping("/topics")
	public List<Topic> dajSveTopic() {
		
		return serviceTopic.dajSveTopic();
	}
	
	@RequestMapping("/topics/{strID}")
	public Topic dajTopic(@PathVariable String strID){
		return serviceTopic.dajTopic(strID);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void dodajTopic(@RequestBody Topic topic) {
		serviceTopic.dodajTopic(topic);
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{strID}")
	public void promijeniTopic(@RequestBody Topic topic, @PathVariable String strID) {
		serviceTopic.promijeniTopic(topic, strID);
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{strID}")
	public void promijeniTopic(@PathVariable String strID) {
		serviceTopic.obrisiTopic(strID);
		
	}

}
 