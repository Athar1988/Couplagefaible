package pres;

import java.io.File;
import java.util.Scanner;

import Dao.Idao;
import Metier.Impmetier;

public class Presentation {


	public static void main(String[] args) {
		//Impmetier IM= new Impmetier();
		//System.out.println(IM.calcule());
		try {
  Scanner sc= new Scanner(new File("config.txt"));
  //nom des classe que nous allons utiliser a partier du fichier .txt
  //nom des classe que nous allons utiliser a partier du fichier .txt
  String  daoclass=sc.next();
  String  metierclass=sc.nextLine();
  System.out.println(daoclass+" "+metierclass);
  Class cDao= Class.forName(daoclass);
  Idao Dao=(Idao)cDao.newInstance(); 
  System.out.println(Dao.getValue());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
