package com.shrinkme.bean;

public class EmployeeBean {

	private int id;
	private String name;
	private AddressBean addressBean;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public AddressBean getAddressBean() {
		return addressBean;
	}


	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}


	@Override
	public String toString() {
		return "EmployeeBean [id=" + id + ", name=" + name + ", addressBean=" + addressBean + "]";
	}

}
