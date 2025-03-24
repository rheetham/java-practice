class CharDemo {
    public static void main(String args[]) {
        char ch1, ch2;

        ch1 = 65;
        ch2 = 'A';

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);

        if (ch1 == ch2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        ch1++;

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);

        if (ch1 == ch2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}