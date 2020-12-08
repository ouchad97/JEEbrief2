package Employe;

public class EmployeHoraire extends Employe {
	protected double taux_horaire;
	protected int heures_prestees;
	
	
	public EmployeHoraire(double taux_horaire, int heures_prestees) {
		super();
		this.taux_horaire = taux_horaire;
		this.heures_prestees = heures_prestees;
	}
	public double getTaux_horaire() {
		return taux_horaire;
	}
	public void setTaux_horaire(double taux_horaire) {
		this.taux_horaire = taux_horaire;
	}
	public int getHeures_prestees() {
		return heures_prestees;
	}
	public void setHeures_prestees(int heures_prestees) {
		this.heures_prestees = heures_prestees;
	}
	
	public double calcule_salire_horaire() {
		double salaire= this.taux_horaire * this.heures_prestees;
		return salaire;
	}
	
	  public void ToString() {
			System.out.println("Bonjour "+this.getNom() +" Votre salaire mensuel est: "+ calcule_salire_horaire()  +" MAD");
	    }
}
