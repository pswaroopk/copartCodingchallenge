package problem3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DNASequencing {
	public static String getSequence(String seq) {
		if (seq.length() == 0)
			return "Empty String";
		StringBuilder sb = new StringBuilder();
		char nucleotide = 0;
		int best = 0;
		for (int i = 0; i < seq.length(); i++) {
			int count = 1;
			char current = seq.charAt(i);
			while (i < seq.length() - 1 && seq.charAt(i) == seq.charAt(i + 1)) {
				count++;
				i++;//if repeating increase the count and go forward else compare with the best
			}
			if (count > best) {
				best = count;
				nucleotide = current;
			}
		}
		return sb.append(nucleotide).append(" ").append(best).toString();
	}

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner;
		String str = "";
		if (args.length > 0) {
			File in = new File(args[0]);
			scanner = new Scanner(in);
			int count = scanner.nextInt();
			for (int i = 0; i < count; i++) {
				str = scanner.next();
				System.out.println(getSequence(str));
			}
		} else {
			System.out.println("Please Input String: ");
			str = new Scanner(System.in).toString();
			System.out.println(getSequence(str));
		}
	}
}
