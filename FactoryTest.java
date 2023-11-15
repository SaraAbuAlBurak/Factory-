
public class FactoryTest {
    public A create(int type){
        
        if(type==1){
            return new B();
        }
       if(type==2){
       return new C ();
       }
        return null;
    }
}
