package com.hcl.hospital;

import java.util.Comparator;

public class Doctor {

	int doctorId;
	String name;
	String specialty;

	public Doctor(int doctorId, String name, String specialty) {

		this.doctorId = doctorId;
		this.name = name;
		this.specialty = specialty;

	}

}

class DocSortById implements Comparator<Doctor> {

	public int compare(Doctor doc1, Doctor doc2) {

		if (doc1.doctorId == doc2.doctorId) {
			return 0;
		} else if (doc1.doctorId < doc2.doctorId) {
			return -1;
		} else {
			return 1;
		}

	}
}

class DocSortByName implements Comparator<Doctor> {

	public int compare(Doctor doc1, Doctor doc2) {

		return doc1.name.compareTo(doc2.name);
	}
}

class SortBySpecialty implements Comparator<Doctor> {

	public int compare(Doctor doc1, Doctor doc2) {

		return doc1.specialty.compareTo(doc2.specialty);
	}
}

