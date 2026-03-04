import java.util.*;
public class _119_pascal_triangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i =1;i<=rowIndex;i++){
            for(int j =i-1;j>0;j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
            row.add(1);
        }
        return row;
    }

    public static void main(String[] args) {
        _119_pascal_triangleII sol = new _119_pascal_triangleII();
        int rowIndex = 3;
        List<Integer> result = sol.getRow(rowIndex);
        System.out.println("Pascal's Triangle Row " + rowIndex + " is: " + result);
    }
}
