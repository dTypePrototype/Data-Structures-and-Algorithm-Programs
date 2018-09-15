public class DemoStudents extends Students implements Operation{
	public DemoStudents(int mark1, int mark2, int mark3){
		super(mark1, mark2, mark3);
	}
	@Override
	public double percentage()
	{
		double per=(mark1+mark2+mark3)/3;
		return per;
	}
	@Override
	public char grades()
	{
		char grade;
		if(percentage()>=90)
		{
			grade='A';
		}
		else if(percentage()>=80 && percentage()<90)
		{
			grade='B';
		}
		else 
		{
			grade='C';
		}
		return grade;
	}
}