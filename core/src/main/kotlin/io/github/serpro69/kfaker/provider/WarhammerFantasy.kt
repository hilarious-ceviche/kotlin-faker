package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.GAMES] category.
 */
@Suppress("unused")
class WarhammerFantasy internal constructor(fakerService: FakerService) : YamlFakeDataProvider<WarhammerFantasy>(fakerService) {
    override val yamlCategory = YamlCategory.GAMES
    override val secondaryCategory: Category = Category.ofName("WARHAMMER_FANTASY")
    override val localUniqueDataProvider = LocalUniqueDataProvider<WarhammerFantasy>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory, secondaryCategory)
    }

    fun heroes() = resolve(secondaryCategory, "heros") // key typo in the yml file
    fun quotes() = resolve(secondaryCategory, "quotes")
    fun locations() = resolve(secondaryCategory, "locations")
    fun factions() = resolve(secondaryCategory, "factions")
    fun creatures() = resolve(secondaryCategory, "creatures")
}
