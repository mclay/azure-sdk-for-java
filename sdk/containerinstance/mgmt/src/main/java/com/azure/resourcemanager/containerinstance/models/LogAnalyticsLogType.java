// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for LogAnalyticsLogType. */
public final class LogAnalyticsLogType extends ExpandableStringEnum<LogAnalyticsLogType> {
    /** Static value ContainerInsights for LogAnalyticsLogType. */
    public static final LogAnalyticsLogType CONTAINER_INSIGHTS = fromString("ContainerInsights");

    /** Static value ContainerInstanceLogs for LogAnalyticsLogType. */
    public static final LogAnalyticsLogType CONTAINER_INSTANCE_LOGS = fromString("ContainerInstanceLogs");

    /**
     * Creates or finds a LogAnalyticsLogType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LogAnalyticsLogType.
     */
    @JsonCreator
    public static LogAnalyticsLogType fromString(String name) {
        return fromString(name, LogAnalyticsLogType.class);
    }

    /** @return known LogAnalyticsLogType values. */
    public static Collection<LogAnalyticsLogType> values() {
        return values(LogAnalyticsLogType.class);
    }
}