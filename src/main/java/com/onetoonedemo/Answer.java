package com.onetoonedemo;
import javax.persistence.*;
@Entity
@Table(name="ansr")
public class Answer {
	@Id
	private int Ansid;
	private String ans;
	public int getAnsid() {
		return Ansid;
	}
	public void setAnsid(int ansid) {
		Ansid = ansid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public Answer(int ansid, String ans) {
		super();
		Ansid = ansid;
		this.ans = ans;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Answer [Ansid=" + Ansid + ", ans=" + ans + "]";
	}

}
