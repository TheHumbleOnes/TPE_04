package de.hs_mannheim.tpe.imb.ss14.g02.uebung4;

import java.util.HashMap;

public class Zeit {
	private int hour;
	private int minute;

	public Zeit(String zeit) throws wrongDateExeption{
		if(zeit.length()>5){
			throw new wrongDateExeption("Kein korrekte Zeitangabe, Text zu lang!");
		}else if(!zeit.contains(":")){
			throw new wrongDateExeption("Kein korrektes Datumsformat angegeben");
		}else{
			int temphour = Integer.parseInt(zeit.substring(0, 2));
			int tempmin = Integer.parseInt(zeit.substring(3));
			if(checkDate(temphour, tempmin)){
				this.hour = temphour;
				this.minute = tempmin;
			}
		}
	}

	public Zeit(int hour, int minute) {
		if(checkDate(hour, minute)){
			this.hour = hour;
			this.minute = minute;
		}
	}
	private boolean checkDate(int hour, int minute){
		if (hour > 24) {
			return false;
		} else if (minute > 59) {
			return false;
		}
		return true;
	}
	public String toString() {
		return hour + ":" + minute;

	}

	@Override
	public int hashCode() {
		
		int result;
		result = hour * 100;
		result = result + minute;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zeit other = (Zeit) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}
}
