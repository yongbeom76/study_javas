import java.util.Map;

import com.google.gson.Gson;

import beans.MemberBean;

public class ConvertJsonWithGson {
  public static void main(String[] args) {
    // 문자열 Json -> Map
    Gson gson = new Gson();
    String jsonStr = "{id:1, name:yojulab, habits:[fitness,read,game]}";
    Map jsonMap = gson.fromJson(jsonStr, Map.class);

    // Map -> 문자열 Json
    String mapStr = gson.toJson(jsonMap);

    // 문자열 Json -> Object(bean,model,vo)
    String jsonStrBean = "{firstName:yo, secondName:jo, handleName:lab}";
    MemberBean memberBean = gson.fromJson(jsonStrBean, MemberBean.class);
    // Object -> 문자열 Json
    String memberBeanStr = gson.toJson(memberBean);
    int i = 0;

  }
}
