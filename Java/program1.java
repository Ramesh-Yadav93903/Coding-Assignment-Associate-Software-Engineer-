import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<7;i++)
		{
		    list.add(i+1);
		}
		Collections.shuffle(list);
		System.out.println(list);
	}
}