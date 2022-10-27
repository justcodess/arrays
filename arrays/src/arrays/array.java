package arrays;

public class array {

	public static void main(String[] args) {
		int[]array= {32,27,64,18,95,14,90,70,60,37};
		System.out.printf("%s%8s%n", "Index","Value");
		
		int a=9;
		for(int counter=0; counter<array.length/2;counter++) {
		
			int temp = array[counter];
			array[counter]=array[a];
			temp=array[a];
			a--;
		}
			
			for(int counter=0;counter<array.length;counter++) {
				System.out.printf("%5d%8d%n",counter,array[counter] );
				
			}
			
			
			
			
			
			
			
		}

	}


