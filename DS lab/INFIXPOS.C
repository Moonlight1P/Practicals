#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<ctype.h>
char stack[10];
int top=-1;
void push(char c)
{
  if(top<10)
  {
    top++;
    stack[top]=c;
  }
  else
  printf("overflow");
}
char pop()
{
 if(top!=-1)
 {
  char x=stack[top];
  top--;
  return x;
 }
 else
 return -1;
}
int priority(char x)
{
 if(x=='(')
 return 0;
 if(x=='+'||x=='-')
 return 1;
 if(x=='*'||x=='/')
 return 2;

 return 0;
}
int main()
{
  getch();
  char x;
  char input[]="v-n+b+m";
  clrscr();
 // printf("Input is =%s",input);
  int i;
  for(i=0;i<strlen(input);i++)
  {
   if(isalpha(input[i]))
   {// push(input[i]);
    printf("%c",input[i]);
   }
   else if(input[i]=='(')
   push(input[i]);
   else if(input[i]==')')
   {
    while(x==pop()!='(')
    printf("%c",x);
   }
   else
   {
    while(priority(input[i])<=priority(stack[top]))
    printf("%c",pop());
    push(input[i]);
   }
  }
  while(top!=-1)
  {
    printf("%c",pop());
  }
  return 0;

}