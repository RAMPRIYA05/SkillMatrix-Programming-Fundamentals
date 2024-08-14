
//Task Tracker
//Scenario: You are managing a to-do list for a team project. You need to track tasks, their statuses, and deadlines.
//
//Challenge: Implement a task tracker where you can:
//
//Add a new task with a description and deadline.
//Mark a task as complete.
//List all tasks sorted by deadline.
//Remove completed tasks.

package com.chainsys.skilltesttask;



public class Task {
	  
	    boolean status;
	    String deadLine;
	    String description;
	    
		
		public Task( boolean status, String deadLine, String description) {
			super();
			
			this.status = status;
			this.deadLine = deadLine;
			this.description = description;
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
		
		
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Task [status=" + status + ", deadLine=" + deadLine + ", description=" + description + "]";
		}
		
		
	    
}
