package co.develhope.websocket.entities;

public class SimpleMessageDTO {

    private String content;

    private String type;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
