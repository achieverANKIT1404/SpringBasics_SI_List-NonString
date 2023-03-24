package MyPack;

import java.util.Date;

public class JobIT {

	private String jobName;
	private String postBy;
	private Date postDate;
	
	public JobIT() {
		super();
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getPostBy() {
		return postBy;
	}

	public void setPostBy(String postBy) {
		this.postBy = postBy;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "JobIT [jobName=" + jobName + ", postBy=" + postBy + ", postDate=" + postDate + "]";
	}
	
}
