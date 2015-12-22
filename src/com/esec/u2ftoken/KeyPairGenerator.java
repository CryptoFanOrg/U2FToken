package com.esec.u2ftoken;

import javacard.security.KeyPair;
import javacard.security.PrivateKey;
import javacard.security.PublicKey;

/** 
 * @author Yang Zhou 
 * @version ����ʱ�䣺2015-12-22 ����09:49:02 
 * 
 */
public interface KeyPairGenerator {
	KeyPair newKeyPair();
//	byte[] encodePublicKey(PublicKey publicKey);
	short encodePrivateKey(PrivateKey privateKey, byte[] encPrivatekey);
}
