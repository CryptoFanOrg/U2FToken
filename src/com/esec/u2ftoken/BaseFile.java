package com.esec.u2ftoken;
/** 
 * @author Yang Zhou 
 * @version ����ʱ�䣺2015-12-7 ����09:31:38 
 * �����ļ��Ļ���
 */
public class BaseFile {
	public static final byte FILE_TYPE_BINARY = 0x02; // �������ļ�
	public static final byte FILE_TYPE_FIXED_LENGTH = 0x03; // ������¼�ļ�
	
	/**
	 * �ļ�FID�ĸ��ֽ�
	 */
	public byte mFID;
	
	/**
	 * �ļ���SFIֵ
	 */
	public byte mSFI;
}
