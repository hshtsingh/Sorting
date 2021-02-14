import java.util.*;
public class NewSort{
	
	public static void main(String[] args) {
		 int size, i, j, temp;
	       int arr[] = new int[10];
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter size of array: ");
	       size = scan.nextInt();
		   
	       System.out.print("Enter elements of array: ");
	       for(i=0; i<size; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
		   
	       for(i=1; i<size; i++)
	       {
	           temp = arr[i];
	           j = i - 1;
	           while((temp < arr[j]) && (j >= 0))
	           {
	               arr[j+1] = arr[j];
	               j = j - 1;
	           }
	           arr[j+1] = temp;
	       }
		   
	       System.out.print("Array after Sorting is : \n");
	       for(i=0; i<size; i++)
	       {
	           System.out.print(arr[i] + "  ");
	       }
	       }
	}

