import java.util.*;
public class ArrayListDuplicates {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		Integer n;
		for(int i =0; i<10; i++){
			n = sc.nextInt();
			if(list.contains(n)){
				
			}else{
				list.add(n);
			}
		}System.out.println(list);
	}
}