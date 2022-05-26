package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.HEY_ARNOLD] category.
 */
@Suppress("unused")
class HeyArnold internal constructor(fakerService: FakerService) : YamlFakeDataProvider<HeyArnold>(fakerService) {
    override val yamlCategory = YamlCategory.HEY_ARNOLD
    override val localUniqueDataProvider = LocalUniqueDataProvider<HeyArnold>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun characters() = resolve("characters")
    fun locations() = resolve("locations")
    fun quotes() = resolve("quotes")
}
