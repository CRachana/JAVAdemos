//Repeated elements
package oops;
public class RepeatedElements
{
	public static void main(String[] args)
	{
    String stringref = "Happy morning";  
    int count;  
    char string[] = stringref.toCharArray();  
    System.out.println("repeated elements in a given string:");  
    for(int i = 0; i <string.length; i++)
    {  
    count = 1;  
    for(int j = i+1; j <string.length; j++)
    {  
    if(string[i] == string[j] && string[i] != ' ')
   {  
    count++;  
  string[j] = '0';  
  }  
  }  
		             
  if(count > 1 && string[i] != '0')  
  System.out.println(string[i]);  
  }  
  }  
}

		
		

