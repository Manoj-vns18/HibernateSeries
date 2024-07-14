package com.onetomany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="questionmode")
public class Question 
{@Id
private int qid;
private String question;
@OneToMany(mappedBy="Answr")
 //this can not be used with one to many
private List<Answer> ans;
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Answer> getAns() {
	return ans;
}
public void setAns(List<Answer> ans) {
	this.ans = ans;
}
public Question(int qid, String question, List<Answer> ans) {
	super();
	this.qid = qid;
	this.question = question;
	this.ans = ans;
}
public Question() {
	super();
	// TODO Auto-generated constructor stub
}

}
