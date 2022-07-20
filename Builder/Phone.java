package Builder;

public class Phone {

	

	private final String display;
	private final String battery;
	private final String storage;
	private final String ram;
	
	public Phone(Builder builder) {
		this.display=builder.display;
		this.battery=builder.battery;
		this.storage=builder.storage;
		this.ram=builder.ram;
		
	}
	
	static class Builder{
		
		private String display;
		private String battery;
		private String storage;
		private String ram;
		
		public Phone build() {
			return new Phone(this);
		}
		
		public Builder(String display) {
			this.display=display;
		}
		
		public Builder battery(String battery) {
			this.battery=battery;
			return this;
			
			}
		
		public Builder storage(String storage) {
			this.storage=storage;
			return this;
			
			}
		
		public Builder ram(String ram) {
			this.ram=ram;
			return this;
			
			}
		
	}

	@Override
	public String toString() {
		return "Phone [display=" + display + ", battery=" + battery + ", storage=" + storage + ", ram=" + ram + "]";
	}
	
}
