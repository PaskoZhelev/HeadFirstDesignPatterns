package ESingletonPattern;

public class ChocolateBoiler {

    private static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler(){}

    public static synchronized ChocolateBoiler getInstance(){
        if(chocolateBoiler == null){
            chocolateBoiler = new ChocolateBoiler();
        }

        return chocolateBoiler;
    }
}
