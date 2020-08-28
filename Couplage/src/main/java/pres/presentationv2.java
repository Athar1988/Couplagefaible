package pres;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import Metier.Imetier;

public class presentationv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Imetier metier=(Imetier) context.getBean("M");
		System.out.println(metier.calcule());
	}

}
