package test.suite;

import model.PachetTuristic;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.PachetTuristicTest;
import test.PersoanaTests;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTests.class})
public class SuitaCompleta {
}
