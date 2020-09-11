// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AsyncStatus. */
public final class AsyncStatus extends ExpandableStringEnum<AsyncStatus> {
    /** Static value Started for AsyncStatus. */
    public static final AsyncStatus STARTED = fromString("Started");

    /** Static value Completed for AsyncStatus. */
    public static final AsyncStatus COMPLETED = fromString("Completed");

    /** Static value Failed for AsyncStatus. */
    public static final AsyncStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a AsyncStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AsyncStatus.
     */
    @JsonCreator
    public static AsyncStatus fromString(String name) {
        return fromString(name, AsyncStatus.class);
    }

    /** @return known AsyncStatus values. */
    public static Collection<AsyncStatus> values() {
        return values(AsyncStatus.class);
    }
}