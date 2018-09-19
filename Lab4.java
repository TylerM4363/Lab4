public class Lab4{
	public static void main(String[] args) {
		Integer[] s1 = {5, 19, 4, 29, 10};
		Integer[] s2 = {1, 2, 3, 4, 5};
		//Integer[] s3 = {51, 3, 55, a, 9};
		Integer[] s4 = {6, 8, 39, 5, 9};
		Integer[] s5 = {null};
		
		Integer[] x1 = descendingSort(s1);
		for(int i = 0; i < x1.length; i++) {
			System.out.println(x1[i]);
		}
	}
	
	public static Integer[] descendingSort(Integer[] sort) {
		Integer[] sorted = new Integer[sort.length];
		int biggest = 0;
		if(sort[0] == null) {
			throw new IllegalArgumentException("Not a correct arguement");
		}
		for(int i = 0; i < sort.length; i++) {
			biggest = sort[i];
			for(int x = i; x < sort.length; x++) {
				if(biggest < sort[x]) {
					biggest = sort[x];
				}
			}
			sorted[i] = biggest;
		}
		return sorted;
	}
}

