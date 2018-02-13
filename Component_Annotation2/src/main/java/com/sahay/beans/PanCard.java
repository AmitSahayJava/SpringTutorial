package com.sahay.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PanCard {
	@Value("#{employee.name}")
	private String holderName;
	private String panNo="DFIPK1170P";

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getPanNo() {
		return panNo;
	}

	@Override
	public String toString() {
		return "PanCard [holderName=" + holderName + ", panNo=" + panNo + "]";
	}

	

}
