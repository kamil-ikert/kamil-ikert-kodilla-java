package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestStatistics {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Testing procedure has been started");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Testing procedure has been finished");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println();
        System.out.println("Phase #" + testCounter + " has started");
    }

    @AfterEach
    public void afterEveryTest() {
        System.out.println("Done");
    }

    @Nested
    @DisplayName("Calculating Test")
    class Testing {

        @Test
        void NumberOfPostTest0() {
            //When
            Statistics statisticsMock = mock(Statistics.class);
            List<String> users = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                users.add("Name no." + i);
            }
            int postsNumber = 0;
            int commentsNumber = 2000;

            Calculate calculate = new Calculate(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            calculate.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = calculate.getAverageCommentsPerPost();
            double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
            double averagePostsPerUser = calculate.getAveragePostsPerUser();
            int numberOfPosts0 = calculate.getNumberOfPosts();

            //Then

            Assertions.assertEquals(0, numberOfPosts0);
            Assertions.assertEquals(0, averageCommentsPerPost);
            Assertions.assertEquals(0, averagePostsPerUser);
            Assertions.assertEquals(2, averageCommentsPerUser);

            calculate.showStatistics();
        }

        @Test
        void NumberOfPostTest1000() {
            //When
            Statistics statisticsMock = mock(Statistics.class);
            List<String> users = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                users.add("Name no." + i);
            }
            int postsNumber = 1000;
            int commentsNumber = 2000;

            Calculate calculate = new Calculate(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            calculate.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = calculate.getAverageCommentsPerPost();
            double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
            double averagePostsPerUser = calculate.getAveragePostsPerUser();
            int numberOfPosts = calculate.getNumberOfPosts();

            //Then

            Assertions.assertEquals(1000, numberOfPosts);
            Assertions.assertEquals(2, averageCommentsPerPost);
            Assertions.assertEquals(1, averagePostsPerUser);
            Assertions.assertEquals(2, averageCommentsPerUser);

            calculate.showStatistics();
        }

        @Test
        void NumberOfCommentsTest0() {
            //When
            Statistics statisticsMock = mock(Statistics.class);
            List<String> users = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                users.add("Name no." + i);
            }
            int postsNumber = 1000;
            int commentsNumber = 0;

            Calculate calculate = new Calculate(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            calculate.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = calculate.getAverageCommentsPerPost();
            double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
            double averagePostsPerUser = calculate.getAveragePostsPerUser();
            int numberOfPosts = calculate.getNumberOfPosts();

            //Then

            Assertions.assertEquals(1000, numberOfPosts);
            Assertions.assertEquals(0, averageCommentsPerPost);
            Assertions.assertEquals(1, averagePostsPerUser);
            Assertions.assertEquals(0, averageCommentsPerUser);

            calculate.showStatistics();
        }

        @Test
        void MoreCommentsThanPostsTest() {
            //When
            Statistics statisticsMock = mock(Statistics.class);
            List<String> users = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                users.add("Name no." + i);
            }
            int postsNumber = 100;
            int commentsNumber = 500;

            Calculate calculate = new Calculate(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            calculate.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = calculate.getAverageCommentsPerPost();
            double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
            double averagePostsPerUser = calculate.getAveragePostsPerUser();
            int numberOfPosts = calculate.getNumberOfPosts();

            //Then

            Assertions.assertEquals(100, numberOfPosts);
            Assertions.assertEquals(5.0, averageCommentsPerPost);
            Assertions.assertEquals(0.1, averagePostsPerUser);
            Assertions.assertEquals(0.5, averageCommentsPerUser);

            calculate.showStatistics();
        }

        @Test
        void MorePostsThanCommentsTest() {
            //When
            Statistics statisticsMock = mock(Statistics.class);
            List<String> users = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                users.add("Name no." + i);
            }
            int postsNumber = 500;
            int commentsNumber = 100;

            Calculate calculate = new Calculate(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            calculate.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = calculate.getAverageCommentsPerPost();
            double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
            double averagePostsPerUser = calculate.getAveragePostsPerUser();
            int numberOfPosts = calculate.getNumberOfPosts();

            //Then

            Assertions.assertEquals(500, numberOfPosts);
            Assertions.assertEquals(0.2, averageCommentsPerPost);
            Assertions.assertEquals(0.5, averagePostsPerUser);
            Assertions.assertEquals(0.1, averageCommentsPerUser);

            calculate.showStatistics();
        }

        @Test
        void UserNumberIs0Test() {
            //When
            Statistics statisticsMock = mock(Statistics.class);
            List<String> users = new ArrayList<>();

            int postsNumber = 500;
            int commentsNumber = 100;

            Calculate calculate = new Calculate(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            calculate.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = calculate.getAverageCommentsPerPost();
            double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
            double averagePostsPerUser = calculate.getAveragePostsPerUser();
            int numberOfPosts = calculate.getNumberOfPosts();

            //Then

            Assertions.assertEquals(500, numberOfPosts);
            Assertions.assertEquals(0.2, averageCommentsPerPost);
            Assertions.assertEquals(0.0, averagePostsPerUser);
            Assertions.assertEquals(0.0, averageCommentsPerUser);

            calculate.showStatistics();
        }

        @Test
        void UserNumberIs100Test() {
            //When
            Statistics statisticsMock = mock(Statistics.class);
            List<String> users = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                users.add("Name no." + i);
            }
            int postsNumber = 500;
            int commentsNumber = 100;

            Calculate calculate = new Calculate(statisticsMock);
            when(statisticsMock.usersNames()).thenReturn(users);
            when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
            when(statisticsMock.postsCount()).thenReturn(postsNumber);
            calculate.calculateAdvStatistics(statisticsMock);

            //When
            double averageCommentsPerPost = calculate.getAverageCommentsPerPost();
            double averageCommentsPerUser = calculate.getAverageCommentsPerUser();
            double averagePostsPerUser = calculate.getAveragePostsPerUser();
            int numberOfPosts = calculate.getNumberOfPosts();

            //Then

            Assertions.assertEquals(500, numberOfPosts);
            Assertions.assertEquals(0.2, averageCommentsPerPost);
            Assertions.assertEquals(5.0, averagePostsPerUser);
            Assertions.assertEquals(1.0, averageCommentsPerUser);

            calculate.showStatistics();
        }
    }
}
