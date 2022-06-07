/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Patch Details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BlockchainPlatformPatchSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BlockchainPlatformPatchSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "serviceVersion", "patchInfoUrl", "timePatchDue"})
    public BlockchainPlatformPatchSummary(
            String id, String serviceVersion, String patchInfoUrl, java.util.Date timePatchDue) {
        super();
        this.id = id;
        this.serviceVersion = serviceVersion;
        this.patchInfoUrl = patchInfoUrl;
        this.timePatchDue = timePatchDue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceVersion")
        private String serviceVersion;

        public Builder serviceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            this.__explicitlySet__.add("serviceVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchInfoUrl")
        private String patchInfoUrl;

        public Builder patchInfoUrl(String patchInfoUrl) {
            this.patchInfoUrl = patchInfoUrl;
            this.__explicitlySet__.add("patchInfoUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePatchDue")
        private java.util.Date timePatchDue;

        public Builder timePatchDue(java.util.Date timePatchDue) {
            this.timePatchDue = timePatchDue;
            this.__explicitlySet__.add("timePatchDue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockchainPlatformPatchSummary build() {
            BlockchainPlatformPatchSummary __instance__ =
                    new BlockchainPlatformPatchSummary(
                            id, serviceVersion, patchInfoUrl, timePatchDue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockchainPlatformPatchSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .serviceVersion(o.getServiceVersion())
                            .patchInfoUrl(o.getPatchInfoUrl())
                            .timePatchDue(o.getTimePatchDue());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * patch id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * patch service version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceVersion")
    private final String serviceVersion;

    public String getServiceVersion() {
        return serviceVersion;
    }

    /**
     * A URL for the patch specific documentation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchInfoUrl")
    private final String patchInfoUrl;

    public String getPatchInfoUrl() {
        return patchInfoUrl;
    }

    /**
     * patch due date for customer initiated patching
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePatchDue")
    private final java.util.Date timePatchDue;

    public java.util.Date getTimePatchDue() {
        return timePatchDue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BlockchainPlatformPatchSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", serviceVersion=").append(String.valueOf(this.serviceVersion));
        sb.append(", patchInfoUrl=").append(String.valueOf(this.patchInfoUrl));
        sb.append(", timePatchDue=").append(String.valueOf(this.timePatchDue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlockchainPlatformPatchSummary)) {
            return false;
        }

        BlockchainPlatformPatchSummary other = (BlockchainPlatformPatchSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.serviceVersion, other.serviceVersion)
                && java.util.Objects.equals(this.patchInfoUrl, other.patchInfoUrl)
                && java.util.Objects.equals(this.timePatchDue, other.timePatchDue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceVersion == null ? 43 : this.serviceVersion.hashCode());
        result = (result * PRIME) + (this.patchInfoUrl == null ? 43 : this.patchInfoUrl.hashCode());
        result = (result * PRIME) + (this.timePatchDue == null ? 43 : this.timePatchDue.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
