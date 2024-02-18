package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.MEASUREMENT] category.
 */
@Suppress("unused")
class Measurement internal constructor(fakerService: FakerService) : YamlFakeDataProvider<Measurement>(fakerService) {
    override val yamlCategory = YamlCategory.MEASUREMENT
    override val localUniqueDataProvider = LocalUniqueDataProvider<Measurement>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider, fakerService)

    init {
        fakerService.load(yamlCategory)
    }

    fun height() = resolve("height")
    fun length() = resolve("length")
    fun volume() = resolve("volume")
    fun weight() = resolve("weight")
    fun metricHeight() = resolve("metric_height")
    fun metricLength() = resolve("metric_length")
    fun metricVolume() = resolve("metric_volume")
    fun metricWeight() = resolve("metric_weight")
}
