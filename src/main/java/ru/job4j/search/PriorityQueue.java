package ru.job4j.search;

import java.util.LinkedList;
/**
 * Класс описывает работу простейшей очереди по приоритету, которая работает
 * по принципу FIFO (first in - first out)
 * @author KIRILL GAVRILOV
 * @version 1.0
 */
    public class PriorityQueue {
         /**
             * Хранение задания осуществляется в коллекции типа LinkedList
          */
        private LinkedList<Task> tasks = new LinkedList<>();

        /**
         *   Метод принимает на вход заявку и добавляет ее в очередь.
         *   Если встречаются 2 задания с одинаковым приоритетом, то в очереди
         *   они распределяются по принципу FIFO.
         *   @param task задача которая добавляется в очередь
         */

        public void put(Task task) {
            var index = 0;
                for (var element : tasks) {
                    if (task.getPriority() < element.getPriority()) {
                        break;
                    }
                    index++;
            }
            this.tasks.add(index, task);
        }

             /**
                 * Метод позволяет получить первую задачу в очереди
                * @return возвращает задачу из головы очереди или null если очередь пуста
              */
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
