package cz.covid19cz.app.ui.mydata

import arch.event.LiveEvent

sealed class ExportEvent : LiveEvent() {

    data class PleaseWait(val minutes: Int): ExportEvent()
    object Confirmation: ExportEvent()
}