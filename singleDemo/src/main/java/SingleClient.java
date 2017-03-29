/**
 * Created by carry on 17-3-20.
 */
class MyThread extends Thread {

}


public class SingleClient {
    public static void main(String[] args) {
        SingleObject1 instance1 = (SingleObject1) SingleFactory.getInstance(1);
        SingleObject1 instance2 = (SingleObject1) SingleFactory.getInstance(1);
        SingleObject2 instance3 = (SingleObject2) SingleFactory.getInstance(2);
        SingleObject2 instance4 = (SingleObject2) SingleFactory.getInstance(2);
        SingleObject3 instance5 = (SingleObject3) SingleFactory.getInstance(3);
        SingleObject3 instance6 = (SingleObject3) SingleFactory.getInstance(3);
        SingleObject4 instance7 = (SingleObject4) SingleFactory.getInstance(4);
        SingleObject4 instance8 = (SingleObject4) SingleFactory.getInstance(4);
        SingleObject5 instance9 = (SingleObject5) SingleFactory.getInstance(5);
        SingleObject5 instance10 = (SingleObject5) SingleFactory.getInstance(5);
        SingleObject6 instance11 = (SingleObject6) SingleFactory.getInstance(6);
        SingleObject6 instance12 = (SingleObject6) SingleFactory.getInstance(6);

        instance1.showMessage(instance1.toString());
        instance2.showMessage(instance2.toString());
        instance3.showMessage(instance3.toString());
        instance4.showMessage(instance4.toString());
        instance5.showMessage(instance5.toString());
        instance6.showMessage(instance6.toString());
        instance7.showMessage(instance7.toString());
        instance8.showMessage(instance8.toString());
        instance9.showMessage(instance9.toString());
        instance10.showMessage(instance10.toString());
        instance11.showMessage(String.valueOf(instance11.hashCode()));
        instance12.showMessage(String.valueOf(instance12.hashCode()));
    }
}
