class test
{
public static void main(String ar[])
{
 String student="aravind";
 String trainer="aravind";

  student.concat("sada");

 System.out.println(student);

 String master=new String("saravanan");
 String slave=new String("saravanan");
  

 boolean ans1=student.equals(trainer);
 System.out.println(ans1);

 boolean ans2=master.equals(slave);
 System.out.println(ans2);

 System.out.println("checking refer");

   if(student==trainer)
    System.out.println("student and trainer are samew");
  
  if(master==slave)
  System.out.println("master and slave are same ref");


}


}