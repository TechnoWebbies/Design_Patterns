package Builder;

public class Application {
	
	public static void main(String[] args) {
		
		Phone.Builder builder = new Phone.Builder("Amoled");
		
		Phone phone = builder.battery("5000mAh").storage("128GB").ram("6GB").build();
		
		System.out.println(phone);
		
	}
	

}
