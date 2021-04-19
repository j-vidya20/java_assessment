package assement;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
@SuppressWarnings("resource")
public static void main(String [] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the input string");
 String  sentence =sc.nextLine().replaceAll(" ","");
    Map<Character,Integer> map1=new TreeMap<Character,Integer>();

    for(int i = 0; i <  sentence .length(); i++){
       char c =  sentence .charAt(i);
       Integer val = map1.get(new Character(c));
       if(val != null){
         map1.put(c, new Integer(val + 1));
       }else{
         map.put(c,1);
       }
    }           

    for(Map.Entry<Character,Integer> num:map1.entrySet()){
        int count=num.getValue();
        System.out.printf("%c : ",num.getKey());
        for(int i=0;i<count;i++)
        System.out.printf("*");

        System.out.printf("\n");
    }


    }
}
	 