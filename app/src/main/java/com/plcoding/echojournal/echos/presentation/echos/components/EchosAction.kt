package com.plcoding.echojournal.echos.presentation.echos.components

import com.plcoding.echojournal.echos.presentation.echos.models.EchoFilterChip

sealed interface EchosAction {
    data object OnMoodChipClick: EchosAction
    data object OnTopicChipClick: EchosAction
    data object OnFabClick: EchosAction
    data object OnSettingsClick: EchosAction
    data class OnRemoveFilters(val filterType: EchoFilterChip): EchosAction
}