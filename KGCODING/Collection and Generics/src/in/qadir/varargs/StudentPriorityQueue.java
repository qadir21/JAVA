package in.qadir.varargs;

import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue
{
    public static void main(String[] args)
    {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1)
            {
                return student.getGrade() - t1.getGrade();
            }
        });

        queue.offer(new Student("Prashant", 'B'));
        queue.offer(new Student("Sanchit", 'A'));
        queue.offer(new Student("Ajay", 'C'));
        queue.offer(new Student("Sunny", 'B'));
        queue.offer(new Student("Ninit", 'D'));

        System.out.printf("Queue is:  %s\n", queue);
        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());
        System.out.printf("%s\n", queue.poll());
    }

    private static class Student
    {
        private final String name;
        private final char grade;
        public Student(String name, char grade)
        {
            this.name = name;
            this.grade = grade;
        }

        public String getName()
        {
            return name;
        }

        @Override
        public String toString()
        {
            return "{Name='" + name + '\'' +
                    ", grade=" + grade +
                    '}';
        }

        public char getGrade() {
            return grade;
        }

    }

}