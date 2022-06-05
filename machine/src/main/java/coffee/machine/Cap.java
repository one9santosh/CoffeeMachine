package coffee.machine;

public class Cap implements Machine{
	private String addCream;
	

	public String getAddCream() {
		return addCream;
	}

	public void setAddCream(String addCream) {
		this.addCream = addCream;
	}

	public void tasteofcoffee() {
		// TODO Auto-generated method stub
		System.out.println("Taste is  Delicious");
	}

	public void costofcoffee() {
		// TODO Auto-generated method stub
		System.out.println("Rs-100");
	}

}
