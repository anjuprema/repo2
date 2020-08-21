package com.anju.stackusingll;

public class Process {
	public Integer processId;
	public String processName;
	
	public Integer getProcessId() {
		return processId;
	}
	public void setProcessId(Integer processId) {
		this.processId = processId;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	
	public Process(Integer id, String name) {
		this.processId = id;
		this.processName = name;
	}
	
	
}
