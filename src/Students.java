public class Students {
	int mark1;
	int mark2;
	int mark3;
	public Students(int mark1, int mark2, int mark3){
		super();
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	
	void display()
	{
		System.out.println("Marks in 1st subject "+mark1);
		System.out.println("Marks in 2nd subject "+mark2);
		System.out.println("Marks in 3rd subject "+mark3);
	}
}