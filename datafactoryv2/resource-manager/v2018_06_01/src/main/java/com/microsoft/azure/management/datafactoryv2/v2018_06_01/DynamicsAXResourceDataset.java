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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.DatasetInner;

/**
 * The path of the Dynamics AX OData entity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DynamicsAXResource")
@JsonFlatten
public class DynamicsAXResourceDataset extends DatasetInner {
    /**
     * The path of the Dynamics AX OData entity. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.path", required = true)
    private Object path;

    /**
     * Get the path of the Dynamics AX OData entity. Type: string (or Expression with resultType string).
     *
     * @return the path value
     */
    public Object path() {
        return this.path;
    }

    /**
     * Set the path of the Dynamics AX OData entity. Type: string (or Expression with resultType string).
     *
     * @param path the path value to set
     * @return the DynamicsAXResourceDataset object itself.
     */
    public DynamicsAXResourceDataset withPath(Object path) {
        this.path = path;
        return this;
    }

}
