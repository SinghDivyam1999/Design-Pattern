package com.test.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.monocept.model.Singlton;

public class SingltonTest {

	public static void main(String[] args) throws IOException {
		Singlton s1 = Singlton.GetInstance();  
//		System.out.println(s1);
//		Singlton s2 = Singlton.GetInstance();
//		System.out.println(s2);

		FileOutputStream fos = null; // creating output stream variables
		ObjectOutputStream oos = null;
		FileInputStream fis = null;// creating input stream variables
		ObjectInputStream ois = null;
		Singlton deSerializeSinglton = null; // customer value reference to hold deserialized value
		try {
			fos = new FileOutputStream("Singlton.ser"); // for writting or saving binary data

			oos = new ObjectOutputStream(fos); // converting java objects to binary formate
			oos.writeObject(s1);
			oos.flush();
			oos.close();
			System.out.println("Singlton  object serialized");

			fis = new FileInputStream("Singlton.ser");
			ois = new ObjectInputStream(fis);
			deSerializeSinglton = (Singlton) ois.readObject();
			ois.close();
			System.out.println("Singlton  object deserialized");

		} catch (FileNotFoundException fx) {

		} catch (ClassNotFoundException ce) {

		}
		System.out.println("Hash code of serialized singlton is: " + s1.hashCode());

		System.out.println("Hash code of deserialized singlton is: " + deSerializeSinglton.hashCode());

//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println(Singlton.GetInstance());
//			}
//		}).start();
//		
//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println(Singlton.GetInstance());
//			}
//		}).start();
//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println(Singlton.GetInstance());
//			}
//		}).start();

	}

}
