package 과정2;

import java.util.Arrays;

public class RoadToBiodome06 {
	public static void main(String[] args)
	{
		// 분리
		String input = String.join("", args);

		String inputSplit[]  = input.split("]");
		
		String input1[] = inputSplit[0].replace("[","").split(",");
		String input2[] = inputSplit[1].replace("[","").split(",");
		
		int inputInt1[] = new int[input1.length];
		int inputInt2[] = new int[input2.length];
		
		// 첫 번째 input
		int n = 0;
		for(int i=0;i<input1.length;i++)
		{	
			try 
			{
				inputInt1[n++] = Integer.parseInt(input1[i]);
			}catch(NumberFormatException e)
			{
				n--;
			}
		}
		
		// 두 번째 input
		int m = 0;
		for(int i=0;i<input2.length;i++)
		{	
			try 
			{
				inputInt2[m++] = Integer.parseInt(input2[i]);
			}catch(NumberFormatException e)
			{
				m--;
			}
		}
		
		// 정렬
		Arrays.sort(inputInt1);
		Arrays.sort(inputInt2);
		
		double Median = findMedianSortedArrays(inputInt1,inputInt2,n,m);
		System.out.printf("Medain : %.1f  ",Median);
		double Mean = findMeanSortedArrays(inputInt1,inputInt2,n,m);
		System.out.printf("Mean : %.1f",Mean);
		
		
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2, int n, int m) 
	{      
		if (n > m)
        {
            int []temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }

        int left = 0, right = n;
        while (left <= right)
        {
            int i = (right - left + 1) / 2 + left;
            int j = (n + m + 1) / 2 - i;
            int nums1_1 = i > 0 ? nums1[i - 1] : -1;
            int nums1_2 = i < n ? nums1[i] : 100;
            int nums2_1 = j > 0 ? nums2[j - 1] : -1;
            int nums2_2 = j < m ? nums2[j] : 100;
          
            if (nums1_1 > nums2_2)
            {
                right = i - 1;
            }
            else if (nums2_1 > nums1_2)
            {
                left = i + 1;
            }
            else
            {
                int leftMax = max(nums1_1, nums2_1);
                int rightMin = min(nums1_2, nums2_2);
                if ((n + m) % 2!=0)
                {
                    return leftMax;
                }
                else
                {
                    return (leftMax + rightMin) / 2.0;
                }
            }
        }

        return 0.0;
    }

	public static int max(int nums1_1, int nums2_1) 
	{
		if(nums1_1>nums2_1)
			return nums1_1;
		else
			return nums2_1;
	}

	public static int min(int nums1_2, int nums2_2) 
	{
		if(nums1_2<nums2_2)
			return nums1_2;
		else
			return nums2_2;
	}
	
	// 평균값
	public static double findMeanSortedArrays(int[] nums1, int[] nums2, int n, int m)
	{
		double num = n+m;
		
		int total = 0;
		for(int i=0;i<n;i++)
		{
			total += nums1[i];
		}
		
		for(int i=0;i<m;i++)
		{
			total += nums2[i];
		}
		
		return total / num;
	}
}
