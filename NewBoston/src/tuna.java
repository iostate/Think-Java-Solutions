/**
 * Exercise 36 of Java Programming Tutorial by NewBoston.
 * https://www.youtube.com/watch?v=o4Or0PMI_aI&index=36&list=PLFE2CE09D83EE3E28
 * @author Quan Truong
 *
 */


public class tuna {
	
	private int hour, minute, second;

	/**
	 * Check the user input to make sure they fall within the right range.
	 * @param h 
	 * 				Hour
	 * @param m
	 * 			Minute
	 * @param s
	 * 			Seconds
	 */
	public void setTime(int h, int m, int s) {
		
		//if hour is greater than 0 and less than 24 than you can assign hour to h, if not then assign it 0
		hour = ((h>=0 && h<24) ? h : 0);
		minute = ((m>=0 && m<60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
	
	}
	
	/**
	 * Formats the time to military time.
	 * Can use in conjunction with setTime
	 * @return Returns the military time. 
	 */
	public String toMilitary() {
		
		return String.format("%02d:%02d:%02d", hour, minute, second );
	}
	
	public String toString() {
																			// 8 % 12 = 4 ??
		return String.format("%d:%02d:%02d $s", ((hour==0 || hour==12) ? 12 : hour % 12), minute, second, (hour < 12 ? "AM" : "PM") );
	}
	
	public void simpleMessage(String name) {
		System.out.println("Hello " + name);
	}
	

}
