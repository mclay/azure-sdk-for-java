/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.subscription.v2020_09_01.implementation;

import com.microsoft.azure.management.subscription.v2020_09_01.PutAliasListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class PutAliasListResultImpl extends WrapperImpl<PutAliasListResultInner> implements PutAliasListResult {
    private final SubscriptionManager manager;
    PutAliasListResultImpl(PutAliasListResultInner inner, SubscriptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SubscriptionManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<PutAliasResponseInner> value() {
        return this.inner().value();
    }

}