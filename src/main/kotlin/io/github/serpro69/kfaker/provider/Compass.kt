package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.COMPASS] category.
 */
@Deprecated(level = DeprecationLevel.ERROR, message = "Provider not implemented.")
class Compass internal constructor(fakerService: FakerService) : AbstractFakeDataProvider(fakerService) {
    override val categoryName = CategoryName.COMPASS

    // TODO: 3/7/2019 this needs some custom logic for the resolver function
}