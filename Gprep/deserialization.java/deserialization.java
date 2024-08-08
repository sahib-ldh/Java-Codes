import java.io.*;
class Deserialization
{
 public static void main(String args[])throws Exception
 {
  FileInputStream fis=new FileInputStream("f.txt");
  ObjectInputStream ois=new ObjectInputStream(fis);
  Student s=(Student)ois.readObject();

  System.out.println(s.name);
  System.out.println(s.id);
  System.out.println(s.marks);
  System.out.println("Deserializaion success");
 }
}