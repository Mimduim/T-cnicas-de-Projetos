package MultMatrix;

public class TesteMatrix {
	
	public static void main(String args[]) {
		
		System.out.print("\n\t Programa��o Din�mica");
		System.out.print("\n Algoritmo de Multiplica��o de Matrizes\n");
		/** vetor de posi��es **/
		/** (d[0][1] � A = 4x3) , (d[1][2] � B = 3x4) , (d[2][3] � C = 4x3) **/
		System.out.println("\nMatrizes e Dimens�es");
		System.out.print("A(4x3) ,B(3x4), C4x3), D(3x4)\n");
		int d[] = { 4, 3, 4, 3,4 };
		/** chama metodo **/
		MultMatrix mm = new MultMatrix();
		mm.InicializarMM(d);
	}
}
