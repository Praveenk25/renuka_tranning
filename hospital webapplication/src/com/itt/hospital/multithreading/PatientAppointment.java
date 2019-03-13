package com.itt.hospital.multithreading;

import java.util.Collections;
import java.util.List;

public class PatientAppointment implements Runnable {
	public List<Integer> task;

	public PatientAppointment(List<Integer> sharedtask) {
		this.task = sharedtask;
		Collections.synchronizedList(task);
	}

	public void run() {
		while (true) {
			try {
				patientAppointment();

			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}

	public  void patientAppointment() throws InterruptedException {
		synchronized (task) {
			while(task.isEmpty()) {
				Thread.currentThread().setName("Patient");
				System.out.println("Appointment is not available, " + Thread.currentThread().getName()
						+ " is waiting , number of Doctors availabl " + task.size());
				task.wait();
				System.out.println("It is inside loop");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			int i = (Integer) task.remove(0);
			System.out.println("Patient Number: " + i + " is Appointed to Doctor ");
			task.notify();
		}
	}
}
