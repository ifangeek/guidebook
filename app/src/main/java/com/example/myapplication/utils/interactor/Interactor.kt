package com.tismart.wabu.core.interactor

/**
 * Abstract class for a Interactor in terms of Clean Architecture.
 * This abstraction represents an execution unit for different use cases (this means than any use
 * case in the application should implement this contract).
 */
interface Interactor<in Params, out Type> {

    fun execute(params: Params): Type

    /***
     * Use this class for non value Params
     */
    object None

    // TODO: Add Params restriction
}