package java_class;

public class Car {	// 클래스 이름
	
	private String modelName;	// 필드
	private int modelYear;		// 필드
	private String Color;

	Car(String modelName, String Color ,int ModelYear){	// 생성자
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.Color = Color;
	}
	
	public String getModel() {	// 메소드
		return this.modelYear+"년식 "+this.modelName+" "+this.Color;
	}
}
