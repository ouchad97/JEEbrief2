package Employe;

public class EmployeCommission extends EmployeFixe {

    protected double Commission;
    protected int Ventes;
	public EmployeCommission(double commission, int ventes) {
		super();
		Commission = commission;
		Ventes = ventes;
	}
	
	
	public double Calcule_salaire_commission() {
		double salaire_mensuel=getSalaire() + this.Commission * this.Ventes;
		return salaire_mensuel;
	}
	  public void ToString() {
	 		System.out.println("Bonjour "+getNom() +" Votre salaire mensuel est: "+ Calcule_salaire_commission() +" MAD");
	 	}
    
}
