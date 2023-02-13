import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiExplorersWithDatagokr {
  public static void main(String[] args) throws UnsupportedEncodingException {
    /*
     * 외교부 국가/지역별 최신 안전소식 (코로나 관련) - 중국
     * https://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/
     * getCountrySafetyNewsListNew
     * ?serviceKey=g4Undik8WRDVJemx13Et%
     * 2FHQGJuaOlJbJkWMaxXMT6okBYZqwz8YjgoZ4AMfhStQ93iWeg7OiBdymK0ya3YxGJg%3D%3D
     * &returnType=JSON
     * &numOfRows=10
     * &pageNo=1
     * &cond[country_nm::EQ]=중국
     */

    StringBuilder urlBuilder = new StringBuilder(
        "http://apis.data.go.kr/1262000/CountryCovid19SafetyServiceNew/getCountrySafetyNewsListNew"); /* URL */
    // 2. 오픈 API의요청 규격에 맞는 파라미터 생성, 발급받은 인증키.
    urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8") + "=")
        .append("g4Undik8WRDVJemx13Et%2FHQGJuaOlJbJkWMaxXMT6okBYZqwz8YjgoZ4AMfhStQ93iWeg7OiBdymK0ya3YxGJg%3D%3D");
    /** Service * Key */
    urlBuilder.append("&" + URLEncoder.encode("returnType", "UTF-8") + "=" + URLEncoder.encode("JSON", "UTF-8"));
    /** XML* 또는* JSON */
    urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8"));
    /** 한 페이지* 결과 수 */
    urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
    /* 페이지 번호 */
    urlBuilder.append("&" + URLEncoder.encode("cond[country_nm::EQ]", "UTF-8") + "="
        + URLEncoder.encode("중국", "UTF-8")); /* ISO 2자리코드 */

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
