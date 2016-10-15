/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network;

import java.util.Map;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.network.implementation.RouteTableInner;
import com.microsoft.azure.management.network.model.HasAssociatedSubnets;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Updatable;
import com.microsoft.azure.management.resources.fluentcore.model.Wrapper;

/**
 * Entry point for route table management.
 */
@Fluent()
public interface RouteTable extends
        GroupableResource,
        Refreshable<RouteTable>,
        Wrapper<RouteTableInner>,
        Updatable<RouteTable.Update>,
        HasAssociatedSubnets {

    /**
     * @return the routes of this route table
     */
    Map<String, Route> routes();

    /**
     * The entirety of a route table definition.
     */
    interface Definition extends
        DefinitionStages.Blank,
        DefinitionStages.WithGroup,
        DefinitionStages.WithCreate {
    }

    /**
     * Grouping of route table definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a route table definition.
         */
        interface Blank
            extends GroupableResource.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of a route table definition allowing to specify the resource group.
         */
        interface WithGroup
            extends GroupableResource.DefinitionStages.WithGroup<DefinitionStages.WithCreate> {
        }

        /**
         * The stage of the virtual network definition allowing to add subnets.
         */
        interface WithRoute {
            /**
             * Begins the definition of a new route to add to the route table.
             * <p>
             * The definition must be completed with a call to {@link Route.DefinitionStages.WithAttach#attach()}
             * @param name the name of the route
             * @return the first stage of the definition
             */
            Route.DefinitionStages.Blank<WithCreate> defineRoute(String name);
        }

        /**
         * The stage of a route table definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends
            Creatable<RouteTable>,
            Resource.DefinitionWithTags<WithCreate>,
            DefinitionStages.WithRoute {
        }
    }

    /**
     * Grouping of route table update stages.
     */
    interface UpdateStages {
    }

    /**
     * The template for a route table update operation, containing all the settings that can be modified.
     * <p>
     * Call {@link Update#apply()} to apply the changes to the resource in Azure.
     */
    interface Update extends
        Appliable<RouteTable>,
        Resource.UpdateWithTags<Update> {
    }
}
