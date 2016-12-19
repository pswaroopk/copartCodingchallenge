package problem4;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class PieceOfCake {

	public static int getPerimeter(int area) {
		int length = 1, breadth = 1;
		float res = (float) Math.sqrt(area);
		if (res % 1 == 0)//if the input is a perfect square return sqrt of area
			return 2 * (int) (Math.sqrt(area) + Math.sqrt(area));
		HashSet<Integer> set = new HashSet<>();//store the factors in a set,
		for (int i = 1; i <= area; i++) {
			if (area % i != 0) continue;
			if(!set.contains(i) && !set.contains(area/i)){
				set.add(i);set.add(area / i);}
			else {//break when duplicate factors exist
				length = i;
				breadth = area / i;
				break;
			}
		}
		return 2 * (length + breadth);
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner;
		String str = "";
		if (args.length > 0) {
			File in = new File(args[0]);
			scanner = new Scanner(in);
			int count = scanner.nextInt();
			while(scanner.hasNext()){
				int output = getPerimeter(Integer.parseInt(scanner.next()) );
				System.out.println(output);
			}
		} else {
			System.out.println("Please Enter Integer: ");
			str = new Scanner(System.in).toString();
			System.out.println(getPerimeter(Integer.parseInt(str)));
		}
	}
}
