package com.company;

public class Main {

    public static void main(String[] args) {

	String inputString="1234";
	int buffer=0;
	int outputInt=0;
	int inputInt=Integer.parseInt(inputString);
	System.out.println(inputInt);




	for (int i=0; i<4; i++){

		buffer = inputInt%(10);
		inputInt=inputInt/10;
		System.out.println(buffer);
		buffer=((buffer+7)%10);
		System.out.println(buffer);
		outputInt=outputInt+buffer*((int)Math.pow(10,i));
		System.out.println(outputInt);
	}



	String intermediateString=Integer.toString(outputInt);
	char[] outputChar=intermediateString.toCharArray();
	char charBuffer=outputChar[0];
	outputChar[0]=outputChar[2];
	outputChar[2]=charBuffer;
	charBuffer=outputChar[1];
	outputChar[1]=outputChar[3];
	outputChar[3]=charBuffer;
	String outputString = String.valueOf(outputChar);
	System.out.println(outputString);



    }
}
