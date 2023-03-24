package MyPack;

import java.util.Iterator;
import java.util.List;

public class Jobs {

	private int srNo;
	private String jobType;
	private List<JobIT> jobs;
	
	public Jobs() {
		super();
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public List<JobIT> getJobs() {
		return jobs;
	}

	public void setJobs(List<JobIT> jobs) {
		this.jobs = jobs;
	}
	
	public void JobInfo(){
		
		System.out.println(srNo+" "+jobType);
		System.out.println("Available Jobs...");
		
		Iterator<JobIT> itr = jobs.iterator();
		while(itr.hasNext()){
			
			System.out.println(itr.next());
		}
	}
}
