package com.yorku.library.restservice.security;

import java.security.NoSuchAlgorithmException;

import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;

import org.springframework.stereotype.Service;

@Service
public class AES {
	private SecretKey key;
	private int KEY_SIZE = 256;
	private int T_LEN = 128;
	Cipher encryptionCipher;
	
	public void init() throws Exception {
		KeyGenerator generator = KeyGenerator.getInstance("AES");
		generator.init(KEY_SIZE);
		key = generator.generateKey();		
		}
	
	public String encrypt(String message) throws Exception {
		byte[] msgBytes = message.getBytes();
		Cipher encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
		encryptionCipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] encryptedBytes = encryptionCipher.doFinal(msgBytes);
		return encode(encryptedBytes);
		
	}
	
	

	private String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    private byte[] decode(String data) {
        return Base64.getDecoder().decode(data);
    }
    
    
}
