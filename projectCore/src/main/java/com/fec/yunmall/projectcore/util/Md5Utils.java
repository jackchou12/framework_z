package com.fec.yunmall.projectcore.util;

import android.support.annotation.NonNull;

import com.fec.yunmall.projectcore.util.Decoder.Base64Utils;
import com.fec.yunmall.projectcore.util.Decoder.RSAEncrypt;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;


public class Md5Utils {
    private static String key = "As=e3gTkQWEtv";
    /**
     * 字符串MD5加密工具类
     */
    public static String MD5Encode(@NonNull String string) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(string.getBytes("UTF-8"));
            StringBuilder hex = new StringBuilder(hash.length * 2);
            for (byte b : hash) {
                if ((b & 0xFF) < 0x10) {
                    hex.append("0");
                }
                hex.append(Integer.toHexString(b & 0xFF));
            }
            return hex.toString();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String publishKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC5syOAKf0BD13V3cWUBHCrBGXnbLEzewH4mzutfw8ItB5uOhJp1bmD0m/XpkFRAgHwg8KatA8wNbDKyI0oBo3Wgfd9WeJe8d9XixYITs/MSr+Gx9gTozHQHdR64YBehw+0Lxz0fsLTcwjFMfiGpaQRXPgChWAPWD8fUJ/JMErQdwIDAQAB";

    /**
     * 登录密码加密
     * @param password
     * @return
     */
    public static String encryptPassWord(String password){
        //return MD5Encode(password+key);
        String afterencrypt = null;

        try {
            PublicKey publicKey = RSAEncrypt.getCPublicKey(publishKey);
            byte[] encryptByte = RSAEncrypt.encryptData(password, publicKey);
            afterencrypt = Base64Utils.encode(encryptByte);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 加密

        return afterencrypt;
    }
   /* *//**
     * 登录密码MD5加密
     * @param password
     * @return
     *//*
    public static String encryptPassword(@NonNull String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] data = password.getBytes("UTF-16LE");
            md.update(data);
            data = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                String d = Integer.toHexString(data[i] & 0xFF);
                if (i > 0) {
                    sb.append("-");
                }

                if (d.length() == 1) {
                    sb.append("0");
                }
                sb.append(d);
            }
            return sb.toString().toUpperCase();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }*/
}