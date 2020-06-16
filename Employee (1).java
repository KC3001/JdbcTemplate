package com.package1;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private String ename;
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEpay() {
		return epay;
	}
	public void setEpay(int epay) {
		this.epay = epay;
	}
	public Address getAddress() {
		return address;
	}

	/*
	 * public void setAddress(Address address) { this.address = address; }
	 */
	private int eid;
	private int epay;
	@Autowired
	private Address address;


}
