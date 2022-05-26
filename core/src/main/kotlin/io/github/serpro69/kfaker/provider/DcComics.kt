package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.DC_COMICS] category.
 */
@Suppress("unused")
class DcComics internal constructor(fakerService: FakerService) : YamlFakeDataProvider<DcComics>(fakerService) {
    override val yamlCategory = YamlCategory.DC_COMICS
    override val localUniqueDataProvider = LocalUniqueDataProvider<DcComics>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun hero() = resolve("hero")
    fun heroine() = resolve("heroine")
    fun villain() = resolve("villain")
    fun name() = resolve("name")
    fun title() = resolve("title")
}
