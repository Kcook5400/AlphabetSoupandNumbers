package model;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Sep 14, 2021
 */
public class numbersInfo {
	private int num1;
	private int num2;
	private int add;
	private int subtract;
	private int multiply;
	private double divide;
	
	
	/**
	 * 
	 */
	public numbersInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public numbersInfo(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		setNums(num1, num2);
	}


	public int getNum1() {
		return num1;
	}


	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public int getNum2() {
		return num2;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

	public int getAdd() {
		return add;
	}


	public void setAdd(int add) {
		this.add = add;
	}


	public int getSubtract() {
		return subtract;
	}


	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}


	public int getMultiply() {
		return multiply;
	}


	public void setMultiply(int multiply) {
		this.multiply = multiply;
	}


	public double getDivide() {
		return divide;
	}


	public void setDivide(double divide) {
		this.divide = divide;
	}


	@Override
	public String toString() {
		return "numbersInfo [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	public void setNums(int num1, int num2) {
		
		setNum1(num1);
		setNum2(num2);
		setAdd(num1+num2);
		setSubtract(num1-num2);
		setMultiply(num1*num2);
		setDivide(Double.valueOf(num1)/Double.valueOf(num2));
		
		
	}

	
	
	
}
