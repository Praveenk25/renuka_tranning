package com.itt.hospital.multithreading;

import java.util.List;

public class DoctorAppointment implements Runnable {
	public List<Integer> task;
	public int Max_Capacity;

	public DoctorAppointment(List<Integer> sharedtask, int size) {
		this.task = sharedtask;
		this.Max_Capacity = size;
	}

	public void run() {
		int counter = 1;
		while (true) {
			try {
				doctorAppointment(counter++);
				if (counter == 5) {
					break;
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	public void doctorAppointment(int i) throws InterruptedException {
		synchronized (task) {
			while (task.size() == Max_Capacity) {
				Thread.currentThread().setName("Doctor");
				System.out.println("Appointment is available " + Thread.currentThread().getName()
						+ " is waiting , number of Doctors Available: " + task.size());
				task.wait();
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
			task.add(i);
			System.out.println("Doctor Number: " + i + " Available ");
			task.notify();
		}
	}
}
