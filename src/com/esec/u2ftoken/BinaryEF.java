package com.esec.u2ftoken;
/** 
 * @author Yang Zhou 
 * @version ����ʱ�䣺2015-12-7 ����09:36:38 
 * �������ļ���
 */
public class BinaryEF extends BaseFile {
	/**
	 * ����������ļ�ʵ���byte����
	 */
	public byte mFileContent[];
	
	/**
	 * ��FID��ʼ���������ļ�
	 * @param FID �ļ�FID�ĸ��ֽ�
	 * @param SFI �ļ�FID�ĵ��ֽڣ�Ҳ��SFI��
	 */
	public BinaryEF(byte FID, byte SFI) {
		mFID = FID;
		mSFI = SFI;
	}
}
