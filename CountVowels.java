//CountVowels
package oops;
public class CountVowels 
{    
    public static void main(String[] args) {    
    int Count = 0;   
    String str = "Hcl Technologies";    
    str = str.toLowerCase();    
    for(int i = 0; i < str.length(); i++) {    
     if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
     {    
            Count++;    
      }    
        
       }    
        System.out.println("Number of vowels: " + Count);    
         
    }    
}   