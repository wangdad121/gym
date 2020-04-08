package com.zhiyou.gym.entity;

import lombok.extern.slf4j.Slf4j;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
@Slf4j
public class Base64 {
    private static final BASE64Encoder encoder = new BASE64Encoder();
    private static final BASE64Decoder decoder = new BASE64Decoder();
    //加密
    public static String jiami(String toEncodeContent) {
        if (toEncodeContent == null || "".equals(toEncodeContent)) {
            return null;
        }
        return encoder.encode(toEncodeContent.getBytes());
    }
    //解密
    public static String jiemi(String toDecodeContent) {
        if (toDecodeContent == null || "".equals(toDecodeContent)) {
            return null;
        }
        byte[] buf = null;
        try {
            buf = decoder.decodeBuffer(toDecodeContent);
        } catch (IOException e) {
          //  log.info("EncryptUtil-->decryptByBase64 Base64解密失败！", e);
        }
        return new String(buf);
    }
}
