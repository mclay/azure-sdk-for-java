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

/**
 * Azure Data Explorer command activity.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataExplorerCommand")
@JsonFlatten
public class AzureDataExplorerCommandActivity extends ExecutionActivity {
    /**
     * A control command, according to the Azure Data Explorer command syntax.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.command", required = true)
    private Object command;

    /**
     * Control command timeout. Type: string (or Expression with resultType
     * string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..).
     */
    @JsonProperty(value = "typeProperties.commandTimeout")
    private Object commandTimeout;

    /**
     * Get a control command, according to the Azure Data Explorer command syntax. Type: string (or Expression with resultType string).
     *
     * @return the command value
     */
    public Object command() {
        return this.command;
    }

    /**
     * Set a control command, according to the Azure Data Explorer command syntax. Type: string (or Expression with resultType string).
     *
     * @param command the command value to set
     * @return the AzureDataExplorerCommandActivity object itself.
     */
    public AzureDataExplorerCommandActivity withCommand(Object command) {
        this.command = command;
        return this;
    }

    /**
     * Get control command timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..).
     *
     * @return the commandTimeout value
     */
    public Object commandTimeout() {
        return this.commandTimeout;
    }

    /**
     * Set control command timeout. Type: string (or Expression with resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..).
     *
     * @param commandTimeout the commandTimeout value to set
     * @return the AzureDataExplorerCommandActivity object itself.
     */
    public AzureDataExplorerCommandActivity withCommandTimeout(Object commandTimeout) {
        this.commandTimeout = commandTimeout;
        return this;
    }

}
