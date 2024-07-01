package ramya;

abstract class EngGraduate {
	abstract Void clearAllExams(); // abstract method

	void attendLab() // non abstract method 
	{
	 System.out.print(“Sriram attended all labs”);
	}
	void attendance()
	{
	 System.out.println(“Sriram has proper attendance”);

	}


	}

	class AbstClass extends EngGraduate
	{
	Void ClearAllExams()
	{
	 System.out.print(“arrear”);
	}

	public static void main(String args[])
	 {
	  AbstClass ab=new AbstClass();
	ab. ClearAllExams();
	ab. attendLab();
	ab. attendance();

	}

	

	}


