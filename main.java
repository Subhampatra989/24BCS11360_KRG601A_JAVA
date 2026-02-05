class AddNumbers {
    int num1;
    int num2;

    AddNumbers(int x, int y){
        num1=x;
        num2=y;
    }
    public void print(){
        int sum = num1+num2;
        System.out.println(sum);
    }
    
}
public class main{

public static void main(String[] args){
    AddNumbers obj1 = new AddNumbers(50, 4);
    obj1.print();
}
}