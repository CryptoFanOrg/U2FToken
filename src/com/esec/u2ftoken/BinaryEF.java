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
	private byte mFileContent[];
	
	/**
	 * ��FID��ʼ���������ļ�
	 * @param FID �ļ�FID�ĸ��ֽ�
	 * @param SFI �ļ�FID�ĵ��ֽڣ�Ҳ��SFI��
	 */
	public BinaryEF(byte FID, byte SFI) {
		mFID = FID;
		mSFI = SFI;
	}
	
	/**
	 * ��̬���������ļ�����ռ�
	 * @param size ����ռ��С
	 */
	public void createBinaryContent(short size) {
		//TODO ���ܻ������ռ�����
		mFileContent = new byte[size];
	}
	
	/**
	 * ��һ���ֽ��������øö������ļ�ʵ��
	 * @param mContent ����Ķ������ļ�ʵ��
	 */
	public void setFileContent(byte[] mContent) {
		mFileContent = mContent;
	}
	
	/**
	 * ��øö������ļ�ʵ��
	 * @return �������ļ�ʵ����ֽ�����
	 */
	public byte[] getFileContent() {
		return mFileContent;
	}
}
