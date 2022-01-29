// package com.company;
 public class Queue
{
    int[] Que;
    int size;
    int front;
    int rear;
    public Queue(int mm)
    {
       size=mm;
       front =-1;
       rear= -1;
       Que=new int [size];

    }
    boolean isEmpty()
    {
        return front == -1;
    }
    public void addele(int v){
        if(rear == -1) {
            front = 0;
            rear = 0;
            Que[rear] = v;
        }
        else if(rear+1<Que.length)
            Que[++rear]=v;
        else
            System.out.println("OVERFLOW");


        }
        public void delete()
        {
            int element;
            if(isEmpty()) {
            }
            else
            {
                element=Que[front];
                if(front == rear )
                    front = rear-1;
                else
                    front++;

            }
        }
        public void display()
        {
            for(int i =front;i<=rear;i++)
                System.out.println(Que[i]);
        }

    public static void main(String[] args) {
        Queue obj = new Queue(10);
        obj.addele(122);
        obj.delete();
        obj.display();
    }
    }
