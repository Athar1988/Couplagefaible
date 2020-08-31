package Principale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import EtudiantHerite.InterfaceEtudiant;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"configuration.xml");
		InterfaceEtudiant IE=(InterfaceEtudiant) context.getBean("etudiant");
		IE.affichageInformation();
	}

}
