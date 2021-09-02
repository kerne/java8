package cl.poc.pattern;

public class MainComputer {

    public static void main(String[] args) {
        ComputerAbstractFactory factory = new ServerFactory("2GB","4G","500Gb");
        System.out.println(factory.createComputer());
    }
}


abstract class Computer {
    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getHDD();


}


interface ComputerAbstractFactory  {
     Computer createComputer();
}

class PCFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram,  String cpu,String hdd){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(this.ram, this.hdd, this.cpu);
    }
}


class ServerFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public ServerFactory(String ram,  String cpu,String hdd){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new Server(this.ram, this.hdd, this.cpu);
    }
}

class PC extends Computer {

    private String ram;
    private String cpu;
    private String hdd;

    public PC(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getHDD() {
        return hdd;
    }
}


class Server extends Computer {

    private String ram;
    private String cpu;
    private String hdd;

    public Server(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }

    @Override
    public String getRAM() {
        return ram;
    }

    @Override
    public String getCPU() {
        return cpu;
    }

    @Override
    public String getHDD() {
        return hdd;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Server{");
        sb.append("ram='").append(ram).append('\'');
        sb.append(", cpu='").append(cpu).append('\'');
        sb.append(", hdd='").append(hdd).append('\'');
        sb.append('}');
        return sb.toString();
    }
}