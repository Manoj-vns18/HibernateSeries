package com.onetomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="anwermode")
public class Answer {
	@Id
	private int aid;
	
	private String Answr;
	@ManyToOne
	//@JoinColumn(name="Q_id")
	private Question quest;
	public Question getQuest() {
		return quest;
	}
	public void setQuest(Question quest) {
		this.quest = quest;
	}
	public Answer(Question quest) {
		super();
		this.quest = quest;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswr() {
		return Answr;
	}
	public void setAnswr(String answr) {
		Answr = answr;
	}
	public Answer(int aid, String answr) {
		super();
		this.aid = aid;
		Answr = answr;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
