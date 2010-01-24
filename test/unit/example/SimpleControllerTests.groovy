package example

import grails.test.ControllerUnitTestCase

class SimpleControllerTests extends ControllerUnitTestCase {
  protected void setUp() {
    super.setUp()
  }

  protected void tearDown() {
    super.tearDown()
  }

  void testSaveWithMockedCommandObjectWorks() {

    mockCommandObject(SimpleCommand)
    // binding with the command object
    def model = controller.save(new SimpleCommand(name:"Random Name"))
    assertNotNull model
    assertEquals "Random Name" , model.command.name
  }

  void testSaveWithParamsReturnsNullOnNameInCommandObject(){

    // This failes however same integration test works
    mockCommandObject(SimpleCommand)
    mockParams['name'] = 'Random Name'
    def model = controller.save()
    assertNotNull model
    assertNull "Random Name" , model.command?.name

  }
}
