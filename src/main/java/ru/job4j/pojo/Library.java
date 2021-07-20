package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 459);
        Book tenLittleNiggers = new Book("Ten Little Niggers", 345);
        Book harryPotter = new Book("Harry Potter", 5655);
        Book lordOfTheRings = new Book("Lord Of The Rings", 782);
        Book[] firstShelf = new Book[4];
        firstShelf[0] = cleanCode;
        firstShelf[1] = tenLittleNiggers;
        firstShelf[2] = harryPotter;
        firstShelf[3] = lordOfTheRings;
        for (Book bn : firstShelf) {
            System.out.println(bn.getName() + " - " + bn.getCount() + " p.");
        }
        Book temp = firstShelf[0];
        firstShelf[0] = firstShelf[2];
        firstShelf[2] = temp;
        for (Book bn : firstShelf) {
            System.out.println(bn.getName() + " - " + bn.getCount() + " p.");
        }
        for (int i = 0; i < firstShelf.length; i++) {
            Book bn = firstShelf[i];
            if (bn.getName().equals(cleanCode.getName())) {
                System.out.println(bn.getName());
                break;
            }
        }
    }
}
