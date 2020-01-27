import java.io.*;
import java.util.*;
class Palindrome
{
public static void main(String Args[])
{
Scanner o=new Scanner(System.in);
System.out.println("enter string");
String s=o.next();
int l=s.length();
int c=0;
for(int i=0;i<l;)
{
for(int j=l-1;j>=0;j--)
{
if(s.charAt(j)==s.charAt(i))
{
c++;
}
i++;
}
}
System.out.println("length = "+l+"count = "+c);
if(c==l)
System.out.println("string is plindrome");
else
System.out.println("string is not plindrome");
}
}


