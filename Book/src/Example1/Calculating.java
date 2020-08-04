package Example1;
import static java.lang.Math.*;

public class Calculating {
	public static void main(String args[]) {
		//Параметры уравнеия
		double a=5;
		double b=3;
		double c=1;
		//Вспомогательная переменная:
		double alpha;
		//Логическая переменная - критерий наличия решений:
		boolean state;
		//Значкния вспомогательной переменной:
		alpha=asin(a/sqrt(a*a+b*b));
		//Вычисления критерия:
		state=a*a+b*b>=c*c;
		//Вывод на экран значений исходных параметров:
		System.out.println("Уравнение a*cos(x)+b*sin(x)=c");
		System.out.println("Параметры:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("Решения для x:");
		System.out.println(state?asin(c/sqrt(a*a+b*b))-alpha:"Решений нет!");
		
	}
}
