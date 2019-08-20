package com.samba.springbootlog4j2;

public class Model {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Model() {
		super();
	}

	public Model(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Model [name=" + name + "]";
	}
	

	
}
