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
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Common Data Service for Apps linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("CommonDataServiceForApps")
@JsonFlatten
public class CommonDataServiceForAppsLinkedService extends LinkedServiceInner {
    /**
     * The deployment type of the Common Data Service for Apps instance.
     * 'Online' for Common Data Service for Apps Online and 'OnPremisesWithIfd'
     * for Common Data Service for Apps on-premises with Ifd. Type: string (or
     * Expression with resultType string). Possible values include: 'Online',
     * 'OnPremisesWithIfd'.
     */
    @JsonProperty(value = "typeProperties.deploymentType", required = true)
    private DynamicsDeploymentType deploymentType;

    /**
     * The host name of the on-premises Common Data Service for Apps server.
     * The property is required for on-prem and not allowed for online. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.hostName")
    private Object hostName;

    /**
     * The port of on-premises Common Data Service for Apps server. The
     * property is required for on-prem and not allowed for online. Default is
     * 443. Type: integer (or Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /**
     * The URL to the Microsoft Common Data Service for Apps server. The
     * property is required for on-line and not allowed for on-prem. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.serviceUri")
    private Object serviceUri;

    /**
     * The organization name of the Common Data Service for Apps instance. The
     * property is required for on-prem and required for online when there are
     * more than one Common Data Service for Apps instances associated with the
     * user. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.organizationName")
    private Object organizationName;

    /**
     * The authentication type to connect to Common Data Service for Apps
     * server. 'Office365' for online scenario, 'Ifd' for on-premises with Ifd
     * scenario. Type: string (or Expression with resultType string). Possible
     * values include: 'Office365', 'Ifd'.
     */
    @JsonProperty(value = "typeProperties.authenticationType", required = true)
    private DynamicsAuthenticationType authenticationType;

    /**
     * User name to access the Common Data Service for Apps instance. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.username", required = true)
    private Object username;

    /**
     * Password to access the Common Data Service for Apps instance.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the deployment type of the Common Data Service for Apps instance. 'Online' for Common Data Service for Apps Online and 'OnPremisesWithIfd' for Common Data Service for Apps on-premises with Ifd. Type: string (or Expression with resultType string). Possible values include: 'Online', 'OnPremisesWithIfd'.
     *
     * @return the deploymentType value
     */
    public DynamicsDeploymentType deploymentType() {
        return this.deploymentType;
    }

    /**
     * Set the deployment type of the Common Data Service for Apps instance. 'Online' for Common Data Service for Apps Online and 'OnPremisesWithIfd' for Common Data Service for Apps on-premises with Ifd. Type: string (or Expression with resultType string). Possible values include: 'Online', 'OnPremisesWithIfd'.
     *
     * @param deploymentType the deploymentType value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withDeploymentType(DynamicsDeploymentType deploymentType) {
        this.deploymentType = deploymentType;
        return this;
    }

    /**
     * Get the host name of the on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @return the hostName value
     */
    public Object hostName() {
        return this.hostName;
    }

    /**
     * Set the host name of the on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Type: string (or Expression with resultType string).
     *
     * @param hostName the hostName value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withHostName(Object hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * Get the port of on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port of on-premises Common Data Service for Apps server. The property is required for on-prem and not allowed for online. Default is 443. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the URL to the Microsoft Common Data Service for Apps server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @return the serviceUri value
     */
    public Object serviceUri() {
        return this.serviceUri;
    }

    /**
     * Set the URL to the Microsoft Common Data Service for Apps server. The property is required for on-line and not allowed for on-prem. Type: string (or Expression with resultType string).
     *
     * @param serviceUri the serviceUri value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withServiceUri(Object serviceUri) {
        this.serviceUri = serviceUri;
        return this;
    }

    /**
     * Get the organization name of the Common Data Service for Apps instance. The property is required for on-prem and required for online when there are more than one Common Data Service for Apps instances associated with the user. Type: string (or Expression with resultType string).
     *
     * @return the organizationName value
     */
    public Object organizationName() {
        return this.organizationName;
    }

    /**
     * Set the organization name of the Common Data Service for Apps instance. The property is required for on-prem and required for online when there are more than one Common Data Service for Apps instances associated with the user. Type: string (or Expression with resultType string).
     *
     * @param organizationName the organizationName value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withOrganizationName(Object organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the authentication type to connect to Common Data Service for Apps server. 'Office365' for online scenario, 'Ifd' for on-premises with Ifd scenario. Type: string (or Expression with resultType string). Possible values include: 'Office365', 'Ifd'.
     *
     * @return the authenticationType value
     */
    public DynamicsAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authentication type to connect to Common Data Service for Apps server. 'Office365' for online scenario, 'Ifd' for on-premises with Ifd scenario. Type: string (or Expression with resultType string). Possible values include: 'Office365', 'Ifd'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withAuthenticationType(DynamicsAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get user name to access the Common Data Service for Apps instance. Type: string (or Expression with resultType string).
     *
     * @return the username value
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set user name to access the Common Data Service for Apps instance. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get password to access the Common Data Service for Apps instance.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password to access the Common Data Service for Apps instance.
     *
     * @param password the password value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the CommonDataServiceForAppsLinkedService object itself.
     */
    public CommonDataServiceForAppsLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
