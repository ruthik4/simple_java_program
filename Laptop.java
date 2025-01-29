
public class Laptop {
	private String type;
	private String model;
	private int ram;
	private int rom;
	private String processor;
	private int price;
	public Laptop(String type, String model, int ram, int rom, String processor, int price) {
		super();
		this.type = type;
		this.model = model;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getRom() {
		return rom;
	}
	public void setRom(int rom) {
		this.rom = rom;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [type=" + type + ", model=" + model + ", ram=" + ram + ", rom=" + rom + ", processor="
				+ processor + ", price=" + price + "]";
	}
	

}
