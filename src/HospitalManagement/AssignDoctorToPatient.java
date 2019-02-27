package HospitalManagement;

import java.util.List;

public class AssignDoctorToPatient implements Runnable {
	private List<Integer> task;

	private int MAX_CAPACITY;

	public AssignDoctorToPatient(List<Integer> sharedtask, int size) {
		this.task = sharedtask;
		this.MAX_CAPACITY = size;
	}

	@Override
	public void run() {
		int counter = 1;
		while (true) {
			try {
				doctorAppointment(counter++);
				if(counter==6) {
					break;
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void doctorAppointment(int i) throws InterruptedException {
		synchronized (task) {
			while (task.size() == MAX_CAPACITY) {
				System.out.println("Appointment is available " + Thread.currentThread().getName() + " is waiting , size: "
						+ task.size());
				task.wait();
			}

			Thread.sleep(1000);
			task.add(i);
			System.out.println("Doctor Number: " + i);

			task.notifyAll();
		}
	}
}
