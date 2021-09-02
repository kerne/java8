package cl.poc.pattern;

public class MainBuilder {


    public static void main(String[] args) {

        BuilderAnimal builderAnimal = new BuilderAnimal();
        builderAnimal.setName("Cesar").setLastName("Araya");

        Animals animal = builderAnimal.build();
        System.out.println(animal.getLastName());

    }
}

class BuilderAnimal{
    private String name;
    private String lastName;

    public BuilderAnimal setName(String name) {
        this.name = name;
        return this;
    }

    public BuilderAnimal setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Animals build(){
        return new Animals(name,lastName);

    }
}


class Animals{
    private String name;
    private String lastName;

    public Animals(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public Animals setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Animals setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
