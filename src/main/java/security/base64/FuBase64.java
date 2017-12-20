package main.java.security.base64;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Created by wunaifu on 2017/7/26.
 */
public class FuBase64 {

    private static String src = "imooc security base64";

    public static void main(String[] args) {
//        jdkBase64();
//        commonsCodecBas64();
        bouncyCastleBas64();
    }

    public static void jdkBase64() {
        try {
            //jdkBase64加密
            BASE64Encoder encoder = new BASE64Encoder();
            String encode = encoder.encode(src.getBytes());
            System.out.println("encode: " + encode);

            //jdkBase64解密
            BASE64Decoder decoder = new BASE64Decoder();
            String decode = new String(decoder.decodeBuffer(encode));
            System.out.println("decode: " + decode);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void commonsCodecBas64() {
        //commonsCodecBas64加密
        byte[] encodeBytes = Base64.encodeBase64(src.getBytes());
        String encode = new String(encodeBytes);
        System.out.println("encode: " + encode);

        //commonsCodecBas64解密
        byte[] decodeBytes = Base64.decodeBase64(encodeBytes);
        String decode = new String(decodeBytes);
        System.out.println("decode: " + decode);
    }

    public static void bouncyCastleBas64() {
        //bouncyCastleBas64加密
        byte[] encodeBytes = org.bouncycastle.util.encoders.Base64.encode(src.getBytes());
        String encode = new String(encodeBytes);
        System.out.println("encode: " + encode);

        //bouncyCastleBas64解密
        byte[] decodeBytes = org.bouncycastle.util.encoders.Base64.decode(encodeBytes);
        String decode = new String(decodeBytes);
        System.out.println("decode: " + decode);
    }

}
