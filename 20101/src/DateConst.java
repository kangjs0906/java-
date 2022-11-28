class Data {
	
	int year;
	String month;
	int day;
	
	Data() {
		this(1900, "1¿ù", 1);
	}
	
	Data(int y) {
		this(y, "1¿ù", 1);
	
	}
	
	Data(int year, String month, int day) {
		this.year=year;
	}
	
	@Override
	public String toSrting() {
		return "Data[year"+year+", month="+month+", day="+day+"]";
	}
}



public class DateConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
