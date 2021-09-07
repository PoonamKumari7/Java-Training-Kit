package techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import techment.model.Restraunt;

public class RestrauntClient {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Restraunt restraunt = (Restraunt) factory.getBean("r");
		restraunt.displayRestrauntDetails();

	}

}
