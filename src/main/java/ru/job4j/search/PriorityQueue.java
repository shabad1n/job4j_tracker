package ru.job4j.search;

import java.util.LinkedList;

    public class PriorityQueue {
        private LinkedList<Task> tasks = new LinkedList<>();

        /**
         * Метод должен вставлять в нужную позицию элемент.
         * Позиция определяется по полю приоритет.
         * Для вставки использовать add(int index, E value)
         * @param task задача
         */

        public void put(Task task) {
            int index = 0;
                for (Task element : tasks) {
                    if (task.getPriority() > element.getPriority() - 1) {
                        index++;
                }
            }
            this.tasks.add(index, task);
        }

        public Task take() {
            return tasks.poll();
        }


        public static void main(String[] args) {
            PriorityQueue queue = new PriorityQueue();
            queue.put(new Task("Сходить в магазин", 2));
            queue.put(new Task("Выпить воды", 1));
            queue.put(new Task("Сделать уборку в квартире", 3));
            System.out.println(queue.take());
            System.out.println(queue.take());

        }
}
