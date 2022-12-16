package com.springORM.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

@Entity
@Table(name="emailaccounts")
public class accounts {
	
	@Id
	@GenericGenerator(name="UID_Generator",strategy = "com.hibernate.demoproject.UIDGenerator")
	@GeneratedValue
	private long UID;
	
	public accounts(long uID,  long callid,
			Date createdtimestamp, String channel, Date lastUpdated) {
		super();
		UID = uID;
		
	
		this.callid = callid;
		this.createdtimestamp = createdtimestamp;
		this.channel = channel;
		this.lastUpdated = lastUpdated;
	}
	/*
	 * public profile getProfile() { return profile; }
	 * 
	 * public void setProfile(profile profile) { this.profile = profile; }
	 */

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="email") private profile profile;
	 */


	
	@Column(name ="call_id" ,unique = true,nullable = false,precision = 3,length = 50)
	private long callid;
	
	public accounts() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "accounts [UID=" + UID + " callid=" + callid
				+ ", createdtimestamp=" + createdtimestamp + ", channel=" + channel + ", lastUpdated=" + lastUpdated
				+ "]";
	}



	public long getCallid() {
		return callid;
	}

	public void setCallid(long callid) {
		this.callid = callid;
	}

	public Date getCreatedtimestamp() {
		return createdtimestamp;
	}

	public void setCreatedtimestamp(Date createdtimestamp) {
		this.createdtimestamp = createdtimestamp;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public long getUID() {
		return UID;
	}

	public void setUID(long uID) {
		UID = uID;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdtimestamp;
	
	private String channel;
	

	
	@Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdated;	

	
	
	

}

