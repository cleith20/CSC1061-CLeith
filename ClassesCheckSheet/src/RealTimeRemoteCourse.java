
public class RealTimeRemoteCourse extends OnlineCourse {
	private String zoomInfo = "N/A";

	public RealTimeRemoteCourse(String zoomInfo) {
		super();
		this.zoomInfo = zoomInfo;
	}

	@Override
	public String toString() {
		return super.toString() + "\nReal Time Remote Course: \nZoom Info = " + zoomInfo;
	}
	
	
}
