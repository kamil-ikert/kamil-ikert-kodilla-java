package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMap = forum.getTheUserList().stream()
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears()>=20)
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getNumberOfPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getIdentifier, ForumUser -> ForumUser));

        resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
