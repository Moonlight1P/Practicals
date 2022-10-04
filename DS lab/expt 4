#include<stdio.h>
#include<conio.h>
#define max 5
int rear=-1, front=-1, cqueue[max],val;

void insertion(){
	if((rear==max-1 && front==0) || (rear==front-1)){
		printf("Overflow\n");
		return;
	}
	else{
	 if((front==-1)&&(rear==-1))
		front=rear=0;
	 else if((rear==max-1)&&(front!=0))
		rear=0;
	 else
		rear=rear+1;
	 printf("Enter the value to be inserted:\n ");
	 scanf("%d", &val);
	 cqueue[rear]=val;
	}
}
void deletion(){
	if(front==-1)
		printf("Underflow\n");
	else{
		int val=cqueue[front];
		if (front==rear)
			front=rear=-1;
		else if(front==max-1)
			front=0;
		else
			front=front+1;
		printf("The element deleted is: %d\n",val);
	}
}
void display(){
	int front_pos=front, rear_pos=rear;
	if(front==-1)
		printf("Queue is empty\n");
	else{
		printf("Queue elements are:\n");
		if(front_pos<=rear_pos){
			while(front_pos<=rear_pos){
				printf("%d ", cqueue[front_pos]);
				front_pos++;
			}
		}
		else{
			while(front_pos<=max-1){
				printf("%d ",cqueue[front_pos]);
				front_pos++;
			}
			front_pos=0;
			while(front_pos<=rear_pos){
				printf("%d ",cqueue[front_pos]);
				front_pos++;
			}
		}
	}
}
int main(){
	int ch,j=1;
	clrscr();
	while(j==1){
		printf("Enter Your Choice\n 1.Insert\n 2.Delete\n 3.Display\n Any other number to exit\n");
		scanf("%d",&ch);
		switch(ch){
			case 1:
				insertion();
				break;
			case 2:
				deletion();
				break;
			case 3:
				display();
				break;
			default:
				printf("Invalid Choice exiting program\n");
				j=0;
		}
	}
	getch();
	return 0;
}
