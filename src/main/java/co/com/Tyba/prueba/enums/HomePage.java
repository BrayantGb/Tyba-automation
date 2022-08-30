package co.com.Tyba.prueba.enums;

public enum HomePage {

    URL_PAGE("url_home_page"),
    USER("user"),
    GREATER("greater than"),
    LESS("less that"),
    ;

    private String home;
    HomePage(String home){
        this.home = home;
    }

    public String getHomePage(){
        return home;
    }
}
