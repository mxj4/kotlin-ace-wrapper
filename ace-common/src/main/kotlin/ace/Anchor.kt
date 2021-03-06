package ace

import ace.internal.EventEmitter
import ace.internal.EventListener

/**
 * https://ace.c9.io/#nav=api&api=anchor
 */
@JsName("ace_Anchor")
open external class Anchor(document: Document, row: Int, column: Int) : EventEmitter {

    fun detach()

    fun getDocument(): Document

    fun getPosition(): Document.Position

    fun onChange(delta: Document.Delta)

    fun setPosition(row: Int, column: Int, noClip: Boolean)

    interface Change {
        val old: Document.Position
        val value: Document.Position
    }

}