class StudentBody{
	public static void main(String []args){
		Subject sub1[]= {new Subject("INT102", "Java", 45),new Subject("INT105", "Java2", 50), new Subject ("INT692", "XML", 60)};
		
		Student std1=new Student("53231621", "Takashi","Yoshida", sub1);
		
		System.out.println("std1.isRegSubject(\"INT222\") = "+std1.isRegSubject("INT222"));
		System.out.println();
		
		System.out.println("average score = "+std1.avgScore());
		System.out.println();
		
		System.out.println("std1.equals(std1) = "+std1.equals(std1));
		System.out.println();
		
		System.out.println(std1);
		
	}
}