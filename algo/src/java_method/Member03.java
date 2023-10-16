package java_method;

class Car{
	
	private String modelName;
	private int modelYear;
	private String color;
	private int maxSpeed;
	private int currentSpeed;
	
	{	// 인스턴스 초기화 블록
		this.currentSpeed = 0;
	}
	
	Car(){}
	Car(String modelName, int modelYear, String color, int maxSpeed){
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public int getSpeed() {
		return currentSpeed;
	}
}

public class Member03 {
	public static void main(String[] args) {
		Car myCar = new Car();	// 인스턴스 생성
		System.out.println(myCar.getSpeed());  // 인스턴스 메소드의 호출

	}

}
