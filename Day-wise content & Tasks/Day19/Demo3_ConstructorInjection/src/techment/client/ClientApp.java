package techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import techment.model.Employee;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource = new ClassPathResource("object.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee employee = (Employee) factory.getBean("e");
		System.out.println(employee.toString());

	}

}
