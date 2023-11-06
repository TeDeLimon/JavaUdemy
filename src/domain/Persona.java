package domain;

public class Persona {

    private String name;

    public Persona(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Sobreescribimos el método toString para convertir un objeto a string.
    //Persona no hereda ninguna clase por tanto super se refiere a la clase por defecto Object
    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                '}' + ", "
                + super.toString();
    }
}
