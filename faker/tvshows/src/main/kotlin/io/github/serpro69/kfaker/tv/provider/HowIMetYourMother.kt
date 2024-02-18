package io.github.serpro69.kfaker.tv.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.YamlCategory
import io.github.serpro69.kfaker.provider.FakeDataProvider
import io.github.serpro69.kfaker.provider.YamlFakeDataProvider
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.HOW_I_MET_YOUR_MOTHER] category.
 */
@Suppress("unused")
class HowIMetYourMother internal constructor(fakerService: FakerService) : YamlFakeDataProvider<HowIMetYourMother>(fakerService) {
    override val yamlCategory = YamlCategory.HOW_I_MET_YOUR_MOTHER
    override val localUniqueDataProvider = LocalUniqueDataProvider<HowIMetYourMother>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider, fakerService)

    init {
        fakerService.load(yamlCategory)
    }

    fun character() = resolve("character")
    fun catchPhrase() = resolve("catch_phrase")
    fun highFive() = resolve("high_five")
    fun quote() = resolve("quote")
}
