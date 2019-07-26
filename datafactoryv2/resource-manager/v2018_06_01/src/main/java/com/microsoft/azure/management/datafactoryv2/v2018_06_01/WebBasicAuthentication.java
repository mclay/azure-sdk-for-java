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
 * A WebLinkedService that uses basic authentication to communicate with an
 * HTTP endpoint.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "authenticationType")
@JsonTypeName("Basic")
public class WebBasicAuthentication extends WebLinkedServiceTypeProperties {
    /**
     * User name for Basic authentication. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "username", required = true)
    private Object username;

    /**
     * The password for Basic authentication.
     */
    @JsonProperty(value = "password", required = true)
    private SecretBase password;

    /**
     * Get user name for Basic authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set user name for Basic authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the WebBasicAuthentication object itself.
     */
    public WebBasicAuthentication withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password for Basic authentication.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password for Basic authentication.
     *
     * @param password the password value to set
     * @return the WebBasicAuthentication object itself.
     */
    public WebBasicAuthentication withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

}
