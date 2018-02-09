class Subject{
	private String subjectId;
	private String subjectName;
	private double score;
	
	public Subject(){
		this(null, null, 0);
		/*subjectId = null;
		subjectName = null;*/
	}
	public Subject(String id, String name, double s){
		subjectId = id;
		subjectName = name;
		score=s;
	}
	public void setSubjectName(String name){
		subjectName = name;
	}
	public void setSubjectId(String id){
		subjectId = id;
	}
	public String getSubjectName(){
		return subjectName;
	}
	public String getSubjectId(){
		return subjectId;
	}
	public double getScore(){
		return score;
	}
	public void setScore(double s){
		score=s;
	}
	public String toString()
	{
		return "\nSubject Id = "+subjectId+"\nSubject Name = "+subjectName+"\nScore = "+score;
	}
}