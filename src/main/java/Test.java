public class Test {

    public static void main(String[] args) {
        System.out.println(PinYinUtils.getHanziPinYin("1#我们都是中国人，我们爱我们的国家"));
        System.out.println(PinYinUtils.getHanziInitials("a我们"));
        System.out.println(PinYinUtils.cn2FirstSpell("a我们"));
        System.out.println(PinYinUtils.cn2FirstSpell("#a我们"));
    }
}
