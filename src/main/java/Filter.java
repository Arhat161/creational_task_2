import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();

        List<Integer> result = new ArrayList<>();

        for (int element : source) {
            if (element <= this.treshold) {
                result.add(element);
                logger.log("Элемент " + element + " проходит");
            } else {
                logger.log("Элемент " + element + " не проходит");
            }
        }

        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());

        return result;
    }
}