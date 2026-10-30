// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "median when size=1 is the only value" {
        median(listOf(4.2f)) shouldBe (4.2f plusOrMinus tolerance)
    }

    "median when size=2 is the average of both values" {
        median(listOf(5.0f, 2.0f)) shouldBe (3.5f plusOrMinus tolerance)
    }

    "median when size=3 is the middle value after sorting" {
        median(listOf(9.0f, 1.0f, 2.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }

    "median when size=4 is the average of the middle two after sorting" {
        median(listOf(10.0f, 1.0f, 4.0f, 2.0f)) shouldBe (3.0f plusOrMinus tolerance)
    }
})










