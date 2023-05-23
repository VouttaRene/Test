package aufgabe;
/**
 * 
 * @author René Voutta
 * @mail u38509@hs-harz.de
 * @version 1.0
 * 
 * This class is the basis for the 'Stopwatch'
 *
 */
public class Stopwatch {

	private long startTime;
	private long duration;
	private boolean isActive = false;
	
	//Default Konstruktor
	public Stopwatch() {}
	
	/**
	 * This method starts the stopwatch
	 */
	protected void startStopwatch() {
		if(!isActive) {
			startTime = System.nanoTime();
			isActive = true;
		}
	}
	
	/**
	 * This method ends the stopwatch
	 */
	protected void stoppStopwatch() {
		if(isActive) {
			startTime = 0;
			isActive = false;
		}
	}
	
	/**
	 * This method calculates the passed time in nanoscéconds
	 */
	private void calculateTime() {
		if(isActive)
			setDuration(System.nanoTime() - startTime);
		else
			System.out.println("Fehler: Zeit Berechnung!");
	}

	//Getter
	public long getDuration() {
		calculateTime();
		return duration;
	}

	//Setter
	public void setDuration(long duration) {
		this.duration = duration;
	}
}
