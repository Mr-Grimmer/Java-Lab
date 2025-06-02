class Question4 implements CharSequence {
    private final String data;

    public Question4(String data) {
        this.data = new StringBuilder(data).reverse().toString();
    }

    @Override
    public char charAt(int index) {
        return data.charAt(index);
    }

    @Override
    public int length() {
        return data.length();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return data.substring(start, end);
    }

    @Override
    public String toString() {
        return data;
    }

    public static void main(String[] args) {
        Question4 reverse = new Question4("Java is platform independent");
        System.out.println("Reversed: " + reverse);
        System.out.println("charAt(3): " + reverse.charAt(3));
        System.out.println("length: " + reverse.length());
        System.out.println("subSequence(2, 7): " + reverse.subSequence(2, 7));
    }
}
