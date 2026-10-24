#include <iostream>
#include <conio.h>
using namespace std;
#define TRUE 1
#define FALSE 0;

//class definition
class sll{
	private:
		struct node{
			int data;
			struct node *next;
		}*head;
	
	public:
		sll();
		void create();
		void display();
		~sll();
};

sll::sll(){
	head = NULL;
}

sll::~sll(){
	node *temp, *temp1;
	temp = head -> next;
	delete head;
	while(temp != NULL){
		temp1 = temp -> next;
		delete temp;
		temp = temp1;
	}
}

void sll::create(){
	node *temp, *New;
	int val, flag;
	char ans = 'y';
	flag = TRUE;
	
	do{
		cout<<"Enter the data :";
		cin>>val;
		
		New = new node;
		if(New == NULL)
			cout<<"Unable to allocate memory\n";
			
		New -> data = val;
		New -> next = NULL;
		
		if(flag == TRUE){
			head = New;
			temp = head;
			flag = FALSE;
		}
		
		else{
			temp -> next = New;
			temp = New;
 		}
 		cout<<"\nDo you wnat to enter more elements? (y/n)";
 		ans = getch();
	}while(ans == 'y' || ans == 'Y');
	
	cout<<"\nThe Singly Linked List is created\n";
	getch();
}

void sll::display(){
	node *temp;
	temp = head;
	if(temp == NULL){
		cout<<"\The list is empty\n";
		return;
	}
	while(temp != NULL){
		cout<<temp -> data;
		temp = temp -> next;
	}
}

int main(){
	sll s;
	s.create();
	s.display();
	
	return 0;
}

