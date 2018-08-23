package usts.utils;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class BaiduUtil {
    /**
     * 下载头像图片
     *
     * @param portraitUrl
     * @return
     * @author pl
     */
    public static byte[] downloadPortrait(String portraitUrl) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        try {
            URL url = new URL(portraitUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.connect();
            InputStream is = conn.getInputStream();

            byte[] buff = new byte[1024];
            int cnt;
            while ((cnt = is.read(buff)) > 0) {
                baos.write(buff, 0, cnt);
            }

            is.close();
            conn.disconnect();

            baos.close();
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    // 写头像文件
    public static void savePortrait(String fileName, byte[] portraitData) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
            fos.write(portraitData);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                }
            }
        }
    }
}
