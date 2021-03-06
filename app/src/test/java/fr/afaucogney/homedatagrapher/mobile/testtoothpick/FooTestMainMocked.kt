package fr.afaucogney.homedatagrapher.mobile.testtoothpick

import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.argWhere
import com.nhaarman.mockitokotlin2.verify
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import toothpick.testing.ToothPickRule
import javax.inject.Inject

/**
 * Created by afaucogney on 31/01/2018.
 */
@RunWith(MockitoJUnitRunner::class)
open class FooTestMainMocked {


    var toothPickRule = ToothPickRule(this)
        @Rule get

    @Mock
    lateinit var mockedApplication: ToothFortApp

    @Inject
    lateinit var sutFoo: Foo

    @Mock
    lateinit var mMockable: Mockable

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        toothPickRule.setScopeName(mockedApplication)
        toothPickRule.inject(this)
    }

    @Test
    fun prout() {

        Mockito.`when`(mMockable.prout(any())).then { println("MOCKABLE ==> 42") }

        sutFoo.prout("1")

        verify(mMockable).prout(argWhere { it == 1 })
    }

}