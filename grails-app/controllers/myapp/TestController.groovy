package myapp

import groovy.util.logging.Slf4j
import myapp.utils.UIState

@Slf4j // works if @Slf4j is removed
class TestController {

    // works if parameter name is changed from someState to something else
    def something(String someState) {
        render 'something'
    }

    private UIState getUIState() {
        // works if variable someState is changed to something else
        UIState.SomeState someState = UIState.SomeState.NORMAL
        return new UIState(state: someState)
    }
}
