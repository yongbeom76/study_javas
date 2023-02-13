import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorer2 {
  public static void main(String[] args) throws UnsupportedEncodingException {
    /*
     * 행정안전부_지진해일 긴급대피장소
     * http://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List
     * ?serviceKey=g4Undik8WRDVJemx13Et%
     * 2FHQGJuaOlJbJkWMaxXMT6okBYZqwz8YjgoZ4AMfhStQ93iWeg7OiBdymK0ya3YxGJg%3D%3D
     * &pageNo=1
     * &numOfRows=10
     * &type=xml
     */

    StringBuilder urlBuilder = new StringBuilder(
        "http://apis.data.go.kr/1741000/TsunamiShelter3/getTsunamiShelter1List"); /* URL */
    // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
    urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=")
        .append("g4Undik8WRDVJemx13Et%2FHQGJuaOlJbJkWMaxXMT6okBYZqwz8YjgoZ4AMfhStQ93iWeg7OiBdymK0ya3YxGJg%3D%3D");
    urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
    urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
    urlBuilder.append("&" + URLEncoder.encode("type", "UTF-8") + "=" + URLEncoder.encode("xml", "UTF-8"));

    URL url;
    HttpURLConnection conn = null;
    try {
      url = new URL(urlBuilder.toString());
      conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET"); // 여기가 통신하는 시점
      // conn.setRequestProperty(null, null);
      System.out.println("Response code : " + conn.getResponseCode());

      BufferedReader reader = null;
      if (conn.getResponseCode() >= 200 && conn.getResponseCode() < 300) { // 정상
        reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      } else { // 비정상
        reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      }

      StringBuffer stringBuffer = new StringBuffer();
      String line;
      while ((line = reader.readLine()) != null) {
        stringBuffer.append(line);
      }
      int i = 1;
      reader.close();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      conn.disconnect();
    }
  }
}
