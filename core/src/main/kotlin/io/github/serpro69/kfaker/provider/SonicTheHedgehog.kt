package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.GAMES] category.
 */
@Suppress("unused")
class SonicTheHedgehog internal constructor(fakerService: FakerService) : YamlFakeDataProvider<SonicTheHedgehog>(fakerService) {
    override val yamlCategory = YamlCategory.GAMES
    override val secondaryCategory: Category = Category.ofName("SONIC_THE_HEDGEHOG")
    override val localUniqueDataProvider = LocalUniqueDataProvider<SonicTheHedgehog>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory, secondaryCategory)
    }

    fun zone() = resolve(secondaryCategory, "zone")
    fun character() = resolve(secondaryCategory, "character")
    fun game() = resolve(secondaryCategory, "game")
}
