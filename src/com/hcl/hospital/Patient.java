package com.hcl.hospital;

import java.util.Comparator;

public class Patient {

	int patientId;
	String name;
	int age;

	public Patient(int patientId, String name, int age) {

		this.patientId = patientId;
		this.name = name;
		this.age = age;

	}

}

class SortById implements Comparator<Patient> {

	public int compare(Patient pat1, Patient pat2) {

		if (pat1.patientId == pat2.patientId) {
			return 0;
		} else if (pat1.patientId < pat2.patientId) {
			return -1;
		} else {
			return 1;
		}

	}
}

class SortByName implements Comparator<Patient> {

	public int compare(Patient pat1, Patient pat2) {

		return pat1.name.compareTo(pat2.name);
	}
}

class SortByAge implements Comparator<Patient> {

	public int compare(Patient pat1, Patient pat2) {

		if (pat1.age == pat2.age) {
			return 0;
		} else if (pat1.age < pat2.age) {
			return -1;
		} else {
			return 1;
		}
	}
}
