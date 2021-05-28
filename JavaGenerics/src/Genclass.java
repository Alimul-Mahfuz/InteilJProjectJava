public class Genclass <Thing extends Number, Thing2 extends Number>{
    //Here Number is bounded parameter.
    //Meaning that we can only pass Thing1, Thing2 which class only extend form number class
    //like int,float,double they are extend form number class
    //

    Thing x;
    Thing2 y;

    Genclass(Thing x, Thing2 y){
        this.x = x;
        this.y = y;
    }

    public Thing2 getValue() {
        return y;

    }
}