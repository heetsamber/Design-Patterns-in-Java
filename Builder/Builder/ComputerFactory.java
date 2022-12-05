package Builder;

public class ComputerFactory {

    private BluePrint print;

    public void setBluePrint(BluePrint print){
        this.print = print;
    }

    public void make(){
        print.setCpu();
        print.setRam();
        print.setStorage();
    }

    public Computer getComputer(){
        return print.getComputer();
    }
}
