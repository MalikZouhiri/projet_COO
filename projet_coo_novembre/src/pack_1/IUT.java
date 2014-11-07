package pack_1;

import java.util.*;

public class IUT {
	
	private String chNom;
	private String chAdresse;
	private String chNumero;
	private HashSet <Etudiant> chEtudiants;
	private HashSet <Departement> chDepartements;
	
	
	public String getNom()
	{
		return chNom;
	}
	
	public String getAdresse()
	{
		return chAdresse;
	}
	
	public String getNumero()
	{
		return chNumero;
	}
	
	public void addEtudiant(Etudiant parEtudiant)
	{
		chEtudiants.add(parEtudiant);
	}
	
	public void supprEtudiant(Etudiant parEtudiant)
	{
		chEtudiants.remove(parEtudiant);
	}
	
	public void addDepartement(Departement parDepartement)
	{
		chDepartements.add(parDepartement);
	}
	
	
	

}
