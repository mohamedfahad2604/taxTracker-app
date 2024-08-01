package com.gst.taxTracker.taxTrackerDomain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gst")
public class Gst {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 @Column(name = "gst")
	private double gst;
	private LocalDateTime effectiveFrom;
	private LocalDateTime effectiveTill;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public LocalDateTime getEffectiveFrom() {
		return effectiveFrom;
	}

	public void setEffectiveFrom(LocalDateTime effectiveFrom) {
		this.effectiveFrom = effectiveFrom;
	}

	public LocalDateTime getEffectiveTill() {
		return effectiveTill;
	}

	public void setEffectiveTill(LocalDateTime effectiveTill) {
		this.effectiveTill = effectiveTill;
	}

	@Override
	public String toString() {
		return "Gst [id=" + id + ", gst=" + gst + ", effectiveFrom=" + effectiveFrom + ", effectiveTill="
				+ effectiveTill + "]";
	}

	public Gst() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gst(Long id, double gst, LocalDateTime effectiveFrom, LocalDateTime effectiveTill) {
		super();
		this.id = id;
		this.gst = gst;
		this.effectiveFrom = effectiveFrom;
		this.effectiveTill = effectiveTill;
	}

}
