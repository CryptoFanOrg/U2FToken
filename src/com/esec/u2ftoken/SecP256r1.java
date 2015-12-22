/**
 * 
 */
package com.esec.u2ftoken;

import javacard.security.ECPrivateKey;
import javacard.security.ECPublicKey;
import javacard.security.KeyBuilder;
import javacard.security.KeyPair;
import javacard.security.PrivateKey;

/** 
 * @author Yang Zhou 
 * @version 创建时间：2015-12-10 上午10:00:46 
 * secp256r1的参数初始化封装类，参数来自bouncycastle的java实现
 */
public class SecP256r1 implements KeyPairGenerator {
	
	private final static byte[] p = { (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x00, 0x00,
		0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, (byte) 0xff,
		(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
		(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff };

	private final static byte[] a = { (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x00, 0x00,
		0x00, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, (byte) 0xff,
		(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
		(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfc 
	};

	private final static byte[] b = { 0x5a, (byte) 0xc6, 0x35, (byte) 0xd8, (byte) 0xaa, 0x3a,
		(byte) 0x93, (byte) 0xe7, (byte) 0xb3, (byte) 0xeb, (byte) 0xbd, 0x55, 0x76, (byte) 0x98,
		(byte) 0x86, (byte) 0xbc, 0x65, 0x1d, 0x06, (byte) 0xb0, (byte) 0xcc, 0x53, (byte) 0xb0,
		(byte) 0xf6, 0x3b, (byte) 0xce, 0x3c, 0x3e, 0x27, (byte) 0xd2, 0x60, 0x4b };

	private final static byte[] G = { 0x04, 0x6b, 0x17, (byte) 0xd1, (byte) 0xf2, (byte) 0xe1, 0x2c,
		0x42, 0x47, (byte) 0xf8, (byte) 0xbc, (byte) 0xe6, (byte) 0xe5, 0x63, (byte) 0xa4, 0x40,
		(byte) 0xf2, 0x77, 0x03, 0x7d, (byte) 0x81, 0x2d, (byte) 0xeb, 0x33, (byte) 0xa0, (byte) 0xf4,
		(byte) 0xa1, 0x39, 0x45, (byte) 0xd8, (byte) 0x98, (byte) 0xc2, (byte) 0x96, 0x4f, (byte) 0xe3,
		0x42, (byte) 0xe2, (byte) 0xfe, 0x1a, 0x7f, (byte) 0x9b, (byte) 0x8e, (byte) 0xe7, (byte) 0xeb,
		0x4a, 0x7c, 0x0f, (byte) 0x9e, 0x16, 0x2b, (byte) 0xce, 0x33, 0x57, 0x6b, 0x31, 0x5e,
		(byte) 0xce, (byte) 0xcb, (byte) 0xb6, 0x40, 0x68, 0x37, (byte) 0xbf, 0x51, (byte) 0xf5 };

	private final static byte[] r = { (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, 0x00, 0x00, 0x00,
		0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
		(byte) 0xff, (byte) 0xbc, (byte) 0xe6, (byte) 0xfa, (byte) 0xad, (byte) 0xa7, 0x17, (byte) 0x9e,
		(byte) 0x84, (byte) 0xf3, (byte) 0xb9, (byte) 0xca, (byte) 0xc2, (byte) 0xfc, 0x63, 0x25, 0x51 };

	public KeyPair newKeyPair() {
		KeyPair key = new KeyPair(KeyPair.ALG_EC_FP, (short) 256);

		ECPrivateKey privKey = (ECPrivateKey) key.getPrivate();
		ECPublicKey pubKey = (ECPublicKey) key.getPublic();

		privKey.setFieldFP(p, (short) 0, (short) p.length);
		privKey.setA(a, (short) 0, (short) a.length);
		privKey.setB(b, (short) 0, (short) b.length);
		privKey.setG(G, (short) 0, (short) G.length);
		privKey.setR(r, (short) 0, (short) r.length);

//		byte[] privData = {(byte)0x25, (byte)0xc9, (byte)0xec, (byte)0xdc, (byte)0x4c, (byte)0x59, (byte)0xa3, (byte)0xe0, (byte)0x4f, (byte)0x01, (byte)0x56, (byte)0x97, (byte)0xf3, (byte)0xcb, (byte)0x60, (byte)0x5b, (byte)0x84, (byte)0x49, (byte)0x45, (byte)0x3a, (byte)0xe2, (byte)0x0e, (byte)0xd1, (byte)0xbd, (byte)0xc0, (byte)0xa7, (byte)0xe1, (byte)0xfa, (byte)0x82, (byte)0xee, (byte)0x3c, (byte)0x73};
//		privKey.setS(privData, (short) 0, (short) privData.length);
//		privKey.setK((short) 1);
		
		pubKey.setFieldFP(p, (short) 0, (short) p.length);
		pubKey.setA(a, (short) 0, (short) a.length);
		pubKey.setB(b, (short) 0, (short) b.length);
		pubKey.setG(G, (short) 0, (short) G.length);
		pubKey.setR(r, (short) 0, (short) r.length);
		
//		byte[] pubData = {0x04, 0x00, (byte)0xb9, (byte)0x8f, (byte)0xcf, (byte)0xc3, (byte)0xc0, (byte)0xae, (byte)0x95, 0x6a, 0x5b, 0x12, 0x6d, (byte)0xbe, 0x43, (byte)0xe4, 0x7f, 0x09, 0x0d, (byte)0xde, 0x02, (byte)0xd2, 0x6b, 0x28, (byte)0x86, (byte)0xed, 0x2b, (byte)0xd7, (byte)0xe2, (byte)0xc2, 0x69, (byte)0xc1, (byte)0x89, (byte)0xb2, 0x53, (byte)0x96, (byte)0xc1, 0x2d, (byte)0xbf, 0x4c, 0x30, (byte)0xae, (byte)0xd5, (byte)0xd5, 0x3c, (byte)0xb5, (byte)0xf9, 0x3b, 0x20, 0x37, (byte)0x83, (byte)0x88, (byte)0x9f, 0x34, 0x74, (byte)0xf5, 0x6c, (byte)0x97, 0x1e, 0x0a, (byte)0xa9, (byte)0xe7, (byte)0xfa, (byte)0xa6, 0x69};
//		pubKey.setW(pubData, (short) 0, (short)pubData.length);
//		pubKey.setK((short) 1);
		
		return key;
	}

	public short encodePrivateKey(PrivateKey privateKey, byte[] encPrivateKey) {
		// TODO Auto-generated method stub
		ECPrivateKey privKey = (ECPrivateKey)privateKey;
		return privKey.getS(encPrivateKey, (short) 0);
	}
}
