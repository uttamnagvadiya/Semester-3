package Queue;

import java.util.*;

public class QueueDemo {
    int [] que = new int [10];
    int front = 0;
    int rear = 0;

    public void enQue(int enQueElement){
        if(rear > 10){
            System.out.println("Queue is Overflow");
        }
        else{
            que[rear] = enQueElement;
            rear++;
        }
    }
    public int deQue(){
        if(front<0){
            System.out.println("Queue is Underflow");
        }
        else{
            front++;
            return que[front-1];
        }
        return front;
    }

    public int peekQue(){
        if(front < 0){
            System.out.println("Queue is Underflow...");
            return 0;
        }
        else{
            return que[front];
        }
    }

    public int peepQue(int index){
        if (index <= -1 || index >= 10){
            System.out.println("Invalid Enter the Index...");
            return 0;
        }
        else{
            return que[index];
        }
        
    }

    public void change(int cngeIndex, int cngeValue){
        if (cngeIndex <= -1 || cngeIndex >= 8){
            System.out.println("Invalid Enter the Index : ");
        }
        else{
            que[cngeIndex] = cngeValue;
        }
    }
    public void displayQue(){
        System.out.print("Stack : [");
        for(int i=front; i<rear; i++){
            System.out.print(que[i]+", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        QueueDemo qu = new QueueDemo();

        Scanner sc = new Scanner(System.in);
        

        while(true){
            System.out.print("Enter Option you want to perform : ");
            switch(sc.next()){
                case "EnQue" :
                    System.out.print("Enter the Elements in Queue : ");
                    qu.enQue(sc.nextInt()); 
                    break;
    
                case "DeQue" : 
                    System.out.println(qu.deQue());
                    break;

                    case "Peek" : 
                    System.out.println(qu.peekQue());
                    break;
    
                case "Peep" :
                    System.out.print("Enter Index : ");
                    int index = sc.nextInt();
                    System.out.println(qu.peepQue(index));
                    break;
    
                case "Change" :
                    System.out.print("Enter Index :");
                    int cngeIndex = sc.nextInt();
                    System.out.print("Enter Value : ");
                    int cngeValue = sc.nextInt();
                    qu.change(cngeIndex, cngeValue);
                    break;
    
                case "Display" :
                    qu.displayQue();
                    break;
    
                case "Exit" :
                    System.exit(0);
                    break;
            }
        }
    }
}
