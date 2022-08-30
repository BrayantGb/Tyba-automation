package co.com.Tyba.prueba.utils;

import co.com.Tyba.prueba.models.DataExcel;
import co.com.Tyba.prueba.models.NewUser;

public class Converter {

    private Converter(){}

    public static NewUser registre(DataExcel dataExcel){
        NewUser newUser = new NewUser();
        newUser.setUsername(dataExcel.getSetDeDatos().get(0).get("Username"));
        newUser.setEmail(dataExcel.getSetDeDatos().get(0).get("Email"));
        newUser.setInvalidEmail(dataExcel.getSetDeDatos().get(0).get("InvalidEmail"));
        newUser.setPassword(dataExcel.getSetDeDatos().get(0).get("Password"));
        newUser.setConfirma_password(dataExcel.getSetDeDatos().get(0).get("Confirma_password"));
        newUser.setFirst_Name(dataExcel.getSetDeDatos().get(0).get("First_Name"));
        newUser.setLast_Name(dataExcel.getSetDeDatos().get(0).get("Last_Name"));
        newUser.setPhone_Number(dataExcel.getSetDeDatos().get(0).get("Phone_Number"));
        newUser.setCountry(dataExcel.getSetDeDatos().get(0).get("Country"));
        newUser.setCity(dataExcel.getSetDeDatos().get(0).get("City"));
        newUser.setAddress(dataExcel.getSetDeDatos().get(0).get("Address"));
        newUser.setState(dataExcel.getSetDeDatos().get(0).get("State"));
        newUser.setPostal_Code(dataExcel.getSetDeDatos().get(0).get("Postal_Code"));
        newUser.setConfirmPasswordIncorrect(dataExcel.getSetDeDatos().get(0).get("ConfirmPasswordIncorrect"));
        return newUser;
    }
}
