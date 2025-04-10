package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test   
    public void equals_returns_true_same_object() {
        Team obj = team;
        assertEquals(true, team.equals(obj));
    }

    @Test
    public void equals_returns_false_different_class() {
        Object obj = new Object();
        assertEquals(false, team.equals(obj));
    }

    @Test
    public void equals_returns_true_same_fields() {
        Team other = new Team("test-team");
        assertEquals(true, team.equals(other));
    }

    @Test
    public void equals_returns_false_same_name_different_members() {
        Team other = new Team("test-team");
        other.addMember("test-member");
        assertEquals(false, team.equals(other));
    }
    
    @Test
    public void equals_returns_false_different_name_same_members() {
        Team other = new Team("test-team2");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void hashCode_returns_correct_hashCode() {
        Team other = new Team();
        int result = other.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
}
