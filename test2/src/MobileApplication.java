public class MobileApplication {

	public static void main(String[] args) {
		MobileDevice m1 = new SmartPhone("Samsung","S20","Galaxy");
		MobileDevice m2 = new BasicPhone("Sonny Ericson","Walkman");
		System.out.println("SmartPhone Dedtail:");
		System.out.println("Manufacturer:"+m1.getManufacturer());
		System.out.println("Model:"+m1.getModel());
		SmartPhone smartPhone = (SmartPhone) m1;
		System.out.println("Type:"+smartPhone.getType());
		m1.setStation("Hot FM");
		m1.setFrequency(97.60);
		m2.setStation("Fly FM");
		m2.setFrequency(109.8);
		m1.printDetails();
		System.out.println("Basic Phone Dedtail:");
		System.out.println("Manufacturer:"+m2.getManufacturer());
		System.out.println("Model:"+m2.getModel());
		m2.printDetails();

	}

}