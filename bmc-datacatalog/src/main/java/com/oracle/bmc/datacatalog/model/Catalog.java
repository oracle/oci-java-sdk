/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A data catalog enables you to collect, organize, find, access, understand, enrich, and activate technical, business, and operational metadata.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Catalog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Catalog {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceApiUrl")
        private String serviceApiUrl;

        public Builder serviceApiUrl(String serviceApiUrl) {
            this.serviceApiUrl = serviceApiUrl;
            this.__explicitlySet__.add("serviceApiUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceConsoleUrl")
        private String serviceConsoleUrl;

        public Builder serviceConsoleUrl(String serviceConsoleUrl) {
            this.serviceConsoleUrl = serviceConsoleUrl;
            this.__explicitlySet__.add("serviceConsoleUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfObjects")
        private Integer numberOfObjects;

        public Builder numberOfObjects(Integer numberOfObjects) {
            this.numberOfObjects = numberOfObjects;
            this.__explicitlySet__.add("numberOfObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachedCatalogPrivateEndpoints")
        private java.util.List<String> attachedCatalogPrivateEndpoints;

        public Builder attachedCatalogPrivateEndpoints(
                java.util.List<String> attachedCatalogPrivateEndpoints) {
            this.attachedCatalogPrivateEndpoints = attachedCatalogPrivateEndpoints;
            this.__explicitlySet__.add("attachedCatalogPrivateEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Catalog build() {
            Catalog __instance__ =
                    new Catalog(
                            id,
                            displayName,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            serviceApiUrl,
                            serviceConsoleUrl,
                            numberOfObjects,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags,
                            attachedCatalogPrivateEndpoints);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Catalog o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .serviceApiUrl(o.getServiceApiUrl())
                            .serviceConsoleUrl(o.getServiceConsoleUrl())
                            .numberOfObjects(o.getNumberOfObjects())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .attachedCatalogPrivateEndpoints(
                                    o.getAttachedCatalogPrivateEndpoints());

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
     * OCID of the data catalog instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Data catalog identifier, which can be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Compartment identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The time the data catalog was created. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the data catalog was updated. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The REST front endpoint URL to the data catalog instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceApiUrl")
    String serviceApiUrl;

    /**
     * The console front endpoint URL to the data catalog instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceConsoleUrl")
    String serviceConsoleUrl;

    /**
     * The number of data objects added to the data catalog.
     * Please see the data catalog documentation for further information on how this is calculated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfObjects")
    Integer numberOfObjects;

    /**
     * The current state of the data catalog resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * An message describing the current state in more detail.
     * For example, it can be used to provide actionable information for a resource in 'Failed' state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The list of private reverse connection endpoints attached to the catalog
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachedCatalogPrivateEndpoints")
    java.util.List<String> attachedCatalogPrivateEndpoints;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
