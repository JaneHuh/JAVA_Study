package org.java_study.hw4;

public class Time { // encapsulation
	private int hour; // private
	private int minute;
	private int second;

	public int getHour() { return hour; } // Getter
	public void setHour(int hour) { // Setter
		if (hour < 0 || hour > 23) return;
		this.hour = hour;
	}

	public int getMinute() { return minute;	} // Getter
	public void setMinute(int minute) { // Setter
		if (minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	
	public int getSecond() { return second;	} // Getter
	public void setSecond(int second) { // Setter
		if (second < 0 || second > 59) return;
		this.second = second;
	}

	public String toString() { // Object Ŭ���� �� toString() �������̵�
		return hour + ":" + minute + ":" + second;
	}
	
	Time(){} // �⺻ ������(default constructor)
	
	Time(int hour, int minute, int second){ // ������
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public static void main(String[] args) {
		Time t = new Time(12, 35, 30);
		// System.out.println(t.toString());
		System.out.println(t);
		// t.hour = 13; // ��������� ���� ���� -> ����!!
		
		// ����ð����� 1�ð� �ķ� �����Ѵ�. 
		t.setHour(t.getHour() + 1);
		System.out.println(t);
	}

}
