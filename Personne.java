public class Personne extends Obejct{

private String prenom;
private String nom;

public Personne(String name, String firstname){

	this.nom    = name;
	this.prenom = firstname;
	}

public String getPrenom(){
	return this.prenom;
	}
public String getNom(){
	return this.nom;
}

public void setPrenom(String firstname){
	this.prenom = firstname;
}


}
