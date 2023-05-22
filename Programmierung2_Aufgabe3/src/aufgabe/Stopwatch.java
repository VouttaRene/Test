package aufgabe;

public class Stopwatch {

	private long startTime;
	private long duration;
	private boolean isActive = false;
	
	//Default Konstruktor
	public Stopwatch() {}
	
	protected void startStopwatch() {
		if(!isActive) {
			startTime = System.nanoTime();
			isActive = true;
		}
			
	}
	
	protected void stoppStopwatch() {
		if(isActive) {
			startTime = 0;
			isActive = false;
		}
	}
	
	private void calculateTime() {
		if(isActive)
			setDuration(System.nanoTime() - startTime);
		else
			System.out.println("Fehler: Zeit Berechnung!");
	}

	public long getDuration() {
		calculateTime();
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
}
