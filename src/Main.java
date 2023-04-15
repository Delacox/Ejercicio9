public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Trabajador trabajador1 = new Trabajador();

        cliente1.setNombre("Sergio");
        cliente1.setEdad(29);
        cliente1.setTelefono(666666666);
        cliente1.setCredito(9999);

        trabajador1.setNombre("Julia");
        trabajador1.setEdad(30);
        trabajador1.setSalario(1800);
        trabajador1.setTelefono(85888888);

        System.out.println("Datos Cliente: " + cliente1.getNombre() + " " + cliente1.getEdad() + " " + cliente1.getCredito() + " " + cliente1.getTelefono());
        System.out.println("Datos Trabajador: " + trabajador1.getNombre() + " " + trabajador1.getEdad() + " " + trabajador1.getSalario() + " " + trabajador1.getTelefono());
    }

}

class Persona{
    int edad;
    String nombre;
    int telefono;

    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int edad){
        this.edad = edad;

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getTelefono(){
        return this.telefono;
    }

    public void setTelefono(int telefono){
        this.telefono= telefono;
    }

}

class Cliente extends Persona{
    int credito;

    public int getCredito(){

        return this.credito;
    }

    public void setCredito(int credito){

        this.credito = credito;
    }

}

class Trabajador extends Persona {
    float salario;

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario;
    }

}

