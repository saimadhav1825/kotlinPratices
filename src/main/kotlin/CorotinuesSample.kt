/*
private fun globalScopeSample() {
    val out = GlobalScope.launch {
        */
/*for (i in 1..10000) {
            delay(300)
            Log.d("globalScopeSample", Thread.currentThread().name)
        }*//*

        while (true) {
            delay(300)
            Log.d("globalScopeSample", Thread.currentThread().name)
        }
    }
    println(out)
}

private fun launchSample() {
    lifecycleScope.launch {
        val out1 = doNetworkOne()
        println(out1)
    }
    lifecycleScope.launch {
        val out2 = doNetworkTwo()
        println(out2)
    }
    lifecycleScope.launch {
        val out3 = doNetworkThree()
        println(out3)
    }
}


private fun asyncAwait() {
    lifecycleScope.launch {
        val out1 = lifecycleScope.async {
            doNetworkOne()
        }
        println(out1.await())
        val out2 = lifecycleScope.async {
            doNetworkTwo()
        }
        println(out2.await())
        val out3 = lifecycleScope.async {
            doNetworkThree()
        }
        println(out3.await())
    }
}

private fun runBlockingSample() {
    Log.d("runBlocking", "before runblocking")
    runBlocking {
        Log.d("runBlocking", "before runblocking check")
        delay(500)
        Log.d("runBlocking", "after runblocking check")
    }
    Log.d("runBlocking", "after runblocking ")
}

private suspend fun doNetworkOne(): String {
    delay(300)
    return "doNetworkOne"
}


private suspend fun doNetworkTwo(): String {
    delay(600)
    return "doNetworkTwo"
}

private suspend fun doNetworkThree(): String {
    delay(900)
    return "doNetworkThree"
}
*/
