package DailyWork.appointment;
public interface Appointment_Implement {
	enum Code{
		ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN
	}
	Code getCode(int result);
}
