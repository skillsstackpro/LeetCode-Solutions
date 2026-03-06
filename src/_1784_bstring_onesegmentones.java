public class _1784_bstring_onesegmentones {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }

    public static void main(String[] args) {
        String s= ("1001");
        _1784_bstring_onesegmentones sol = new _1784_bstring_onesegmentones();
        boolean result =sol.checkOnesSegment(s);
        System.out.println(result);
    }
}
