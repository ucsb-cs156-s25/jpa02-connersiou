package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Conner S.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_name() {
        assertEquals("connersiou", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("s25-13", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Conner() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Conner"), "Team should contain Conner.");
    }

    @Test
    public void getTeam_returns_team_with_Tuan() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Tuan"), "Team should contain Tuan.");
    }

    @Test
    public void getTeam_returns_team_with_Cheng() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Cheng"), "Team should contain Cheng.");
    }

    @Test
    public void getTeam_returns_team_with_Kenneth() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Kenneth"), "Team should contain Kenneth.");
    }

    @Test
    public void getTeam_returns_team_with_Nikunj() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Nikunj"), "Team should contain Nikunj.");
    }

    @Test
    public void getTeam_returns_team_with_Timothy() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Timothy"), "Team should contain Timothy.");
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
