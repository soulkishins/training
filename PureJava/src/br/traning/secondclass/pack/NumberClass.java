package br.traning.secondclass.pack;

import java.math.BigDecimal;

public class NumberClass {
	
	public static void main(String[] args) {
		
//		Somando 733.39 com 564.25 = 1297.64
//		Somando 2151.07 com 384.82 = 2535.89
//		Somando 4950.68 com 3315.03 = 8265.71
//		Somando 4555.95 com 4640.58 = 9196.53
//		Somando 923.69 com 798.42 = 1722.11

		double db1 = 733.39;
		double db2 = 564.25;
		System.out.print("Somando " + db1 + " com " + db2 + " = ");
		System.out.println(db1 + db2);

//		BigDecimal db1 = BigDecimal.valueOf(733.39);
//		BigDecimal db2 = BigDecimal.valueOf(564.25);
//		System.out.print("Somando " + db1 + " com " + db2 + " = ");
//		System.out.println(db1.add(db2));

//		for (var i = 0; i < 20; i++) {
//			double db1 = nextDouble(300, 5000);
//			double db2 = nextDouble(300, 5000);
//			System.out.print("Somando " + db1 + " com " + db2 + " = ");
//			System.out.println(db1 + db2);
//		}

	}
	
	
	private static double nextDouble(double origin, double bound) {
		return ((long) ((origin + Math.random() * (bound - origin)) * 100)) / 100.0;
	}

}
