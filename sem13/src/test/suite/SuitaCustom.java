package test.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.PachetTuristicTest;
import test.PersoanaTests;
import test.categorii.TestEroare;
import test.categorii.TestRange;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTests.class})
@Categories.IncludeCategory(TestEroare.class)
@Categories.ExcludeCategory(TestRange.class)
public class SuitaCustom {

}
