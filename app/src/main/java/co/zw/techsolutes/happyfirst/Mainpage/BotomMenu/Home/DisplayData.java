package co.zw.techsolutes.happyfirst.Mainpage.BotomMenu.Home;

public class DisplayData {

   private String Topic;
   private String body;
  private  int picid;

    public DisplayData(String topic, String body, int picid) {
        Topic = topic;
        this.body = body;
        this.picid = picid;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getPicid() {
        return picid;
    }

    public void setPicid(int picid) {
        this.picid = picid;
    }
}
