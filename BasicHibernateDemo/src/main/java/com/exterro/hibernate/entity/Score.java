package com.exterro.hibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Score {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scoreId;
	@JoinColumn(name = "studId")
	@OneToOne()
	private Student studId;
	private int maths;
	private int physics;
	private int chemistry;

	public Score() {
		super();
	}

	public Score(Student studId, int maths, int physics, int chemistry) {
		super();

		this.studId = studId;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
	}

	public int getScoreId() {
		return scoreId;
	}

	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}

	public Student getStudId() {
		return studId;
	}

	public void setStudId(Student studId) {
		this.studId = studId;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "Score [scoreId=" + scoreId + ", studId=" + studId + ", maths=" + maths + ", physics=" + physics
				+ ", chemistry=" + chemistry + "]";
	}
}
