package easy;
public class palindrome {
    public static void main(String[] arg){
        int x = 1;
        int rev=0;
        int orgX=x;

        if(x<0)
        {
            System.out.println("Negative Number"); 

        }
        else if(x<10)
        {
            System.out.println("x is single digit");

        }
        else 
        {
            while(x!=0)
            {
                int lstNum=x%10;
                x=x/10;
                rev=rev*10+lstNum;
            }
        }
        if(rev==orgX)
        {
            System.out.println("it is palindrome");

        }
        else
        {
            System.out.println("it is not Palindrome");
        }

    }
}
