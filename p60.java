import java.util.*;

class Job {
    char id;
    int deadline;
    int profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class p60 {
    public static void printJobSequence(Job[] jobs) {
        int n = jobs.length;

        // Sort the jobs in descending order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Find the maximum deadline to determine the size of the schedule array
        int maxDeadline = Integer.MIN_VALUE;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Initialize the schedule array with -1 to indicate empty slots
        char[] schedule = new char[maxDeadline];
        Arrays.fill(schedule, '-');

        // Fill the schedule array with the selected jobs
        for (Job job : jobs) {
            // Find the earliest available slot before the job's deadline
            int slot = job.deadline - 1;
            while (slot >= 0 && schedule[slot] != '-') {
                slot--;
            }

            // If a slot is available, assign the job to that slot
            if (slot >= 0) {
                schedule[slot] = job.id;
            }
        }

        // Print the job sequence
        System.out.println("Job Sequence:");
        for (char job : schedule) {
            System.out.print(job + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job('A', 2, 100),
            new Job('B', 1, 50),
            new Job('C', 2, 10),
            new Job('D', 1, 20),
            new Job('E', 3, 30)
        };

        printJobSequence(jobs);
    }
}
