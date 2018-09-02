package com.kk.fsd;

	import java.time.DayOfWeek;
	import java.time.LocalDate;
	import java.time.temporal.Temporal;
	import java.time.temporal.TemporalAdjuster;
	import java.time.temporal.TemporalAdjusters;

	public class SecondSundayOfNextWeek implements TemporalAdjuster {

		@Override
		public Temporal adjustInto(Temporal temporalAdjusterInput) {
			LocalDate temporalAdjusterDate = LocalDate.from(temporalAdjusterInput);
			LocalDate current = LocalDate.of(temporalAdjusterDate.getYear(),
					temporalAdjusterDate.getMonth().plus(1), 1);
			
			
			//System.out.println(current);
			

			// adjusting two weeks
			LocalDate secondSunday = current.with(
					TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)).with(
					TemporalAdjusters.next(DayOfWeek.SUNDAY));
			return secondSunday;
		}

		public static void main(String[] args) {
			LocalDate currentDate = LocalDate.now();
			SecondSundayOfNextWeek secondSundayAdjuster = 
					new SecondSundayOfNextWeek();
			LocalDate secondSunday = currentDate.with(secondSundayAdjuster);
			System.out.println("Next month second sunday is on :" + secondSunday);

		}
	}
	


