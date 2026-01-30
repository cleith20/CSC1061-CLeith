
public class RealTimeRemoteCourse extends OnlineCourse {
	private String zoomInfo = "N/A";

	public RealTimeRemoteCourse(String courseName, int numOfStu, int maxStu, int creds, String zoomInfo) {
		super(courseName, numOfStu, maxStu, creds);
		this.zoomInfo = zoomInfo;
	}

	@Override
	public String toString() {
		return "Real Time Remote Course: " + super.toString() + "\nZoom Info = " + zoomInfo;
	}
	
	
}
