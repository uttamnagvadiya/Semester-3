import java.util.*;

public class CircularQueue {
    int [] que = new int [5];
    int front = 0;
    int rear = -1;

    public void enQue(int enQueElement){
      if (rear >= 5){
        System.out.println("Queue is Overflow...");
      }
      else if (rear == 4) {
        rear = (rear+1)%5;
        que[rear] = enQueElement;
      }
      else{
        rear++;
        que[rear] = enQueElement;
      }
    }

    public void deQue(){
        if (front < 0) {
            System.out.println("Queue is Underflow...");
        }
        else {
            System.out.println(que[front]);
            front++;
        }
    }

    public void displayQue(){
        for (int i = 0; i < que.length; i++) {
            System.out.println(que[i]);
        }
    }

    public static void main(String[] args) {
        CircularQueue qu = new CircularQueue();

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" 1 => ENQUE \n 2 => DEQUE \n 3 => DISPLAY \n 4 => EXIT");
        while(true){
            
            System.out.print("Enter Option you want to perform : ");
            switch(sc.next()){
                case "1" :
                    System.out.print("Enter the Elements in Queue : ");
                    qu.enQue(sc.nextInt()); 
                    break;
    
                case "2" : 
                    qu.deQue();
                    break;
    
                case "3" :
                    qu.displayQue();
                    break;
    
                case "4" :
                    System.exit(0);
                    break;
            }
        }
    }
}
