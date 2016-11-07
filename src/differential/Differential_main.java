package differential;

import java.util.Scanner;


public class Differential_main {//精度が良い時のhの値はh=0.00000001

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Number a>");
		double a =Double.parseDouble(scan.next());
		System.out.print("Input Number h>");
		double h =Double.parseDouble(scan.next());
		
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getDx());
		
		System.out.println("相対誤差="+Math.abs(dlib.getRx()-dlib.getDx())/dlib.getRx()*100);
		

	

	}
}	