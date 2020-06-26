import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[] contentArray ;
    public static int[] contentArrayClone ;
    public static int[] transferArray;
    public static List<ValueIndex> posList = new ArrayList<>();
    public static List<ValueIndex> negList = new ArrayList<>();
 
 
    public static void main(String[] args) throws IOException {
        // write your code here
 
//        contentArray = new int[]{3, -1, -2};
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
 
        st = new StringTokenizer(br.readLine());
 
        contentArray = new int[n];
        transferArray = new  int[n];
        int value;
 
        for (int i=0; i<n; i++){
            value = Integer.parseInt(st.nextToken());
 
            if (value > 0) {
                posList.add(new ValueIndex(value,i));
            } else {
                negList.add(new ValueIndex(value,i));
            }
 
            contentArray[i] = value;
            transferArray[i] = 0;
        }
        contentArrayClone = contentArray.clone();
//        list.add(0);
 
        IndexSorter is = new IndexSorter();
//        posList.sort(Collections.reverseOrder());
//        negList.sort(Collections.reverseOrder(is));
 
        for (ValueIndex v : posList) {
            if (!posList.isEmpty() && !negList.isEmpty()){
                costMinimizer(v.getIndex(), k);
            }
            else {
                break;
            }
        }
 
 
 
 
        long sum=0;
        for (int i = 0; i < contentArray.length; i++) {
            sum += Math.abs((contentArray[i] + transferArray[i]));
        }
 
        System.out.println(sum);
 
    }
 
    public static void costMinimizer (int index, int k){
        int giver = contentArrayClone[index],taker,takerIndex=-999;
//        boolean flag=false;
        List<ValueIndex> valuesRemoval = new ArrayList<>();
 
 
        for (ValueIndex f : negList) {
            if (giver > 0) {
             takerIndex = f.getIndex();
                if ((takerIndex <= index + k && takerIndex >= index - k) ) {
 
 
                    taker = contentArrayClone[takerIndex];
                    if (giver >= Math.abs(taker)) {
                        transferArray[index] += taker;
                        transferArray[takerIndex] += -1 * taker;
                        contentArrayClone[takerIndex] += -1 * taker;
                        giver = giver + taker;
                        valuesRemoval.add(f);
//                    negList.remove(v);
 
                    } else {
                        transferArray[index] += -1 * giver;
                        transferArray[takerIndex] += giver;
                        contentArrayClone[takerIndex] += giver;
                        giver = giver + (-1 * giver);
//                        break;
 
                    }
                    contentArrayClone[index] = giver;
 
 
//                flag=true;
 
                }
            } else {
                break;
            }
 
 
        }
 
 
        for (ValueIndex j: valuesRemoval) {
            negList.remove(j);
        }
 
 
 
    }
}
 
 
class ValueIndex implements Comparable<ValueIndex> {
 
    private final int value;
    private final int index;
 
 
    public ValueIndex(int value, int index) {
        this.value = value;
        this.index = index;
    }
 
    public int getValue() {
        return value;
    }
 
    public int getIndex() {
        return index;
    }
 
    @Override
    public int compareTo(ValueIndex o) {
        return this.value - o.value;
    }
}
 
class IndexSorter implements Comparator<ValueIndex> {
 
    @Override
    public int compare(ValueIndex o1, ValueIndex o2) {
        return o1.getIndex() - o2.getIndex();
    }
}