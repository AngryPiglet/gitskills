import tornadofx.Stylesheet.Companion.menu
import tornadofx.View
import tornadofx.hbox
import tornadofx.menubar

class MainView : View(){
    init {
        title = "学习标题"
    }
    override val root = hbox {
        setPrefSize(500.0, 400.0)

    }

}