package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.DND] category.
 */
@Suppress("unused")
class DnD internal constructor(fakerService: FakerService) : YamlFakeDataProvider<DnD>(fakerService) {
    override val yamlCategory = YamlCategory.DND
    override val localUniqueDataProvider = LocalUniqueDataProvider<DnD>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun alignments() = resolve("alignments")
    fun backgrounds() = resolve("backgrounds")
    fun cities() = resolve("cities")
    fun klasses() = resolve("klasses")
    fun languages() = resolve("languages")
    fun meleeWeapons() = resolve("melee_weapons")
    fun monsters() = resolve("monsters")
    fun races() = resolve("races")
    fun rangedWeapons() = resolve("ranged_weapons")
}
