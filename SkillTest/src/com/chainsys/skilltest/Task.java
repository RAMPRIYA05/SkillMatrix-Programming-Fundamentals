//Task Tracker
//Scenario: You are managing a to-do list for a team project. You need to track tasks, their statuses, and deadlines.
//
//Challenge: Implement a task tracker where you can:
//
//Add a new task with a description and deadline.
//Mark a task as complete.
//List all tasks sorted by deadline.
//Remove completed tasks.


package com.chainsys.skilltest;

public class Task {
    String tasks;
    boolean status;
    String deadLine;
    
    
	public Task(String tasks, boolean status, String deadLine) {
		super();
		this.tasks = tasks;
		this.status = status;
		this.deadLine = deadLine;
	}
	public String getTasks() {
		return tasks;
	}
	public void setTasks(String tasks) {
		this.tasks = tasks;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(String deadLine) {
		this.deadLine = deadLine;
	}
	@Override
	public String toString() {
		return "Task [tasks=" + tasks + ", status=" + status + ", deadLine=" + deadLine + "]";
	}
    
    
}
