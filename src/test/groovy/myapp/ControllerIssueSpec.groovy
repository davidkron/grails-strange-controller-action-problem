package myapp

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ControllerIssueSpec extends Specification implements ControllerUnitTest<TestController> {

    def "verify controller action call not working"() {
        when:
        request.method = 'GET'
        params['someState'] = ''
        // explicitely calling action without arguments, as this is what Grails does behind the scenes as well
        controller.something()

        then:
        def exception = thrown(IllegalArgumentException)
        exception.message == 'No enum constant myapp.utils.UIState.SomeState.'
    }

    def "this does not work"() {
        when:
        request.method = 'GET'
        params['someState'] = ''
        // explicitely calling action without arguments, as this is what Grails does behind the scenes as well
        controller.something()

        then:
        response.status == 200
    }

    def "this does work"() {
        when:
        request.method = 'GET'
        // explicitely calling action without arguments, as this is what Grails does behind the scenes as well
        controller.something()

        then:
        response.status == 200
    }
}
