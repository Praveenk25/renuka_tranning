package HospitalManagement;

import java.util.List;

public class AssignPatientToDoctor implements Runnable {
	private List<Integer> task;

	public AssignPatientToDoctor(List<Integer> sharedtask) {
		this.task = sharedtask;
	}

	@Override
	public void run() {
		while (true) {
			try {
				patientAppointment();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}

		}
	}

	private void patientAppointment() throws InterruptedException {
		synchronized (task) {
			while (task.isEmpty()) {
				System.out.println("Appointment is not available, " + Thread.currentThread().getName() + " is waiting , size: "
						+ task.size());
				task.wait();
			}
			Thread.sleep(1000);
			int i = (Integer) task.remove(0);
			System.out.println("Patient Number: " + i);

			task.notifyAll();
		}
	}
}
