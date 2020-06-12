package unit08;

public class Counter {

	private int value;

	public Counter() { // initialization of the counter with default values (15)
		value = 15;
	}

	public Counter(int value) { // initialization of the counter with arbitrary values
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue(int value) {
		return value;
	}

	public Counter decreaseValue(int lowerEnd, int upperEnd) {// decrease the current counter value by 1

		Counter tempValue;
		if (value <= lowerEnd) {

			tempValue = new Counter(value);
			System.out.println("impossible to decrease, value will be out of range");
		} else {
			if (value>upperEnd) {
				tempValue = new Counter(value);
				System.out.println("impossible to decrease, value will be out of range");
			} else {
			tempValue = new Counter(value - 1);
		}}
		return tempValue;

	}

	public Counter increaseValue(int lowerEnd, int upperEnd) {// increase the current counter value by 1

		Counter tempValue;

		if (value >= upperEnd) {
			tempValue = new Counter(value);
			System.out.println("impossible to increase, value will be out of range");
		} else {
			if (value < lowerEnd) {
				tempValue = new Counter(value);
				System.out.println("impossible to increase, value will be out of range");
			} else {
				tempValue = new Counter(value + 1);
			}
		}
		return tempValue;
	}

	public void getCurrentValue() {
		System.out.println("current counter value = " + value);
	}
}
