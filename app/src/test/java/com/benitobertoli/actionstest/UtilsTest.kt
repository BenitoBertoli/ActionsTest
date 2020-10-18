package com.benitobertoli.actionstest

import org.junit.Assert
import org.junit.Test

class UtilsTest {

    @Test
    fun `sum should return the correct sum`() {
        Assert.assertEquals(3, Utils.sum(1, 2))
    }
}