import java.util.Arrays;

public class BinarySearch
{
	public static int binarySearch(int[] ray, int item)
	{
		//Sorts the array ray
		Arrays.sort(ray);
		
		//sets the index for the top, middle, and bottom
		int top = ray.length -1;
		int mid = 0;
		int bot = 0;

		//While the number isnt found
		while(bot <= top)
		{
			mid = (bot + top)/2;

			if(ray[mid] < item)
			{
				bot = mid + 1;
			}
			else if(ray[mid] > item)
			{
				top = mid -1;
			}
			else 
			{
				return mid;
			}
			
		}
		//if it wasn't found return -1 because its not there
		return -1;
		
		
	}
}
