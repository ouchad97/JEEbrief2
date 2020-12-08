package Employe;

public class test {

	public static void main(String args []) {
		
		
		/* class EmployeFixe */
		
		EmployeFixe EF1 = new EmployeFixe(200);
		EF1.setNom("Hassan");
		EF1.ToString();
		

		/* class EmployeHoraire*/
		
		EmployeHoraire EH1 = new EmployeHoraire(33,10);
		EH1.setNom("Kamal");
		EH1.ToString();
		
		/* class EmployeCommission */
		
		EmployeCommission EC1 = new EmployeCommission(44,10);
		EC1.setSalaire(100);
		EC1.setNom("Ahmed");
		EC1.ToString();

	}
}
