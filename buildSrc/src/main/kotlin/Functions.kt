import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

object Functions {
    fun generateAppVersionCode(appVersionName: String): Int {
        val appVersionArray = appVersionName.split(".")

        return appVersionArray[0].toInt() * 100000 +
                appVersionArray[1].toInt() * 1000 +
                appVersionArray[2].toInt() * 10
    }
}