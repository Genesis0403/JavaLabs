package by.bntu.fitr.povt.filippovich.lab11.model.task1;

public class MultiplicationOfPositives {
    public static double multiplicate(double[] array){
        if (array == null) throw new IllegalStateException("Array is null");
        double multi = 1;
        for(double el : array){
            if (el>0){
                multi *= el;
            }
        }
        return multi;
    }


}
