package no.hvl.dat110.messaging;

import no.hvl.dat110.TODO;

public class Message {
	private int maxByte = 127;
	private byte[] data;

	public Message(byte[] data) {
		
		// TODO - START
		if(data !=  null  && data.length <= maxByte) {
			this.data = data;
		}
		
		
			
		// TODO - END
	}

	public byte[] getData() {
		return this.data; 
	}

}
