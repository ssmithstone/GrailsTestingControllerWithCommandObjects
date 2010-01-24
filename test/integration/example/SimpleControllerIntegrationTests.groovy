package example

class SimpleControllerIntegrationTests extends GroovyTestCase {
  protected void setUp() {
    super.setUp()
  }

  protected void tearDown() {
    super.tearDown()
  }

  void testControllerWithCommandObject() {
    SimpleController controller = new SimpleController()
    controller.params['name'] = "Stephen Smithstone"
    // This works without the command object as its an integration test
    controller.save()
  }
}
