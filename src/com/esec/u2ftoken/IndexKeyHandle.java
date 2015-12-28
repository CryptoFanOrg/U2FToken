package com.esec.u2ftoken;

import javacard.framework.Util;
import javacard.security.ECPrivateKey;
import javacard.security.PrivateKey;

/** 
 * Key handle is a index to user's private key stored locally. 
 * @author Yang Zhou 
 * @version ����ʱ�䣺2015-12-23 ����08:38:19 
 */
public class IndexKeyHandle implements KeyHandleGenerator {

	public byte[] generateKeyHandle(byte[] applicationSha256, ECPrivateKey privateKey) {
		SharedMemory sharedMemory = SharedMemory.getInstance();
		SecretKeyDataBase secretKeyDataBase = SecretKeyDataBase.getInstance();
		byte[] keyHandle = sharedMemory.m2BytesKeyHandle;
		Util.setShort(keyHandle, (short) 0, secretKeyDataBase.storeSecretKey(privateKey));
		return keyHandle;
	}
	
	public ECPrivateKey verifyKeyHandle(byte[] keyHandle) {
		SecretKeyDataBase secretKeyDataBase = SecretKeyDataBase.getInstance();
		
		return secretKeyDataBase.getKey(Util.makeShort(keyHandle[0], keyHandle[1]));
	}
}
