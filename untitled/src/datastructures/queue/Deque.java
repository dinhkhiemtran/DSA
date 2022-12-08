package datastructures.queue;

public class Deque {

    private static final int CAPACITY = 100;

    private int array[];

    private int front;

    private int rear;

    private int size;

    public Deque(int size) {
        array = new int[CAPACITY];
        front = -1;
        rear = 0;
        this.size = size;
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1 || front == rear + 1;
    }

    public boolean isEmpty(){
        if (front == -1){
            return true;
        }
        return false;
    }

    public void insertFront(int element){
        if (isFull()){
            System.out.println("Deque is full.");
        }else {
            if (front == -1){
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = size - 1;
            }else {
                front = front - 1;
            }
            array[front] = element;
            System.out.println(element + " has been inserted.");
        }
    }

    public void insertRear(int elements){
        if (isFull()){
            System.out.println("Deque is full.");
        }else {
            if (front == -1){
                front = 0;
                rear = 0;
            } else if (rear == size - 1) {
                rear = 0;
            }else {
                rear = rear + 1;
            }
            array[rear] = elements;
        }
    }

    public void deleteFront(){
        if (isEmpty()){
            System.out.println("Deque is empty.");
        }else {
            if (front == rear){
                front = -1;
                rear = -1;
            } else if (front == size -1) {
                front = 0;
            }
            else {
                front = front + 1;
            }
        }
    }

    public void deleteRear(){
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

    int getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return array[front];
    }

    int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return array[rear];
    }

    public void display(){

        System.out.println("Insert element at rear end : 12 ");
        insertRear(12);

        System.out.println("insert element at rear end : 14 ");
        insertRear(14);

        System.out.println("get rear element : " + getRear());

        deleteRear();
        System.out.println("After delete rear element new rear become : " + getRear());

        System.out.println("inserting element at front end");
        insertFront(13);

        System.out.println("get front element: " + getFront());

        deleteFront();

        System.out.println("After delete front element new front become : " + getFront());
    }

    public static void main(String[] args) {
        Deque deque = new Deque(100);
        deque.display();
    }
}
