// We're gonna use this file to practice some basic OOP
// ENCAPSUALTION

class Encapsulator {

    private int itemsCounted = 0;
    private String guess = "fareebs";
    public static final int MAX_AMOUNT = 12; // final means it can't be reset (like a const in TypeScript)

    public void fill() { // multi methods with same name is method overloading
        fill(MAX_AMOUNT);
    }

    public void fill(int amount) { // multi methods with same name is method overloading
        int newAmount = itemsCounted + amount;
        if (newAmount > MAX_AMOUNT) {
            throw new IllegalArgumentException("Too many items!!!");
        }
        itemsCounted = newAmount;
    }

    public boolean isEmpty() {
        return itemsCounted == 0;
    }

    public boolean countItems() {
        boolean wasCounted = false;
        if (!isEmpty()) {
            wasCounted = true;
            itemsCounted--;
        }
        return wasCounted;
    }

    public void showEnhancedForLoop(String word) {
        for (char letter : word.toCharArray()) {
            System.out.println("We've got the letter " + letter);
        }
    }

    public void matchingLetters(char letter) {
        int matches = 0;
        for (char singleLetter : guess.toCharArray()) {
            if (letter == singleLetter) {
                matches++;
            }
        }
        System.out.printf("You got %d letters right in your guess. %n", matches);
    }
}
