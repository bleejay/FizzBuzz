import java.util.ArrayList;

public class FizzBuzz {

    private ArrayList<String> fizzBuzzArray;
    private Integer total = 0;

    public void fizzBuzzIterator(Integer start, Integer end){
        fizzBuzzDecider(start, end);
        for (String element: fizzBuzzArray) {
            System.out.println(element);
        }
    }

    private void fizzBuzzDecider(Integer start, Integer end){
        fizzBuzzArray= new ArrayList();
        Integer index = 0;
        for (Integer i = start; i <= end ; i++) {
            if (i % 15 == 0) {
                fizzBuzzArray.add(index++, i.toString() + " FizzBuzz");
                total += i;
            } else if (i % 3 == 0) {
                fizzBuzzArray.add(index++, i.toString() + " Fizz");
                total += i;
            } else if (i % 5 == 0) {
                fizzBuzzArray.add(index++, i.toString() + " Buzz");
                total += i;
            } else {
                fizzBuzzArray.add(index++, i.toString());
            }
        }
    }

    public Integer getTotal() {
        return total;
    }
}
