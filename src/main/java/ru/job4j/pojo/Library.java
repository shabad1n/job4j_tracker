package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 459);
        Book tenLittleNiggers = new Book("Ten Little Niggers", 345);
        Book harryPotter = new Book("Harry Potter", 565);
        Book lordOfTheRings = new Book("Lord Of The Rings", 782);
        Book[] firstShelf = new Book[4];
        firstShelf[0] = cleanCode;
        firstShelf[1] = tenLittleNiggers;
        firstShelf[2] = harryPotter;
        firstShelf[3] = lordOfTheRings;
        for (int i = 0; i < firstShelf.length; i++) {
            Book bn = firstShelf[i];
            System.out.println(bn.getName() + " - " + bn.getCount() + " p.");
        }
        for (int i = 0; i < firstShelf.length; i++) {
            if (i == 0 && firstShelf.length > 2) {
                Book temp = firstShelf[0];
                firstShelf[0] = firstShelf[2];
                firstShelf[2] = temp;
            }
        }
        for (int i = 0; i < firstShelf.length; i++) {
            Book bn = firstShelf[i];
            System.out.println(bn.getName() + " - " + bn.getCount() + " p.");
        }
    }
}
