package ru.job4j.search;

import java.util.LinkedList;

    public class PriorityQueue {
        private LinkedList<Task> tasks = new LinkedList<>();

        public void put(Task task) {
            int index = 0;
                for (Task element : tasks) {
                    if (task.getPriority() < element.getPriority()) {
                        break;
                } else {
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
            queue.put(new Task("Сходить в магазин", 5));
            queue.put(new Task("Выпить воды", 4));
            queue.put(new Task("Сделать уборку в квартире", 3));
            queue.put(new Task("Сделать уборку ", 1));
            queue.put(new Task("Сделать ", 2));
            System.out.println(queue.take());
            System.out.println(queue.take());

        }
}
