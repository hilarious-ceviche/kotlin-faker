@file:Suppress("unused")

package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.THE_OFFICE] category.
 */
class TheOffice internal constructor(fakerService: FakerService) :
    AbstractFakeDataProvider<TheOffice>(fakerService) {
    override val category = YamlCategory.THE_OFFICE
    override val localUniqueDataProvider = LocalUniqueDataProvider<TheOffice>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun characters(): String = resolve("characters")
    fun quotes(): String = resolve("quotes")
}
