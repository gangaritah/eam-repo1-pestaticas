
public class Bug {
	
	 public static void main(String[] args) {
	        int[] array1 = {1, 2, 3};
	        int[] array2 = {1, 2, 3};

	        Bug example = new Bug();
	        example.compareArrays(array1, array2);
	    }

	    public void compareArrays(int[] array1, int[] array2) {
	        if (array1.equals(array2)) {
	            System.out.println("The arrays are equal.");
	        } else {
	            System.out.println("The arrays are not equal.");
	        }
	    }

}
