package differential;

import java.util.Scanner;


public class Differential_main {//���x���ǂ�����h�̒l��h=0.00000001

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Number a>");
		double a =Double.parseDouble(scan.next());
		System.out.print("Input Number h>");
		double h =Double.parseDouble(scan.next());
		
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getDx());
		
		System.out.println("���Ό덷="+Math.abs(dlib.getRx()-dlib.getDx())/dlib.getRx()*100);
		

	

	}
}	