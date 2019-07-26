/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for a CosmosDB (MongoDB API) database.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CosmosDbMongoDbApiSource")
public class CosmosDbMongoDbApiSource extends CopySource {
    /**
     * Specifies selection filter using query operators. To return all
     * documents in a collection, omit this parameter or pass an empty document
     * ({}). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "filter")
    private Object filter;

    /**
     * Cursor methods for Mongodb query.
     */
    @JsonProperty(value = "cursorMethods")
    private MongoDbCursorMethodsProperties cursorMethods;

    /**
     * Specifies the number of documents to return in each batch of the
     * response from MongoDB instance. In most cases, modifying the batch size
     * will not affect the user or the application. This property's main
     * purpose is to avoid hit the limitation of response size. Type: integer
     * (or Expression with resultType integer).
     */
    @JsonProperty(value = "batchSize")
    private Object batchSize;

    /**
     * Get specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     *
     * @return the filter value
     */
    public Object filter() {
        return this.filter;
    }

    /**
     * Set specifies selection filter using query operators. To return all documents in a collection, omit this parameter or pass an empty document ({}). Type: string (or Expression with resultType string).
     *
     * @param filter the filter value to set
     * @return the CosmosDbMongoDbApiSource object itself.
     */
    public CosmosDbMongoDbApiSource withFilter(Object filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get cursor methods for Mongodb query.
     *
     * @return the cursorMethods value
     */
    public MongoDbCursorMethodsProperties cursorMethods() {
        return this.cursorMethods;
    }

    /**
     * Set cursor methods for Mongodb query.
     *
     * @param cursorMethods the cursorMethods value to set
     * @return the CosmosDbMongoDbApiSource object itself.
     */
    public CosmosDbMongoDbApiSource withCursorMethods(MongoDbCursorMethodsProperties cursorMethods) {
        this.cursorMethods = cursorMethods;
        return this;
    }

    /**
     * Get specifies the number of documents to return in each batch of the response from MongoDB instance. In most cases, modifying the batch size will not affect the user or the application. This property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     *
     * @return the batchSize value
     */
    public Object batchSize() {
        return this.batchSize;
    }

    /**
     * Set specifies the number of documents to return in each batch of the response from MongoDB instance. In most cases, modifying the batch size will not affect the user or the application. This property's main purpose is to avoid hit the limitation of response size. Type: integer (or Expression with resultType integer).
     *
     * @param batchSize the batchSize value to set
     * @return the CosmosDbMongoDbApiSource object itself.
     */
    public CosmosDbMongoDbApiSource withBatchSize(Object batchSize) {
        this.batchSize = batchSize;
        return this;
    }

}
