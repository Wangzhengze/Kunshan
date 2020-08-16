public class Student{
  public int id;
  public String name;
  public double score;

  public Student(int id,String name,double score){
	  this.id=id;
	  this.name=name;
	  this.score=score;

  }
  public int getId(){
     return id;
  }

  public String getName(){
    return name;

  }

  public double getScore(){
     return score;
  }

}
