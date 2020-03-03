import javafx.application.Application
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import org.itheima.kotlin.game.core.Painter
import org.itheima.kotlin.game.core.Window

/**
 *
 */
class MyWindow : Window() {
    override fun onCreate() {
        println("窗体创建..")
    }

    override fun onDisplay() {
        println("测试")
        println("测试")
    }

    override fun onKeyPressed(event: KeyEvent) {
        when(event.code){
            KeyCode.ENTER -> println("点击了enter按钮")
        }
    }

    override fun onRefresh() {

    }
}

fun main(args: Array<String>){
    Application.launch(MyWindow::class.java)
}