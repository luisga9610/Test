package pack1;

public class Test {
	
	public static void main(String[] args){

	System.out.println(Operaciones.MULTIPLICACION);
	System.out.println(Operaciones.SUMA.getvalor());
	System.out.println(Operaciones.RESTA.name());
	
	
	
	for(Operaciones elemento:Operaciones.values()){
	System.out.println(elemento.getvalor());
	}	
	
}
}
