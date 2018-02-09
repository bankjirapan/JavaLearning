class Student{
	private String studentId;
	private String firstName;
	private String lastName;
	private Subject[] regSubject;
	
	
	public Student(){
		studentId=null;
		firstName=null;
		lastName=null;
		regSubject=new Subject[3];
		
	
	}
	public Student(String id, String f, String l,Subject[] sub){
		studentId=id;
		firstName=f;
		lastName=l;
		regSubject=sub;
		
	}
	public void setRegSubject(Subject[] sub){
		regSubject=sub;
	}
	public Subject[] getRegSubject(){
		return regSubject;
	}
	public void setStudentId(String id){
		studentId = id;
	}
	public String getStudentId(String id){
		return studentId;
	}
	public void setFirstName(String f){
		firstName= f;
	}
	public String getFirstName(){
		return firstName;
	}
	public void setLastName(String l){
		lastName=l;
	}
	public String getLastName(){
		return lastName;
	}
	public double avgScore(){
		double sum=0;
		for(int i=0;i<regSubject.length;i++){
			sum+=regSubject[i].getScore();
		}
		return sum/regSubject.length;
	}
	public String toString(){
		String result;
		result = "Student Id = "+studentId+"\nFirstName = "+firstName+"\nLastName = "+lastName;
		for(int i=0;i<regSubject.length;i++){
			result+=regSubject[i];
		}
		
		return result;
	}
	
	public boolean isRegSubject(String s){
		for(int i=0;i<regSubject.length;i++){
			if(regSubject[i].getSubjectId().equals(s)){
				return true;
			}
		}
		return false;
	}
	
	public boolean equals (Object o){
		if(o!=null && o instanceof Student){
			Student s=(Student)o;
			if(studentId==s.studentId)
				return true;
		}
		return false;
	}
	
	
	
	
  }
	
	