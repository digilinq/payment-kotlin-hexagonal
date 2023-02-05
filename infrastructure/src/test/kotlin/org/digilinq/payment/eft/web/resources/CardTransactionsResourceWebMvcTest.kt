package org.digilinq.payment.eft.web.resources

import org.digilinq.payment.eft.api.CardTransactionService
import org.digilinq.payment.eft.web.mapper.CardTransactionMapperImpl
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Import
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@WebMvcTest
@Import(CardTransactionMapperImpl::class)
class CardTransactionsResourceWebMvcTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @MockBean
    private lateinit var cardTransactionService: CardTransactionService

    @Test
    fun `should work`() {
        mockMvc.get("$BASE_URL/transactions") {
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
        }.andDo { print() }
    }

    companion object {
        const val BASE_URL = "/api/v1"
    }
}