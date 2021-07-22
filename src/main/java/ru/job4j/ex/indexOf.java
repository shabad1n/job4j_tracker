package ru.job4j.ex;

    public class indexOf {

        public static int indexOf(String[] value, String key) throws ElementNotFoundException {
            int rsl = -1;
            for (int i = 0; i < value.length; i++) {
                if (value[i].equals(key)) {
                    System.out.println(i);
                    rsl = i;
                    break;
                }
            }
            if(rsl == -1) {
                throw new ElementNotFoundException("Совпадений не обнаружено");
            }
            return rsl;
        }

    public static void main(String[] args) {
        String[] value = new String[]{"hello", "world", "!"};
        try {
            indexOf(value, "Hello");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
