package com.monocept.model;

public class InterpreterTest {
	public Interpreter interpreter;

	public InterpreterTest(Interpreter i) {
		this.interpreter = i;
	}
	
	public String interpret(String str){
		IExpression exp = null;
		if(str.contains("Octal")){
			exp=new IntToOctalExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else if(str.contains("Binary")){
			exp=new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
		}else return str;
 
		return exp.interpret(interpreter);
	}

	public static void main(String[] args) {
		String str1 = "10 in Binary: ";
		String str2 = "20 in Octal: ";
 
		InterpreterTest interpreterPatternTest = new InterpreterTest(new Interpreter());
		System.out.println(str1+"= "+interpreterPatternTest.interpret(str1));
		System.out.println(str2+"= "+interpreterPatternTest.interpret(str2));
	}

}
