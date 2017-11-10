package com.springboot.study.entity;

import java.io.Serializable;

public class TicketOD implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1646420231343761069L;

	private Long planeTicketId;

	private Long planeOdId;

	public Long getPlaneTicketId() {
		return planeTicketId;
	}

	public void setPlaneTicketId(Long planeTicketId) {
		this.planeTicketId = planeTicketId;
	}

	public Long getPlaneOdId() {
		return planeOdId;
	}

	public void setPlaneOdId(Long planeOdId) {
		this.planeOdId = planeOdId;
	}
}