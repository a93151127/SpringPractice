package com.luv2code.demo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	}
	@Override
	public String getDailyWork() {
		return "run 1 km";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public void phoneNumber() {
		System.out.println(123);
	}
	public void emailAddress() {
		System.out.println("abc@gmail.com");
	}

}
