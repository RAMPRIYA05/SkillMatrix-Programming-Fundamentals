package com.chainsys.skilltesttask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TaskStatus {

     List<Task> tasks= new ArrayList<>();

    

    public void addTask(String description, String deadline) {
        tasks.add(new Task(false, deadline, description));
    }

    public String markTaskComplete(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                task.setStatus(true);
                return "Task '" + description + "' marked as complete.";
            }
        }
        return "Task not found.";
    }

    public List<Task> listTasks() {
        List<Task> sortedTasks = new ArrayList<>(tasks);
        sortedTasks.sort(Comparator.comparing(Task::getDeadLine));
        return sortedTasks;
    }
   
    public void removeCompletedTasks() {
        Iterator<Task> complete = tasks.iterator();
        while (complete.hasNext()) {
            Task task = complete.next();
            if (task.isStatus()) {
            	complete.remove();
            }
        }
    }

    public static void main(String[] args) {
        TaskStatus track = new TaskStatus();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	System.out.println("Description:");
	  String description=sc.next();
	  System.out.println("Deadline");
	  String deadline=sc.next();
	        
	       track.addTask(description, deadline);

  }
        System.out.println("All tasks:");
        for (Task task : track.listTasks()) {
            System.out.println(task);
        }
         System.out.println("Enter Completed Task Description:");
         String description=sc.next();
         track.markTaskComplete(description);
         
       

        track.removeCompletedTasks();

        System.out.println("\nremoved completed ones:");
        for (Task task : track.listTasks()) {
            System.out.println(task);
        }
    }

	
}
