/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * A resource that is created or operated on by an asynchronous operation that is
 * tracked by a work request.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class WorkRequestResource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionTypes actionType;

        public Builder actionType(ActionTypes actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
        private String entityUri;

        public Builder entityUri(String entityUri) {
            this.entityUri = entityUri;
            this.__explicitlySet__.add("entityUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestResource build() {
            WorkRequestResource __instance__ =
                    new WorkRequestResource(entityType, actionType, identifier, entityUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestResource o) {
            Builder copiedBuilder =
                    entityType(o.getEntityType())
                            .actionType(o.getActionType())
                            .identifier(o.getIdentifier())
                            .entityUri(o.getEntityUri());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The resource type the work request affects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    String entityType;

    /**
     * The way in which this resource was affected by the operation that spawned the
     * work request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    ActionTypes actionType;

    /**
     * An [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) or other unique identifier
     * for the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    /**
     * The URI path that you can use for a GET request to access the resource metadata.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
    String entityUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
