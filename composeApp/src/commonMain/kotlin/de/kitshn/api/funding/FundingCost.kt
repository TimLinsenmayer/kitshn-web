package de.kitshn.api.funding

import kotlinx.serialization.Serializable

@Serializable
data class FundingCost(
    val type: String,
    val source: String,
    val label: String,
    val amount: Double,
    val currency: String
)