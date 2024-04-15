package org.emp.qn11;
import org.company.qn11.Company;
import org.client.qn11.Client;
import org.project.qn11.Project;

public class Employee {
	private void empName() {
		System.out.println("the employee name is aravind");
	}
	

	public static void main(String[] args) {
		Employee em=new Employee();
		em.empName();
		
		Company cm=new Company();
		cm.companyName();
		
		Client cl=new Client();
		cl.clientName();
		
		Project pr=new Project();
		pr.projectName();
	
	}

}
