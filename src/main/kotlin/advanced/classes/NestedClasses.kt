package advanced.classes

class DirectoryExplorer(val user: String) {

    // Nested class
    class PermissionCheck {
        fun validatePermission(argUser: String) {
            // user  - no access to outer class
        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission(user)
    }

    inner class PermissionCheckInnerClass {  // Now, this class is part of the actual instance of the enclosing class
        fun validatePermission() {
            if (user != "") {
                // validation logic
            }
        }
    }

    fun listFolferInner() {
        val permissionCheckInnerClass = PermissionCheckInnerClass()
        permissionCheckInnerClass.validatePermission()
    }

}

fun main(args: Array<String>) {
    val user = "Alex"
    val de = DirectoryExplorer(user)

    val pc = DirectoryExplorer.PermissionCheck()

    val pcI = DirectoryExplorer(user).PermissionCheckInnerClass()
}