package com.whstone.api.utils;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Sha1Utils {

    public static String signRequest(String request, String key) {
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), "HmacSHA1");
            mac.init(keySpec);
            mac.update(request.getBytes());
            byte[] encryptedBytes = mac.doFinal();
            return Base64.encodeBase64String(encryptedBytes);

        } catch (Exception ex) {
            System.out.println("unable to sign request");
            ex.printStackTrace();
        }
        return null;
    }

}
