
public class Permuta {
	
	public static void Permutacao(String p, String s) {
		if(s.length() == 1) {
			System.out.println(p+s);
		}
		else {
			String slinha;
			String plinha;
			
			for(int i = 0; i < s.length();i++) {
				slinha = s.substring(0,i) + s.substring(i+1);
				plinha = p + s.charAt(i);
				Permutacao(plinha,slinha);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Permutacao(new String(), args[0]);

	}

}
