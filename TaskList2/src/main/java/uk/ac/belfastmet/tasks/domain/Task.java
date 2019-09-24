/**
 * 
 */
package uk.ac.belfastmet.tasks.domain;

import java.util.Date;

/**
 * @author William - BASIC
 *
 */

public class Task {


		

		private String userName;

		private String taskName;

		private String description;

		private String priority;

		private Date completionDate;

		private boolean completed;
	



public Task() {
	super();
}


public Task(String userName, String taskName, String description, String priority, Date completionDate,
		boolean completed) {
	super();
	this.userName = userName;
	this.taskName = taskName;
	this.description = description;
	this.priority = priority;
	this.completionDate = completionDate;
	this.completed = completed;
}



public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getTaskName() {
	return taskName;
}

public void setTaskName(String taskName) {
	this.taskName = taskName;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getPriority() {
	return priority;
}

public void setPriority(String priority) {
	this.priority = priority;
}

public Date getCompletionDate() {
	return completionDate;
}

public void setCompletionDate(Date completionDate) {
	this.completionDate = completionDate;
}

public boolean isCompleted() {
	return completed;
}

public void setCompleted(boolean completed) {
	this.completed = completed;
}

}