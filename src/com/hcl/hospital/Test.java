package com.hcl.hospital;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		Doctor doc1 = new Doctor(1, "Joen", "Organ Transplants");
		Doctor doc2 = new Doctor(22, "Mack", "Diabetes");
		Doctor doc3 = new Doctor(14, "Joe", "Cardiology");

		ArrayList<Doctor> docsList = new ArrayList<Doctor>();

		docsList.add(doc1);
		docsList.add(doc2);
		docsList.add(doc3);

		Collections.sort(docsList, new DocSortById());

		for (Doctor d : docsList) {
			System.out.println(d.doctorId);
		}
		System.out.println();

		Collections.sort(docsList, new DocSortByName());
		for (Doctor d : docsList) {
			System.out.println(d.name);
		}

		System.out.println();

		Collections.sort(docsList, new SortBySpecialty());
		for (Doctor d : docsList) {
			System.out.println(d.specialty);
		}
		
		
		Patient pat1 = new Patient(5, "Taylor", 33);
		Patient pat2 = new Patient(2, "Axelrod", 36);
		Patient pat3 = new Patient(3, "Chuck", 21);
		System.out.println();
		
		ArrayList<Patient> patList = new ArrayList<Patient>();
		
		patList.add(pat1);
		patList.add(pat2);
		patList.add(pat3);
		
		Collections.sort(patList, new SortById());
		for(Patient p : patList) {
			
			System.out.println(p.patientId);
		}
		System.out.println();
		Collections.sort(patList, new SortByName());
		for(Patient p : patList) {
			
			System.out.println(p.name);
		}
		System.out.println();
		Collections.sort(patList, new SortByAge());
		for(Patient p : patList) {
			
			System.out.println(p.age);
		}
		System.out.println();
		
		

	}

}
