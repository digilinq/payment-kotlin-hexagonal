package org.digilinq.payment.eft

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PaymentApp

fun main(args: Array<String>) {
    runApplication<PaymentApp>(*args)
}
