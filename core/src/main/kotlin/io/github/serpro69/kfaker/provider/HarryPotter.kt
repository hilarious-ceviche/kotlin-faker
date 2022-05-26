package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.HARRY_POTTER] category.
 */
@Suppress("unused")
class HarryPotter internal constructor(fakerService: FakerService) : YamlFakeDataProvider<HarryPotter>(fakerService) {
    override val yamlCategory = YamlCategory.HARRY_POTTER
    override val localUniqueDataProvider = LocalUniqueDataProvider<HarryPotter>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun characters() = resolve("characters")
    fun locations() = resolve("locations")
    fun quotes() = resolve("quotes")
    fun books() = resolve("books")
    fun houses() = resolve("houses")
    fun spells() = resolve("spells")
}
