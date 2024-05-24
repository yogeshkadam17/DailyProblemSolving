//package day1;
//
//public class RubricCube {
//	
//	String [] [] s= {{"0", "0","0" ,"0", "BYO", "BY", "BYR", "0", "0", "0", "0", "0", "0"},
//			{"0", "0" ,"0", "0", "OB", "B", "BR", "0", "0", "0", "0", "0", "0"},
//			{"0", "0","0", "0", "BWO", "BW", "BRW", "0", "0", "0", "0", "0", "0"},
//			{"OBY", "OB","OBW","WBO", "WB", "WBR", "RBO", "RB", "RBR","YGB", "YG", "YGR"},
//			{"OY", "O","OW","WO", "W", "WR", "RO", "R", "RR", "YO", "Y", "YR"},
//			{"OGY", "OG","OWG","WOG", "WG", "WRG", "ROG", "RG", "RRG",  "YOB", "YB","YBR"},
//			{"0", "0","0", "0", "GOW", "GW", "GWR", "0", "0", "0", "0", "0", "0"},
//			{"0", "0","0", "0", "GO", "G", "GR", "0", "0", "0", "0", "0", "0"},
//			{"0", "0","0", "0", "GYO", "GY", "GBR", "0", "0", "0", "0", "0", "0"},
//			{"0", "0","0","0", "YGB", "YG", "YGR", "0", "0", "0", "0", "0", "0"},
//			{"0", "0","0","0", "YO", "Y", "YR", "0", "0", "0", "0", "0", "0"},
//			{"0", "0","0","0", "YOB", "YB","YBR", "0", "0", "0", "0", "0", "0"}};
//
//
//  
// 
//	
//	 class Node {
//		 
//		 int a;
//		 int b;
//		 Node()
//		 {
//			 
//		 }
//		 Node(int a,int b)
//		 {
//	    
//		this.a=a;
//		this.b=b;
//		
//			 
//		 }
//	 } 
//		
//	 
//	 
//	static Node  [][] matrix;
//	
//	
//	
//	
//	
//	
//	
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		for(int i=0;i<13;i++)
//		{
//			 for(int j=0;j<13;j++)
//			 {
//				 Node s1= new Node(i,j);
//				  matrix[i][j]= s1;
//			 }
//		}
//		
//		
//		
//
//	}
//	
//
//}
package day1;

public class RubricCube {
	
	String[][] s = {
		{"0", "0", "0", "0", "BYO", "BY", "BYR", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "OB", "B", "BR", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "BWO", "BW", "BRW", "0", "0", "0", "0", "0"},
		{"OBY", "OB", "OBW", "WBO", "WB", "WBR", "RBO", "RB", "RBR", "YGB", "YG", "YGR"},
		{"OY", "O", "OW", "WO", "W", "WR", "RO", "R", "RR", "YO", "Y", "YR"},
		{"OGY", "OG", "OWG", "WOG", "WG", "WRG", "ROG", "RG", "RRG", "YOB", "YB", "YBR"},
		{"0", "0", "0", "0", "GOW", "GW", "GWR", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "GO", "G", "GR", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "GYO", "GY", "GBR", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "YGB", "YG", "YGR", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "YO", "Y", "YR", "0", "0", "0", "0", "0"},
		{"0", "0", "0", "0", "YOB", "YB", "YBR", "0", "0", "0", "0", "0"}
	};

	class Node {
		int a;
		int b;

		Node() {}

		Node(int a, int b) {
			this.a = a;
			this.b = b;
		}
	}

	static Node[][] matrix = new Node[12][12];
	
	int [][] temp= new int [3][3];
	int [][] temp1= new int[3][3];
	
	public void RotateMatrixInXDireection()
	{
		                                     
	}
	


	public static void main(String[] args) {
		// Initialize the matrix with Node instances
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 12; j++) {
				matrix[i][j] = new RubricCube().new Node(i, j);
			}
		}

		// Print the matrix to verify
//		for (int i = 0; i < 12; i++) {
//			for (int j = 0; j < 12; j++) {
//				System.out.print("[" + matrix[i][j].a + "," + matrix[i][j].b + "] ");
//			}
//			System.out.println();
//		}
	}
}

