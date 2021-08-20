package br.traning.secondclass.pack;

public class ExceptionClass {

	public static void main(String[] args) {

		try {
			iWillThrowException();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try {
			assert 10 % 3 == 0 : "O resto nao e ZERO!";
		} catch (Error e) {
			e.printStackTrace();
		} finally {
			try {
				iWillThrowError();
			} catch (Error e) {
				e.printStackTrace();
			} finally {
				iWillThrowRuntime();
			}
		}

	}

	public static int iWillThrowRuntime() throws ArithmeticException {
		return 10 / 0;
	}

	public static int iWillThrowException() throws IllegalAccessException {
		throw new IllegalAccessException("Esse acesso nao foi legal!");
	}

	public static int iWillThrowError() {
		throw new IllegalAccessError("Esse acesso foi completamente errado!");
	}

}
