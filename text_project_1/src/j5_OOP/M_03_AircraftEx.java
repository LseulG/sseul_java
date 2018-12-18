package j5_OOP;

public class M_03_AircraftEx {

	public static void main(String[] args) {
		Aircraft f35 = new Aircraft();
		System.out.println(f35.pilot);
		

	}

}

class Aircraft{
	int pilot = 1;
	double length = 51.4;
	double width = 35;
	double height = 14.2;
	double wingArea = 4.6;
	int ballWeight = 29300;
	int armedWeight = 49540;
	int maxTakeoffWeight = 70000;
	String radar = "AN/APG-81";
	String Engine = "프랫 앤 휘트니 F135";
	
	Aircraft(){
		System.out.println("전용기 하나 장만했다 =)");
	}
	
}
