package Day3Asignment;

public class AddPartTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IS_ABSENT = 0;
		int Wage_Per_Hour = 20;
		int IS_PRESENT_FULL_TIME_WAGE = Wage_Per_Hour * 8;
		int IS_PRESENT_HALF_TIME_WAGE = Wage_Per_Hour * 4;
		double Empcheck = Math.floor(Math.random() * 10) % 3;

		int value = (int) Empcheck; // TO convert double value into integer

									// value
		switch (value) {

		case 1:
			System.out
					.println("Employee is present for full time and wage is Rs:"
							+ IS_PRESENT_FULL_TIME_WAGE);
			break;
		case 2:
			System.out
					.println("Employee is present for Half time and wage is Rs:"
							+ IS_PRESENT_HALF_TIME_WAGE);
			break;
		default:
			System.out
					.println("Employee is absent and wage is Rs:" + IS_ABSENT);
		}

	}

      
	}

