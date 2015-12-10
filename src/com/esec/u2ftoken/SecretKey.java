package com.esec.u2ftoken;

import javacard.framework.ISO7816;
import javacard.framework.ISOException;
import javacard.framework.JCSystem;
import javacard.framework.Util;
import javacard.security.AESKey;
import javacard.security.KeyBuilder;
import javacardx.crypto.Cipher;

/** 
 * @author Yang Zhou 
 * @version ����ʱ�䣺2015-12-10 ����06:51:23 
 * ����Կ��صĲ��������ݷ�װ��
 */
public class SecretKey {
	
	public static final byte MODE_ENCRYPT = 0x01; // ����ģʽ
	public static final byte MODE_DECRYPT = 0x02; // ����ģʽ
	
	/**
	 * key wrap��ʵ�壬�������AES�㷨
	 */
	private AESKey mKeyInstance;
	
	/**
	 * ��ʼ��key wrap�㷨����Կ��������mKeyInstance��
	 * ����AES-256�����ɵ�AES��Կ��256λ
	 */
	public SecretKey() {
		mKeyInstance = (AESKey) KeyBuilder.buildKey(KeyBuilder.TYPE_AES, KeyBuilder.LENGTH_AES_256, false);
		byte[] keyData = JCSystem.makeTransientByteArray((short) 32, JCSystem.CLEAR_ON_DESELECT);
		Util.arrayFillNonAtomic(keyData, (short) 0, (short) keyData.length, (byte) 0x00);
		mKeyInstance.setKey(keyData, (short) 0);
	}
	
	/**
	 * key wrap�㷨��������� AES-256 �� ALG_AES_BLOCK_128_CBC_NOPAD
	 * @param data ��Ҫ wrap ������
	 * @param inOffset
	 * @param inLength
	 * @param outBuff
	 * @param outOffset
	 * @param mode ���ܻ���ܡ� Cipher.MODE_ENCRYPT �� Cipher.MODE_DECRYPT
	 */
	public void KeyWrap(byte[] data, short inOffset, short inLength, byte[] outBuff, short outOffset, byte mode) {
		Cipher cipher = Cipher.getInstance(Cipher.ALG_AES_BLOCK_128_CBC_NOPAD, false);
		cipher.init(mKeyInstance, mode); // ��ʼ����(iv)��0
		
		// ���ܻ���ܣ�doFinal��cipher���󽫱�����
		try {
			cipher.doFinal(data, inOffset, inLength, outBuff, outOffset);
		} catch(Exception e) {
			ISOException.throwIt(ISO7816.SW_WRONG_DATA);
		}
	}
}
