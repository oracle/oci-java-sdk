/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Patch Details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BlockchainPlatformPatchSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class BlockchainPlatformPatchSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** patch id */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * patch id
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** patch service version */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceVersion")
        private String serviceVersion;

        /**
         * patch service version
         *
         * @param serviceVersion the value to set
         * @return this builder
         */
        public Builder serviceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            this.__explicitlySet__.add("serviceVersion");
            return this;
        }
        /** A URL for the patch specific documentation */
        @com.fasterxml.jackson.annotation.JsonProperty("patchInfoUrl")
        private String patchInfoUrl;

        /**
         * A URL for the patch specific documentation
         *
         * @param patchInfoUrl the value to set
         * @return this builder
         */
        public Builder patchInfoUrl(String patchInfoUrl) {
            this.patchInfoUrl = patchInfoUrl;
            this.__explicitlySet__.add("patchInfoUrl");
            return this;
        }
        /** patch due date for customer initiated patching */
        @com.fasterxml.jackson.annotation.JsonProperty("timePatchDue")
        private java.util.Date timePatchDue;

        /**
         * patch due date for customer initiated patching
         *
         * @param timePatchDue the value to set
         * @return this builder
         */
        public Builder timePatchDue(java.util.Date timePatchDue) {
            this.timePatchDue = timePatchDue;
            this.__explicitlySet__.add("timePatchDue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlockchainPlatformPatchSummary build() {
            BlockchainPlatformPatchSummary model =
                    new BlockchainPlatformPatchSummary(
                            this.id, this.serviceVersion, this.patchInfoUrl, this.timePatchDue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockchainPlatformPatchSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("serviceVersion")) {
                this.serviceVersion(model.getServiceVersion());
            }
            if (model.wasPropertyExplicitlySet("patchInfoUrl")) {
                this.patchInfoUrl(model.getPatchInfoUrl());
            }
            if (model.wasPropertyExplicitlySet("timePatchDue")) {
                this.timePatchDue(model.getTimePatchDue());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** patch id */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * patch id
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** patch service version */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceVersion")
    private final String serviceVersion;

    /**
     * patch service version
     *
     * @return the value
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /** A URL for the patch specific documentation */
    @com.fasterxml.jackson.annotation.JsonProperty("patchInfoUrl")
    private final String patchInfoUrl;

    /**
     * A URL for the patch specific documentation
     *
     * @return the value
     */
    public String getPatchInfoUrl() {
        return patchInfoUrl;
    }

    /** patch due date for customer initiated patching */
    @com.fasterxml.jackson.annotation.JsonProperty("timePatchDue")
    private final java.util.Date timePatchDue;

    /**
     * patch due date for customer initiated patching
     *
     * @return the value
     */
    public java.util.Date getTimePatchDue() {
        return timePatchDue;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BlockchainPlatformPatchSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", serviceVersion=").append(String.valueOf(this.serviceVersion));
        sb.append(", patchInfoUrl=").append(String.valueOf(this.patchInfoUrl));
        sb.append(", timePatchDue=").append(String.valueOf(this.timePatchDue));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
