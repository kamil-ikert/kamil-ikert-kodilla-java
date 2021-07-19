package com.kodilla.testing.forum.statistics;

public class Calculate {
    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public Calculate(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if (numberOfUsers == 0) {
            averageCommentsPerUser = 0.0;
            averagePostsPerUser = 0.0;
        } else {
            averagePostsPerUser = (double) numberOfPosts / (double) numberOfUsers;
            averageCommentsPerUser = (double) numberOfComments / (double) numberOfUsers;
        }
        if (numberOfPosts == 0 ) {
            averageCommentsPerPost = 0.0;
        } else {
            averageCommentsPerPost = (double) numberOfComments / (double) numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("List of advanced details about forum");
        System.out.println("Number of Users:  " + numberOfUsers);
        System.out.println("Number of Posts:  " + numberOfPosts);
        System.out.println("Number of Comments:  " + numberOfComments);
        System.out.println("Average number of posts per user:  " + averagePostsPerUser);
        System.out.println("Average number of comments per user:  " + averageCommentsPerUser);
        System.out.println("Average number of comments per post:  " + averageCommentsPerPost);
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
