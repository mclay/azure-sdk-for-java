// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeviceConnectionStateEventProperties model. */
@Fluent
public class DeviceConnectionStateEventProperties {
    /*
     * The unique identifier of the device. This case-sensitive string can be
     * up to 128 characters long, and supports ASCII 7-bit alphanumeric
     * characters plus the following special characters: - : . + % _ &#35; * ?
     * ! ( ) , = @ ; $ '.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /*
     * The unique identifier of the module. This case-sensitive string can be
     * up to 128 characters long, and supports ASCII 7-bit alphanumeric
     * characters plus the following special characters: - : . + % _ &#35; * ?
     * ! ( ) , = @ ; $ '.
     */
    @JsonProperty(value = "moduleId")
    private String moduleId;

    /*
     * Name of the IoT Hub where the device was created or deleted.
     */
    @JsonProperty(value = "hubName")
    private String hubName;

    /*
     * Information about the device connection state event.
     */
    @JsonProperty(value = "deviceConnectionStateEventInfo")
    private DeviceConnectionStateEventInfo deviceConnectionStateEventInfo;

    /**
     * Get the deviceId property: The unique identifier of the device. This case-sensitive string can be up to 128
     * characters long, and supports ASCII 7-bit alphanumeric characters plus the following special characters: - : . +
     * % _ &amp;#35; * ? ! ( ) , = @ ; $ '.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: The unique identifier of the device. This case-sensitive string can be up to 128
     * characters long, and supports ASCII 7-bit alphanumeric characters plus the following special characters: - : . +
     * % _ &amp;#35; * ? ! ( ) , = @ ; $ '.
     *
     * @param deviceId the deviceId value to set.
     * @return the DeviceConnectionStateEventProperties object itself.
     */
    public DeviceConnectionStateEventProperties setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the moduleId property: The unique identifier of the module. This case-sensitive string can be up to 128
     * characters long, and supports ASCII 7-bit alphanumeric characters plus the following special characters: - : . +
     * % _ &amp;#35; * ? ! ( ) , = @ ; $ '.
     *
     * @return the moduleId value.
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * Set the moduleId property: The unique identifier of the module. This case-sensitive string can be up to 128
     * characters long, and supports ASCII 7-bit alphanumeric characters plus the following special characters: - : . +
     * % _ &amp;#35; * ? ! ( ) , = @ ; $ '.
     *
     * @param moduleId the moduleId value to set.
     * @return the DeviceConnectionStateEventProperties object itself.
     */
    public DeviceConnectionStateEventProperties setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }

    /**
     * Get the hubName property: Name of the IoT Hub where the device was created or deleted.
     *
     * @return the hubName value.
     */
    public String getHubName() {
        return this.hubName;
    }

    /**
     * Set the hubName property: Name of the IoT Hub where the device was created or deleted.
     *
     * @param hubName the hubName value to set.
     * @return the DeviceConnectionStateEventProperties object itself.
     */
    public DeviceConnectionStateEventProperties setHubName(String hubName) {
        this.hubName = hubName;
        return this;
    }

    /**
     * Get the deviceConnectionStateEventInfo property: Information about the device connection state event.
     *
     * @return the deviceConnectionStateEventInfo value.
     */
    public DeviceConnectionStateEventInfo getDeviceConnectionStateEventInfo() {
        return this.deviceConnectionStateEventInfo;
    }

    /**
     * Set the deviceConnectionStateEventInfo property: Information about the device connection state event.
     *
     * @param deviceConnectionStateEventInfo the deviceConnectionStateEventInfo value to set.
     * @return the DeviceConnectionStateEventProperties object itself.
     */
    public DeviceConnectionStateEventProperties setDeviceConnectionStateEventInfo(
            DeviceConnectionStateEventInfo deviceConnectionStateEventInfo) {
        this.deviceConnectionStateEventInfo = deviceConnectionStateEventInfo;
        return this;
    }
}