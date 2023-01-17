import java.util.Scanner;
public class StackReverseElementTest {
    public static void main(String[] args) {
        StackReverseElement<Character> mStack = new StackReverseElement<>();
        System.out.println("Hãy nhập vào một chuỗi để thử ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        char[] charArr = string.toCharArray();
        for( int i=0;i<charArr.length;i++)
        {
            mStack.push(charArr[i]);
        }
        System.out.println("Chuỗi sau khi đảo ngược là");
        while(!mStack.isEmpty())
        {
            System.out.print(mStack.pop()+"");
        }



    }
}
