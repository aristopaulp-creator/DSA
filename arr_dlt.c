#include <stdio.h>
#include <conio.h>

void get_data(int arr[], int *size)
{
	
	printf("Enter the array size");
	scanf("%d",size);
	
	printf("Enter array element:");
	
	int i;
	for(i=0;i<*size;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	for(i=0;i<*size;i++)
	{
		printf("%d",arr[i]);
		printf("\n");
	}
	
}

void delete_data(int arr[],int *size)
{
	int pos;
	printf("Enter the position to delete");
	scanf("%d",&pos);
	
	int i;
	for(i=pos-1;i<*size-1;i++)
	{
		arr[i] = arr[i+1];
	}
	
	(*size)--;
	
	for(i=0;i<*size;i++)
	{
		printf("%d",arr[i]);
		printf("\n");
	}
}

int main()
{
	int arr[100];
	int size;
	
	get_data(arr,&size);
	
	delete_data(arr,&size);
	
	getch();
	return 0;
}
