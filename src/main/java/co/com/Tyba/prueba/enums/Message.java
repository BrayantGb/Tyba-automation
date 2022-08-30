package co.com.Tyba.prueba.enums;

public enum Message {
    WRONG_PASSWORD("Passwords do not match"),
    INAVLID_EMAIL("Your email address isn't formatted correctly"),
    SHIPPING_SUCCESSFUL("ORDER PAYMENT"),
    ;

    private String informative;
    Message(String informative){this.informative = informative;}

    public String getInformative() {return informative;}
}
