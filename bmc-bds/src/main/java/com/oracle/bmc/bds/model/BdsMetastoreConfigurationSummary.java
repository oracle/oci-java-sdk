/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The summary of metastore configuration information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BdsMetastoreConfigurationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BdsMetastoreConfigurationSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("metastoreType")
        private BdsMetastoreConfiguration.MetastoreType metastoreType;

        public Builder metastoreType(BdsMetastoreConfiguration.MetastoreType metastoreType) {
            this.metastoreType = metastoreType;
            this.__explicitlySet__.add("metastoreType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
        private String bdsApiKeyId;

        public Builder bdsApiKeyId(String bdsApiKeyId) {
            this.bdsApiKeyId = bdsApiKeyId;
            this.__explicitlySet__.add("bdsApiKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private BdsMetastoreConfiguration.LifecycleState lifecycleState;

        public Builder lifecycleState(BdsMetastoreConfiguration.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsMetastoreConfigurationSummary build() {
            BdsMetastoreConfigurationSummary __instance__ =
                    new BdsMetastoreConfigurationSummary(
                            id,
                            displayName,
                            metastoreType,
                            metastoreId,
                            bdsApiKeyId,
                            lifecycleState,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsMetastoreConfigurationSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .metastoreType(o.getMetastoreType())
                            .metastoreId(o.getMetastoreId())
                            .bdsApiKeyId(o.getBdsApiKeyId())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * The ID of the metastore configuration
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The display name of metastore configuration
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The type of the metastore in the metastore configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreType")
    BdsMetastoreConfiguration.MetastoreType metastoreType;

    /**
     * The OCID of the Data Catalog metastore. Set only if metastore's type is EXTERNAL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    String metastoreId;

    /**
     * The ID of BDS API Key used for metastore configuration. Set only if metastore's type is EXTERNAL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
    String bdsApiKeyId;

    /**
     * the lifecycle state of the metastore configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    BdsMetastoreConfiguration.LifecycleState lifecycleState;

    /**
     * The time when the configuration was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time when the configuration was updated, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
