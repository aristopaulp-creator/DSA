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

void insert_data(int arr[], int *size)
{
	int value;
	int pos;
	
	printf("Enter the value to be inserted:");
	scanf("%d",&value);
	
	printf("Enter the position of insertion:");
	scanf("%d",&pos);
	
	int i;
	for(i=*size;i>pos;i--)
	{
		arr[i] = arr[i-1];
	}
	
	arr[pos-1] = value;
	(*size)++;
	
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
	
	insert_data(arr,&size);
	
	getch();
	return 0;
}

