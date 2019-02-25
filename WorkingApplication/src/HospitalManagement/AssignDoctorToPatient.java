package HospitalManagement;

import java.util.List;

public class AssignDoctorToPatient implements Runnable {
	private List<Integer> taskQueue;

	private int MAX_CAPACITY;

	public AssignDoctorToPatient(List<Integer> sharedQueue, int size) {
		this.taskQueue = sharedQueue;
		this.MAX_CAPACITY = size;
	}

	@Override
	public void run() {
		int counter = 1;
		while (true) {
			try {
				doctorAppointment(counter++);
				if(counter==5) {
					break;
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void doctorAppointment(int i) throws InterruptedException {
		synchronized (taskQueue) {
			while (taskQueue.size() == MAX_CAPACITY) {
				System.out.println("Appointment is available " + Thread.currentThread().getName() + " is waiting , size: "
						+ taskQueue.size());
				taskQueue.wait();
			}

			Thread.sleep(1000);
			taskQueue.add(i);
			System.out.println("Doctor Number: " + i);

			taskQueue.notifyAll();
		}
	}
}
