/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The request body when updating BDS metastore configuration.
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
    builder = UpdateBdsMetastoreConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateBdsMetastoreConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
        private String bdsApiKeyId;

        public Builder bdsApiKeyId(String bdsApiKeyId) {
            this.bdsApiKeyId = bdsApiKeyId;
            this.__explicitlySet__.add("bdsApiKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyPassphrase")
        private String bdsApiKeyPassphrase;

        public Builder bdsApiKeyPassphrase(String bdsApiKeyPassphrase) {
            this.bdsApiKeyPassphrase = bdsApiKeyPassphrase;
            this.__explicitlySet__.add("bdsApiKeyPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBdsMetastoreConfigurationDetails build() {
            UpdateBdsMetastoreConfigurationDetails __instance__ =
                    new UpdateBdsMetastoreConfigurationDetails(
                            displayName, bdsApiKeyId, bdsApiKeyPassphrase, clusterAdminPassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBdsMetastoreConfigurationDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .bdsApiKeyId(o.getBdsApiKeyId())
                            .bdsApiKeyPassphrase(o.getBdsApiKeyPassphrase())
                            .clusterAdminPassword(o.getClusterAdminPassword());

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
     * The display name of the metastore configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The ID of BDS Api Key used for Data Catalog metastore integration. Set only if metastore's type is EXTERNAL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
    String bdsApiKeyId;

    /**
     * Base-64 encoded passphrase of the BDS Api Key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyPassphrase")
    String bdsApiKeyPassphrase;

    /**
     * Base-64 encoded password for the cluster admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    String clusterAdminPassword;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
