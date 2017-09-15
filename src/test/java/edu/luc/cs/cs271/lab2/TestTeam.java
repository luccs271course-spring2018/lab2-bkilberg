package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {
  
  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }
  
  // TODO testConstructorValidHeadcoach
  // TODO testConstructorValidFunding

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }
  
  // DONE testGetHeadcoach
  
  @Test
  public void testGetHeadcoach() {
    final String headcoach = "Klinsmann";
    final Team t = makeTeamFixture(headcoach, "Klinsmann", 500);
    assertEquals(headcoach, t.getHeadcoach());
  }
  
  // DONE testGetFunding
  
  @Test
  public void testGetHeadFunding() {
    final String funding = "500";
    final Team t = makeTeamFixture(funding, "Klinsmann", 500);
    assertEquals(funding, t.getFunding());
  }
}