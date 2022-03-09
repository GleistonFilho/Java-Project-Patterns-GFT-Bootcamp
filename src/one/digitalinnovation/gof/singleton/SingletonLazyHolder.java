package one.digitalinnovation.gof.singleton;

public class SingletonLazyHolder {
    private static SingletonLazy instancia;

    private  static class InstanceHolder{
        public static  SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){}

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
