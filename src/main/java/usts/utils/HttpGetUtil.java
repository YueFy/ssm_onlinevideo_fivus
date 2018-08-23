package usts.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpGetUtil {

    // 发起http get类型请求获取返回结果
    public static String httpGet(String urlstr) throws IOException {
        URL url = new URL(urlstr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.connect();
        InputStream is = conn.getInputStream();

        byte[] buff = new byte[is.available()];
        is.read(buff);
        String ret = new String(buff, "utf-8");

        is.close();
        conn.disconnect();

        return ret;
    }

}