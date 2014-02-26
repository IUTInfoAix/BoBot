package IUT.BoBot.SmartCells;

public class RomanCell {

	public int decode(String ChiffreR) throws ArithmeticException{
		int result = 0;
		char d = ' ';
		for (char c : ChiffreR.toCharArray()) {
			if (c == 'I') {
				result += 1;
			}
			if (c == 'V') {
				if (d == 'I'){result += 3;}
				else{result += 5;}
			}
			if (c == 'X') {
				if (d == 'I'){result += 8;}
				else{result += 10;}
			}
			if (c == 'L') {
				if (d == 'X'){result += 30;}
				else{result += 50;}
			}
			if (c == 'C') {
				if (d == 'X'){result += 80;}
				else{result += 100;}
			}
			if (c == 'D') {
				if (d == 'C'){result += 300;}
				else{result += 500;}
			}
			if (c == 'M') {
				if (d == 'C'){result += 800;}
				else{result += 1000;}
			}
			/*else{
				result = 0;
				break;
			}*/
			d = c;
		}
    	if (result == 0){throw new ArithmeticException("Lettre(s) non valide(s)");}
		return result;
	}

}
