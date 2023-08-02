public enum NumEquals {
    ZERO(0, "Zero"),
    ONE(1, "One"),
    TWO(2, "Two"),
    THREE(3, "Threee"),
    FOUR(4, "Four"),
    FIVE(5, "Five"),
    SIX(6, "Six"),
    SEVEN(7, "Seven"),
    EIGHT(8, "Eight"),
    NINE(9, "Nine"),
    ;
    private int index;
    private String word;

    NumEquals(int index, String word) {
        this.index = index;
        this.word = word;
    }

    public int getIndex() {
        return index;
    }

    public String getWord() {
        return word;
    }

    //Metodu Mainde çağırabilmek için static yapmamız gerekti
    public static String getWordFromIndex(int index) {
        NumEquals[] nums = NumEquals.values();
        return nums[index].getWord();
    }
}
