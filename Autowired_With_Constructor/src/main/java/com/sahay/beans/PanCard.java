package com.sahay.beans;

public class PanCard {
	private String HolderName;
	private String panNo;
	
	public PanCard() {
		System.out.println("PanCard Object is Created");
	}

	public String getHolderName() {
		return HolderName;
	}

	public void setHolderName(String holderName) {
		HolderName = holderName;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "PanCard [HolderName=" + HolderName + ", panNo=" + panNo + "]";
	}

}
