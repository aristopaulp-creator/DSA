#include <stdio.h>
#include <conio.h>

void get_data(int arr[], int *size){
	//Input
	printf("\nEnter the array size :");
	scanf("%d",size);
	
	printf("\nEnter array element :\n");
	
	int i;
	for(i=0;i<*size;i++){
		scanf("%d",&arr[i]);
	}
	//Display
	printf("\n--Array Elements--\n");
	for(i=0;i<*size;i++){
		printf("%d",arr[i]);
		printf("\n");
	}
}

//Bubble sort
void bubble_sort(int arr[],int *size){
	int i, j, temp, swap = 0;
	for(i=0;i<*size-1;i++){                           //pass
		for(j=0;j<*size-i-1;j++){                     //ignore the sorted element
			if(arr[j]>arr[j+1]){
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
				swap++;
			}
		}
		if(swap == 0){                                 //optimization
			break;
		}
	}
	//Display
	printf("\n--Array Elements--\n");
	for(i=0;i<*size;i++){
		printf("%d",arr[i]);
		printf("\n");
	}
}

//selection sort
void selection_sort(int arr[],int *size){
	int i, j, temp, min_index;
	
	for(i=0;i<*size-1;i++){
		min_index = i;
		for(j=i+1;j<*size;j++){
			if(arr[j]<arr[min_index]){
				min_index = j;	
			}
		}
		temp = arr[i];
		arr[i] = arr[min_index];
		arr[min_index] = temp;
	}
	//Display
	printf("\n--Sorted Array Elements--\n");
	for(i=0;i<*size;i++){
		printf("%d",arr[i]);
		printf("\n");
	}
}

//insertion sort
void insertion_sort(int arr[],int *size){
	int i, j, key;
	
	for(i=1;i<*size;i++){
		key = arr[i];
		j = i-1;
		while(j>=0 && key<arr[j]){
			arr[j+1] = arr[j];
			j--;
		}
		
		arr[j+1] = key;		
	}
	
	//Display
	printf("\n--Sorted Array Elements--\n");
	for(i=0;i<*size;i++){
		printf("%d",arr[i]);
		printf("\n");
	}
	
	
}
	
int main (){
	
	int arr[100];
	int size;
	
	get_data(arr,&size);
	//bubble_sort(arr,&size);
	//selection_sort(arr,&size);
	insertion_sort(arr,&size);
	getch();
	return 0;
}
