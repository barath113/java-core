package com.java.core.day1session1;

public class D01P02 {
	public static void main(String[] args) {
		MedicineInfo tablet = new Tablet();
		MedicineInfo syrup = new Syrup();
		MedicineInfo ointment = new Ointment();

		// Check polymorphic behavior of displayLabel() method
		tablet.displayLabel();
		syrup.displayLabel();
		ointment.displayLabel();
	}
}
