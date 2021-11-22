package myapp.utils

import groovy.transform.Immutable

@Immutable
class UIState {

    enum SomeState { NORMAL, THING, THINGY }

    SomeState state = SomeState.NORMAL
}
