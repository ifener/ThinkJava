package com.wey.cloneable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BeanDeepCloneUtil {

	@SuppressWarnings("unchecked")
	public static <T> T cloneTo(T src) {
		ByteArrayOutputStream memoryBuffer = new ByteArrayOutputStream();
		ObjectOutputStream outputStream = null;
		ObjectInputStream inputStream = null;

		T destination = null;
		try {
			outputStream = new ObjectOutputStream(memoryBuffer);
			outputStream.writeObject(src);
			outputStream.flush();
			inputStream = new ObjectInputStream(new ByteArrayInputStream(
					memoryBuffer.toByteArray()));

			destination = (T) inputStream.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (outputStream != null) {
					outputStream.close();
					outputStream=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				if (inputStream != null) {
					inputStream.close();
					inputStream=null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return destination;
	}

}
