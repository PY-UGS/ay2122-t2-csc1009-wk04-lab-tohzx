

public class StackOfIntegers {
     private int[] container = new int[0];
     private int size = this.container.length;


    public StackOfIntegers(){
             this.container = new int[16];
         }


    public int pop(){
        int x = this.container[this.size -1];
        this.size -= 1;
        return x;
    }

    public void push(int i){
        this.container[this.size] = i;
        this.size += 1;
    }

    public boolean empty(){
        return this.size == 0;
    }

    public int getSize(){
        return this.size;
    }

    public int peek(){
        return this.container[this.size -1];
    }

}
