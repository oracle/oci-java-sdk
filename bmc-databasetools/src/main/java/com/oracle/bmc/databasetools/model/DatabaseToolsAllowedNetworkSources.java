/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Allow to restrict access to only requests that come from the specified public or virtual source IP addresses.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseToolsAllowedNetworkSources.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseToolsAllowedNetworkSources {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("publicSourceList")
        private java.util.List<String> publicSourceList;

        public Builder publicSourceList(java.util.List<String> publicSourceList) {
            this.publicSourceList = publicSourceList;
            this.__explicitlySet__.add("publicSourceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("virtualSourceList")
        private java.util.List<DatabaseToolsVirtualSource> virtualSourceList;

        public Builder virtualSourceList(
                java.util.List<DatabaseToolsVirtualSource> virtualSourceList) {
            this.virtualSourceList = virtualSourceList;
            this.__explicitlySet__.add("virtualSourceList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsAllowedNetworkSources build() {
            DatabaseToolsAllowedNetworkSources __instance__ =
                    new DatabaseToolsAllowedNetworkSources(publicSourceList, virtualSourceList);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsAllowedNetworkSources o) {
            Builder copiedBuilder =
                    publicSourceList(o.getPublicSourceList())
                            .virtualSourceList(o.getVirtualSourceList());

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
     * A list of allowed public IPs and CIDR blocks.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicSourceList")
    java.util.List<String> publicSourceList;

    /**
     * A list of allowed VCN [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) and IP ranges pairs.
     * Example:{@code "vcnId": "ocid1.vcn.oc1.iad.aaaaaaaaexampleuniqueID", "ipRanges": [ "129.213.39.0/24" ]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualSourceList")
    java.util.List<DatabaseToolsVirtualSource> virtualSourceList;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
