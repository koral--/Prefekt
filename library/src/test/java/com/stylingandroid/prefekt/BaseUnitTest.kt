package com.stylingandroid.prefekt

import com.stylingandroid.prefekt.internal.PrefektOwner
import kotlinx.coroutines.experimental.Unconfined
import org.amshove.kluent.When
import org.amshove.kluent.calling
import org.amshove.kluent.itReturns
import org.amshove.kluent.mock
import org.junit.jupiter.api.BeforeEach

internal open class BaseUnitTest {
    protected val owner: PrefektOwner = mock()

    @BeforeEach
    fun baseSetup() {
        When calling owner.backgroundThread() itReturns Unconfined
        When calling owner.mainThread() itReturns Unconfined
    }
}
