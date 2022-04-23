import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.TreeSet;

public class DataSetTester {

	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("0.00");
		DataSet bankData=new DataSet();
		bankData.add(new BankAccount(0));
		bankData.add(new BankAccount(10000));
		bankData.add(new BankAccount(2000));
		
		System.out.println("Bank Average Balance: "+bankData.getAverage());		
		Measurable max=bankData.getMax();
		System.out.println("Bank Highest Balance: "+max.getMeasure());		
		
		DataSet coinData=new DataSet();
		TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
			@Override
			public int compare(Coin o1, Coin o2) {
				return o1.getValue()<o2.getValue()?1:0;
			}
		});
		Coin coin1 = new Coin(0.25, "Quarter");
		Coin coin2 = new Coin(0.1, "Dime");
		Coin coin3 = new Coin(0.05, "Nickel");
		coinData.add(coin1);
		coinData.add(coin2);
		coinData.add(coin3);
		coins.add(coin1);
		coins.add(coin2);
		coins.add(coin3);

		System.out.println("Average Coin Value: "+df.format(coinData.getAverage()));		
		max=coinData.getMax();
		System.out.println("Highest Coin Balance: "+df.format(max.getMeasure()));		
		System.out.println("Highest Coin's Name: "+ coins.first().getName());
		
		DataSet studentData=new DataSet();

		Student student1 = new Student("Ali", 157.50);
		Student student2 = new Student("Alex", 165.00);
		Student student3 = new Student("Maria", 147.00);
		studentData.add(student1);
		studentData.add(student2);
		studentData.add(student3);
		System.out.println("Average Student's Height: "+df.format(studentData.getAverage()));
		max=studentData.getMax();
		System.out.println("Tallest Height: "+df.format(max.getMeasure()));
		Student stu=(Student)max;
		System.out.println("Tallest Student's Name: "+stu.getName());

	}

}
