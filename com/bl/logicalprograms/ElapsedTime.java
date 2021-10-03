package com.bl.logicalprograms;

import java.time.temporal.ChronoUnit;

import java.time.*;

public class ElapsedTime {
	public static void  ToConvertInMinutes(long minutes) {
		
		long toConvertInMinutes = minutes % 60 ;
		System.out.println(toConvertInMinutes+  "Minutes");
	    
	}
	
	public static void ToConvertInSeconds(long seconds) {
		
		long toConvertInSeconds= seconds % 60 ;
		System.out.println(toConvertInSeconds+  "Seconds");
		
	}
	public static void main(String[] args){
		
		LocalTime StartTime = LocalTime.of(19, 21, 40);
		LocalTime StopTime = LocalTime.of(23, 22, 00);
		long hours = ChronoUnit.HOURS.between(StartTime, StopTime);
		long minutes = ChronoUnit.MINUTES.between(StartTime, StopTime);
		long seconds = ChronoUnit.SECONDS.between(StartTime, StopTime);
		System.out.println("Diffrence is" +hours+ "Hours");
		ToConvertInMinutes(minutes);
	    ToConvertInSeconds(seconds);
		
		
	 }
}
