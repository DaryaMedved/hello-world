package by.itacademy.hw10.Task3;

public class Stack {
    private final int[] arr;
    private int top;
    private final int capacity;


    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Переполнение\nПрограмма остановлена\n");
            System.exit(1);
        }

        System.out.println("Добавлен элемент " + x);
        arr[++top] = x;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст");
            System.exit(1);
        }
        top--;
    }

    public Boolean isEmpty() {
        return top == -1;
    }


    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nПосле удаления");

        stack.printStack();

    }
}
