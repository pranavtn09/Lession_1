import java.util.*;
public class Calculator {
	static Scanner read=new Scanner(System.in);
	void options() {
		int a;
		int FirstNum ,SecondNum;
		String A="y";
		do {
		System.out.println("\n1)Addition \n2)Subtraction  \n3)Multiplication \n4)Division \n5)Exit");
		System.out.println("\nEnter an Option:");
		a=read.nextInt();
		if(a==5) {
			break;
		}
		if(a!=1 && a!=2 && a!=3 && a!=4 && a!=5 ) {
			System.out.println("Invalid Option!!");
			continue;
		}
		System.out.println("First Number:");
		FirstNum=Read();
		System.out.println("Second Number:");
		SecondNum=Read();
		switch(a) {
		case 1:
			System.out.println(Sum(FirstNum,SecondNum));
			break;
		case 2:
			System.out.println(Dif(FirstNum,SecondNum));
			break;
		case 3:
			System.out.println(Mul(FirstNum,SecondNum));
			break;
		case 4:		
			System.out.println(Div(FirstNum,SecondNum));
			break;
		}
		System.out.println("\nDo you want to continue(y/n)");
		A=read.next();
	
		}while(A.equals("y"));
	}
	public int Read() {	
		int FirstNum;
		FirstNum=read.nextInt();
		return FirstNum;
	}
	
	public  int Sum(int FirstNum,int SecondNum) {
		return FirstNum +SecondNum;
	}
	public  int Dif(int FirstNum,int SecondNum) {
		return FirstNum-SecondNum;
	}
	public  int Mul(int FirstNum,int SecondNum) {
		return FirstNum*SecondNum;
	}
	public int Div(int FirstNum,int SecondNum) {
		return FirstNum/SecondNum;
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.options();
	}
}
