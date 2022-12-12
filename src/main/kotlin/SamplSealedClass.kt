sealed class Master {
    class HeadMaster(val name: String) : Master()
    class ViceHeadMaster(val name: String) : Master()
    class BranchHead(val name: String) : Master()
    class ClassLead(val name: String) : Master()
}

fun sampleCheck(master: Master) {
    when (master) {
        is Master.HeadMaster -> {
            println(master.name)
        }

        is Master.ViceHeadMaster -> {
            println(master.name)
        }

        is Master.BranchHead -> {
            println(master.name)
        }

        is Master.ClassLead -> {
            println(master.name)
        }
    }
}