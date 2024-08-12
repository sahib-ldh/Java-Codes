import java.io.*;
class Serialization
{
 public static void main(String args[])throws Exception
 {
  Student s1=new Student(101,"GammaPrep",100);

  FileOutputStream fos=new FileOutputStream("f.txt");
  ObjectOutputStream oos=new ObjectOutputStream(fos);
  oos.writeObject(s1);
  oos.flush();
  System.out.println("Serialization is successfull");
 }
}