#include <stdio.h>
#include <conio.h>

void get_data(int arr[], int *size)
{
	//Input
	printf("\nEnter the array size :");
	scanf("%d",size);
	
	printf("\nEnter array element :\n");
	
	int i;
	for(i=0;i<*size;i++)
	{
		scanf("%d",&arr[i]);
	}
	//Display
	printf("\n--Array Elements--\n");
	for(i=0;i<*size;i++)
	{
		printf("%d",arr[i]);
		printf("\n");
	}
	
}

void linear_srch(int arr[], int *size)
{
	//Linear search
	printf("\n--LINEAR SEARCH--\n");
	
	int key;
	
	printf("\nEnter the element to search :");
	scanf("%d",&key);
	
	int i;
	for(i=0;i<*size;i++)
	{
		if(arr[i]==key)
		{
			printf("\nElement found in %d positon.",i+1);
			return;
		}	
	}
	
	printf("Element not found");
	
}

void binary_srch(int arr[],int *size)
{
	//binary search
	printf("\n--BINARY SEARCH--\n");
	
	//arr_sort(arr,&size);
	
	int low = 0;
	int high = *size-1;
	int mid;
	int key;
	
	printf("\nEnter the element to search :");
	scanf("%d",&key);
	
	while(low<=high)
	{
		mid = low + (high-low)/2;
		
		if(arr[mid]==key)
		{
			printf("\nElement found at %d position.",mid+1);
			return;
		}
		//Ascending order
		if(arr[0]<arr[*size-1])
		{
			if(arr[mid]>key)
			{
				high = mid-1;
			}
			else
			{
				low = mid+1;
			}
		}
		//Decending order
		else if(arr[0]>arr[*size-1])
		{
			if(arr[mid]>key)
			{
				low = mid+1;
			}
			else
			{
				high = mid-1;
			}	
		}
							
	}
	
	printf("\nElement not found.");

}

//Bubble sort
void arr_sort(int arr[],int *size)
{
	int i, j, temp, swap = 0;
	for(i=0;i<*size-1;i++) //pass
	{
		for(j=0;j<*size-i-1;j++) //ignore the sorted element
		{
			if(arr[j]>arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
				swap++;
			}
		}
		if(swap == 0) //optimization
		{
			break;
		}
	}
	//Display
	printf("\n--Array Elements--\n");
	for(i=0;i<*size;i++)
	{
		printf("%d",arr[i]);
		printf("\n");
	}
	
}
	
int main ()
{
	int arr[100];
	int size;
	int choice;
	
/*	printf("\n1.Create array.");
	printf("\n2.")
	printf("\nEnter your choice: ");
	scanf("%d",&choice);
*/	
	get_data(arr,&size);
	
	//linear_srch(arr,&size);
	
	//binary_srch(arr,&size);
	
	arr_sort(arr,&size);
	
	getch();
	return 0;
	
}
