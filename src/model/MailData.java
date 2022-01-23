package model;

public class MailData {

    private String toUser;
    private String body;
    private String subject;

    public MailData(String toUser, String subject, String body) {
        this.toUser = toUser;
        this.body = body;
        this.subject = subject;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
