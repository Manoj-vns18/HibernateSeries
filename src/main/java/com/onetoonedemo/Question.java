package com.onetoonedemo;
import javax.persistence.*;


@Entity
@Table(name="qnsr")
public class Question {
	@Id
	private int qid;
	private String question;
	@OneToOne
	private Answer ans;
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
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	public Question(int qid, String question, Answer ans) {
		super();
		this.qid = qid;
		this.question = question;
		this.ans = ans;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Question [qid=" + qid + ", question=" + question + ", ans=" + ans + "]";
	}
	

}
