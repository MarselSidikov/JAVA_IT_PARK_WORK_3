// импорт класса Scanner - модуль, позволяющий
// считывать данные с какого либо потока
import java.util.Scanner;
class Program {
	public static void main(String[] args) {
	    // создаем объект класса Scanner
	    // объектная переменная scanner
	    // объект настроен на стандартный поток ввода
		Scanner scanner = new Scanner(System.in);
		// считали два числа
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int sumResult = x + y;

		System.out.println(sumResult);
	}
}