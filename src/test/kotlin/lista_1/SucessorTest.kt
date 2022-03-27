package lista_1

import kotlin.test.Test
import kotlin.test.assertEquals

class SucessorTest {

    @Test
    fun testCalculaSucessor() {
        val caso1 = calculaSucessor(20)
        val caso2 = calculaSucessor(45000)
        val caso3 = calculaSucessor(-100)

        assertEquals(21, caso1)
        assertEquals(45001, caso2)
        assertEquals(-99, caso3)
    }
}