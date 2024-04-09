package com.excelr.basics.corejava.collections.queue;

import java.util.PriorityQueue;

public class PriorityExample {
    public static void main(String[] args) {
        // Create a PriorityQueue of Task objects
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

        // Add tasks with different priorities to the priority queue
        priorityQueue.offer(new Task("Task 1", 10));
        priorityQueue.offer(new Task("Task 2", 9));
        priorityQueue.offer(new Task("Task 3", 8));
        priorityQueue.offer(new Task("Task 4", 7));
        priorityQueue.offer(new Task("Task 5", 6));
        priorityQueue.offer(new Task("Task 6", 5));
        priorityQueue.offer(new Task("Task 7", 4));
        priorityQueue.offer(new Task("Task 8", 3));
        priorityQueue.offer(new Task("Task 9", 2));
        priorityQueue.offer(new Task("Task 10", 1));

        // Process tasks in priority order
        while (!priorityQueue.isEmpty()) {
            Task task = priorityQueue.poll();
            System.out.println("Processing task: " + task.getDescription() + ", Priority: " + task.getPriority());
        }
    }
}

// Task class representing a task with description and priority
class Task implements Comparable<Task> {
    private String description;
    private int priority;

    public Task(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority tasks should come before lower priority tasks
//        return Integer.compare(other.priority, this.priority);
    	return other.priority-this.priority;
    }
}
