import java.util.*;
public class VowelCons
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
switch(c)
{ case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println("Given character is vowel");
break;
default:
System.out.println("Given character is consonant");
}}}

