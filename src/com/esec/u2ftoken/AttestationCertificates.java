package com.esec.u2ftoken;
/** 
 * @author Yang Zhou 
 * @version 创建时间：2015-12-21 下午04:51:42 
 * Attestation certificate. Store in a variable length record EF.
 */
public class AttestationCertificates {
	
	public static final short CERT_COUNT = 1;
	
	/**
	 * Attestation certificate
	 * doc/cert.der
	 */
	private static final byte[] attestationCert = {0x30, (byte)0x82, 0x01, 0x15, 0x30, (byte)0x81, (byte)0xbc, 0x02, 0x09, 0x00, (byte)0xc5, (byte)0xf4, (byte)0xee, 0x4c, 0x59, 0x50, 0x3e, 0x05, 0x30, 0x0a, 0x06, 0x08, 0x2a, (byte)0x86, 0x48, (byte)0xce, 0x3d, 0x04, 0x03, 0x02, 0x30, 0x13, 0x31, 0x11, 0x30, 0x0f, 0x06, 0x03, 0x55, 0x04, 0x03, 0x13, 0x08, 0x59, 0x61, 0x6e, 0x67, 0x5a, 0x68, 0x6f, 0x75, 0x30, 0x1e, 0x17, 0x0d, 0x31, 0x35, 0x31, 0x32, 0x30, 0x39, 0x30, 0x37, 0x30, 0x34, 0x35, 0x38, 0x5a, 0x17, 0x0d, 0x31, 0x36, 0x31, 0x32, 0x30, 0x38, 0x30, 0x37, 0x30, 0x34, 0x35, 0x38, 0x5a, 0x30, 0x13, 0x31, 0x11, 0x30, 0x0f, 0x06, 0x03, 0x55, 0x04, 0x03, 0x13, 0x08, 0x59, 0x61, 0x6e, 0x67, 0x5a, 0x68, 0x6f, 0x75, 0x30, 0x59, 0x30, 0x13, 0x06, 0x07, 0x2a, (byte)0x86, 0x48, (byte)0xce, 0x3d, 0x02, 0x01, 0x06, 0x08, 0x2a, (byte)0x86, 0x48, (byte)0xce, 0x3d, 0x03, 0x01, 0x07, 0x03, 0x42, 0x00, 0x04, 0x72, (byte)0x9a, 0x71, (byte)0xd0, (byte)0x81, 0x62, 0x42, (byte)0x84, (byte)0x92, (byte)0xf2, (byte)0xd9, 0x61, (byte)0x92, 0x4d, 0x37, 0x44, 0x3a, 0x4f, 0x1b, (byte)0xda, 0x58, 0x0f, (byte)0x8a, (byte)0xea, 0x29, 0x20, (byte)0xd2, (byte)0x99, 0x7c, (byte)0xbe, (byte)0xa4, 0x39, 0x60, (byte)0xce, 0x72, (byte)0x9e, 0x35, (byte)0xc1, (byte)0xf7, 0x40, (byte)0x92, (byte)0xf2, 0x25, 0x0e, 0x60, 0x74, (byte)0x82, 0x3f, (byte)0xc5, 0x7f, 0x33, 0x60, (byte)0xb7, (byte)0xcd, 0x39, 0x69, (byte)0xc3, (byte)0xc3, 0x12, 0x5e, (byte)0xce, 0x26, 0x5c, 0x29, 0x30, 0x0a, 0x06, 0x08, 0x2a, (byte)0x86, 0x48, (byte)0xce, 0x3d, 0x04, 0x03, 0x02, 0x03, 0x48, 0x00, 0x30, 0x45, 0x02, 0x21, 0x00, (byte)0xe7, 0x67, (byte)0xfa, (byte)0x94, 0x10, 0x35, (byte)0xd5, (byte)0x85, 0x3d, 0x52, (byte)0xd8, 0x7d, 0x67, 0x14, 0x70, (byte)0xbc, 0x76, 0x3b, (byte)0xc5, (byte)0xb1, 0x2e, 0x1d, 0x45, 0x77, (byte)0xea, (byte)0x9f, (byte)0x8c, (byte)0xa6, 0x74, (byte)0xe5, (byte)0x9d, 0x39, 0x02, 0x20, 0x3f, (byte)0xe1, 0x1c, (byte)0xad, 0x59, (byte)0xf5, 0x35, 0x76, 0x00, 0x1f, 0x15, (byte)0xee, 0x05, (byte)0xda, (byte)0x87, 0x46, (byte)0xfe, (byte)0xd3, 0x27, 0x6b, 0x16, (byte)0x82, (byte)0x9e, (byte)0x9d, 0x5e, (byte)0xfd, (byte)0xff, 0x70, 0x5e, 0x08, (byte)0x9c, 0x6d};
	
}
