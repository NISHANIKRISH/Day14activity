package com;

public class Designation {
	private String designationType;

	public Designation(String designationType) {
		super();
		this.designationType = designationType;
	}

	public String getDesignationType() {
		return designationType;
	}

	@Override
	public String toString() {
		return "Designation [designationType=" + designationType +  "]";
	}
	 
}
