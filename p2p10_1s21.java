public class P2p10{
	public static void main(String[] args) {
		if (args.length == 3){
			char operacion = args[1].charAr(0);
			in a = Integer.parseInt(args[0]);
			in b = Integer.parseInt(args[2]);
			int r = 0;
			swhitch(operacion){
			case 'X': r=a*b; break; 
			case '+': r=a+b; break;
			case '-': r=a-b; break;
			case '/': r=a/b; break;
			}	
			System.out.println("El resutado de la operacion es " + r);	
		}else{
			System.out.println("No se puede realizar la operacion");
		}
	}
}		