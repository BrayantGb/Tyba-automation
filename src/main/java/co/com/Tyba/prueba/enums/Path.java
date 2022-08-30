package co.com.Tyba.prueba.enums;

public enum Path {
    FILE("./src/test/resources/co/com/Tyba/prueba/data/DataFile.xlsx"),
    SELECT("select * from "),
    NAME("Tyba"),
    WHERE(" where ID_Prueba = 1"),
    ;

    private String getPath;
    Path(String path) {this.getPath = path;}
    public String getPath() {return getPath;}
}
