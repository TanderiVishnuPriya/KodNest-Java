class Combination {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "JaVa";
        if (s1 == s2) {
            System.out.println("Ref are equal");
        } else {
            System.out.println("Ref are not equal");
        }
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Ref are equal");
        } else {
            System.out.println("Ref are not equal");
        }
    }
}