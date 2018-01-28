


public class ArrayUtil {
	
	/** Reverse elements of array arr
	*   Precondition: arr.length > 0.
	*   Postcondition: The elements of arr have been reversed
	*   @param arr the array to manipulate
	*/
	public static void reverseArray(int[] arr){
		/* code goes here */
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			arr2[arr2.length - (1+i)] = arr[i]; 
			System.out.println(arr2.length - (1+i));
			
		}
	}
	
	public static void main(String[] args)
	{
		int[] test = {1,2,3,4};
		reverseArray(test);
	}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	/** Revereses the elements in each row of mat.
	*   Postcondition: The elements in each row have been reversed
	*/
	public void reverseAllRows(){
		//int[][] mat2 = new int
	}
	
	/** Reverses the elements of mat.
	*   Postcondition:
	*   - The final elements of mat, when read in row-major order, 
	*     are the same as the original elements of mat when read
	*     from the bottom corner, right to left, going upward.
	*   - mat[0][0] contains what was originally the last element.
	*   - mat[mat.length - 1][mat[0].length -1] contains what was
	*     originally the first element.
	*/
	public void reverseMatrix(){
		/* code goes here */
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}
