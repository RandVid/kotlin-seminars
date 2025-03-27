package org.edu.jvm.languages.tasks

import java.util.concurrent.Executors

fun asyncSend(sender: MailSender, messages: List<String>) {
    // TODO
}

// Do not change it
interface MailSender {
    fun send(message: String)
}

// The class simulates mail sending
// Do not change it
class MockMailSender : MailSender {
    override fun send(message: String) {
        println("Message $message was sent")
    }
}


fun main() {
    val messageCounts: Int = readln().toInt()
    val messages: MutableList<String> = mutableListOf<String>()
    for (i in 0 until messageCounts) {
        messages.add(readln())
    }
    val sender: MailSender = MockMailSender()
    asyncSend(sender, messages)
}

