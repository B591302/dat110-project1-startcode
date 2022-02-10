package no.hvl.dat110.rpc;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import no.hvl.dat110.TODO;

public class RPCUtils {
	
	public static byte[] encapsulate(byte rpcid, byte[] payload) {
		
		byte[] rpcmsg = null;
		
		// TODO - START
		
		// Encapsulate the rpcid and payload in a byte array according to the  RPC message syntax
		rpcmsg = new byte[payload.length +1];
		rpcmsg[0] = rpcid;
		for (int i = 0; i < payload.length; i++) {
			rpcmsg[i+1] = payload [i];
		}
		// TODO - END
		
		return rpcmsg;
	}
	
	public static byte[] decapsulate(byte[] rpcmsg) {
		
		byte[] payload = null;
		
		// TODO - START
		
		// Decapsulate the rpcid and payload in a byte array according to the  RPC message syntax
		payload = new byte [rpcmsg.length-1];
		for (int i = 0; i < payload.length; i++) {
			 payload[i] = rpcmsg[i+1];
		}
		
		// TODO - END
		
		return payload;
		
	}
	
	public static byte[] marshallString(String str) {
		
		byte[] encoded = new byte [str.length()];
		
		// TODO - START 
		for(int i = 0;  i<str.length(); i++) {
			 encoded[i] = (byte) str.charAt(i);
		}
		
		
		
		// TODO - END
		
		return encoded;
	}
	
	public static String unmarshallString(byte[] data) {
		// TODO - START 
		
		String decoded =  new String(data, StandardCharsets.UTF_8);; 
		
		
		
		
		
		// TODO - END
		
		return decoded;
	}
	
	public static byte[] marshallVoid() {
		
		byte[] encoded = new byte[0];
		
		// TODO - START 
		
		
				
		// TODO - END
		
		return encoded;
		
	}
	
	public static void unmarshallVoid(byte[] data) {
		
		// TODO
		
		
		
	}
	
	public static byte[] marshallBoolean(boolean b) {
		
		byte[] encoded = new byte[1];
				
		if (b) {
			encoded[0] = 1;
		} else
		{
			encoded[0] = 0;
		}
		
		return encoded;
	}
	
	public static boolean unmarshallBoolean(byte[] data) {
		
		return (data[0] > 0);
		
	}
	
	public static byte[] marshallInteger(int x) {
		
		byte[] encoded = ByteBuffer.allocate(4).putInt(x).array();
		
		
		
		return encoded;
	}
	
	
	public static int unmarshallInteger(byte[] data) {
			
		int decoded = 0;
		
		// TODO - START 
		
		ByteBuffer b= ByteBuffer.wrap(data);
		decoded = b.getInt();
		
		// TODO - END
		
		return decoded;
		
	}
}
