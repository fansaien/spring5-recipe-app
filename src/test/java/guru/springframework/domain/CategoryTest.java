package guru.springframework.domain;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class CategoryTest {

  private Category category;

  @Before
  public void setUp() throws Exception {
    category = new Category();
    category.setId(1l);
    log.debug("setup finished");
  }

  @Test
  public void getId() {
    final Long idValue = 4l;
    category.setId(idValue);
    assertEquals(idValue,category.getId());
    log.debug("getID finished");
  }

  @Test
  public void getDescription() {}

  @Test
  public void getRecipes() {}
}