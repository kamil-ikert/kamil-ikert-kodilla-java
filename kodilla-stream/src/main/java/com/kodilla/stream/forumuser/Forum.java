package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum(){
        theUserList.add(new ForumUser(1,"AlbertoXXX",'M', LocalDate.of(1980,1,9), 0));
        theUserList.add(new ForumUser(2,"PaulaNorman",'F', LocalDate.of(1999,2,19), 19));
        theUserList.add(new ForumUser(3,"EvelynParker",'F', LocalDate.of(2000,3,25), 0));
        theUserList.add(new ForumUser(4,"SanSebastian14",'M', LocalDate.of(1991,4,1), 2));
        theUserList.add(new ForumUser(5,"CutieXOXO",'F', LocalDate.of(2004,5,4), 1));
        theUserList.add(new ForumUser(6,"Terminator123",'M', LocalDate.of(2003,6,30), 14));
        theUserList.add(new ForumUser(7,"13ProGamer37",'M', LocalDate.of(1984,7,2), 30));
    }

    public List<ForumUser> getTheUserList() {
        return new ArrayList<>(theUserList);
    }
}
