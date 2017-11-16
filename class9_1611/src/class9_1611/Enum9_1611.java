package class9_1611;

public class Enum9_1611 {
	public enum Status {
		PREPARE("Prepare shipping"), LOADED("Load on trunk"), DELIVER("Trunk out for delivery");
		String message;
		private Status(String msg) { this.message = msg;}
	}
	public static void main(String[] args) {
		Status shipping = Status.PREPARE;
		System.out.println(shipping);
		System.out.println(shipping.message);
	}

}
