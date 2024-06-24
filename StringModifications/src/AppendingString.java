import java.util.List;

public class AppendingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("This", "is", "the", "way", "to", "build", "a", "sentence");
		StringBuilder sb = new StringBuilder();
		for(String s: list) {
			sb.append(s).append(" ");
		}
		System.out.println(sb);
		String s = sb.toString();
		System.out.println(s); 

	}

}
