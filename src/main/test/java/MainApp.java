/**
 * @Author: Jaime
 * @Date: 2018/4/17 2:12
 * @Description: *
 *//*

import com.DES.DesUtil1;

import java.nio.charset.Charset;

public class MainApp {
    private static final String  SKEY    = "abcdefgh";
    private static final Charset CHARSET = Charset.forName("gb2312");

    public static void main(String[] args) {
        // 待加密内容
        String str = "测试内容，今天周四";
        String encryptResult = DesUtil1.encrypt(str, CHARSET, SKEY);
        System.out.println(encryptResult);
        // 直接将如上内容解密
        String decryResult = "";
        try {
            decryResult = DesUtil1.decrypt(encryptResult, CHARSET, SKEY);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        System.out.println(decryResult);
    }
}*/
