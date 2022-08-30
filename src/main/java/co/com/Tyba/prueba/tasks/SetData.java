package co.com.Tyba.prueba.tasks;

import co.com.Tyba.prueba.models.DataExcel;
import co.com.Tyba.prueba.utils.SetDataTest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Shared;

public class SetData implements Task {
    @Shared
    DataExcel dataExcel;

    @Override
    public <T extends Actor> void performAs(T actor) {
        dataExcel.setSetDeDatos(SetDataTest.dePrueba());
    }
    public static SetData user(){
        return Tasks.instrumented(SetData.class);
    }
}
