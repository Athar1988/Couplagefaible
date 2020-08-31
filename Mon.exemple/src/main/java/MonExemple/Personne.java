package MonExemple;

public class Personne implements InterfacePersonne{

	private String nom;
	private int age;
	
	public String afficheAge(int age) {
	return "votre age est:" + age;
		
	}

	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}

	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String afficheNom(String nom) {
		return "votre nom est:" + nom;		
	}

}
