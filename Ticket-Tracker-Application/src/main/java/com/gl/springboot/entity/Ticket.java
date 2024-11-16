package com.gl.springboot.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Ticker_Tracker")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int slNo;

    @Column(name="Ticket_Title")
    private String ticketTitle;

    @Column(name="Ticket_Short_Description")
    private String description;

    @Column(name="Created_On", updatable = false)
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date createdOn;

    @Column(name="Content")
    private String content;

//	public Ticket(int slNo, String ticketTitle, String description, Date createdOn, String content) {
//		super();
//		this.slNo = slNo;
//		this.ticketTitle = ticketTitle;
//		this.description = description;
//		this.createdOn = createdOn;
//		this.content = content;
//	}

	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
    
    
    
    
}
