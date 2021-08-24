package techment.Assignment4_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author POONAM
 *4 – Patient List - Comparable and Comparator
Create a class Patient with private instance variables patientId (int), name(String) and age(int). Include parameterized Constructor and Getters/Setters

Create a class TestPatientList with a main method.
•	Create 3 objects of patient and add to an ArrayList
•	Sort the List based on Name which should be the natural order and display using for each loop
•	Sort the List based on age which should be the alternate sorting order and display using Iterator
•	Add all the objects in to a TreeSet and display the TreeSet
•	Create a static method getPatientAge which accepts name of the patient and TreeSet of patient. Method should return the age of patient. Invoke this method in the main method.

 */


class  Patient implements Comparable<Patient>
{
	private int patientId;
	private String name;
	private int age;

	public Patient(int patientId, String name, int age) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[PatientId :" + patientId + ", Name :" + name + ", Age :" + age + "]";
	}

	@Override
	public int compareTo(Patient o) {
		// TODO Auto-generated method stub
		return 0;
	}



}


class NameSorting implements Comparator<Patient>
{
	@Override
	public int compare(Patient o1, Patient o2) {
		return o1.getName().compareTo(o2.getName());
	}	
}


class AgeSorting implements Comparator<Patient>
{
	@Override
	public int compare(Patient o1, Patient o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
			return 0;
		else if (o1.getAge()>o2.getAge())
			return 1;
		else 
			return -1;
	}	
}


public class Exercise4_PatientList {

	public static void main(String[] args) {

		Patient patient1 = new Patient(1,"Poonam",22);
		Patient patient2 = new Patient(2,"Ashay",26);
		Patient patient3 = new Patient(3,"Shri",24);


		ArrayList <Patient> patients = new ArrayList<Patient>();

		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);

		for (Patient patient : patients)
		{	
			System.out.println("Id : "+patient.getPatientId()+" Name : "+patient.getName()+" Age : "+patient.getAge());

		}

		Collections.sort(patients,new NameSorting());
		System.out.println("=========================================");
		System.out.println("After sorting by Name Patients details : ");
		for (Patient patient : patients)
		{			
			System.out.println("Id : "+patient.getPatientId()+" Name : "+patient.getName()+" Age : "+patient.getAge());
		}

		Collections.sort(patients,new AgeSorting());
		System.out.println("=========================================");
		System.out.println("After sorting by Age Patients details : ");
		for (Patient patient : patients)
		{			
			System.out.println("Id : "+patient.getPatientId()+" Name : "+patient.getName()+" Age : "+patient.getAge());
		}

		System.out.println("=========================================");
		System.out.println("After sorting by Age Patients details by Iterator : ");
		Iterator<Patient> itr = patients.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}

		System.out.println("=========================================");
		System.out.println("After Storing patients objects into tree set : ");

		try { 
			Set<Patient> tsPatients = new TreeSet<Patient>();

			tsPatients.add(patient1);
			tsPatients.add(patient2);
			tsPatients.add(patient3);

			System.out.println("Tree set = "+tsPatients);

			for(Patient patient : tsPatients)
			{			
				//System.out.print(patient.getName() +": "+ patient.getAge());      
				getPatientAge(patient.getName(),tsPatients);
				System.out.println();          
			}

			//getPatientAge(String name,TreeSet tsPatients)
		}catch(Exception e)
		{
			System.out.println("caught "+e);
		}
	}

	private static void getPatientAge(String name ,Set<Patient> tsPatients)
	{
		for(Patient patient :tsPatients )
		{	
			System.out.print(name +": "+ patient.getAge());
			System.out.println();
		}


	}

}