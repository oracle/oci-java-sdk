/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Input payload to upgrade the blockchain platform.
 *
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
    builder = UpgradeBlockchainPlatformDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpgradeBlockchainPlatformDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"patchId"})
    public UpgradeBlockchainPlatformDetails(String patchId) {
        super();
        this.patchId = patchId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The patch ID corresponding to the version to which platform will be upgraded.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        /**
         * The patch ID corresponding to the version to which platform will be upgraded.
         *
         * @param patchId the value to set
         * @return this builder
         **/
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeBlockchainPlatformDetails build() {
            UpgradeBlockchainPlatformDetails model =
                    new UpgradeBlockchainPlatformDetails(this.patchId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeBlockchainPlatformDetails model) {
            if (model.wasPropertyExplicitlySet("patchId")) {
                this.patchId(model.getPatchId());
            }
            return this;
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
     * The patch ID corresponding to the version to which platform will be upgraded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    /**
     * The patch ID corresponding to the version to which platform will be upgraded.
     *
     * @return the value
     **/
    public String getPatchId() {
        return patchId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpgradeBlockchainPlatformDetails(");
        sb.append("super=").append(super.toString());
        sb.append("patchId=").append(String.valueOf(this.patchId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeBlockchainPlatformDetails)) {
            return false;
        }

        UpgradeBlockchainPlatformDetails other = (UpgradeBlockchainPlatformDetails) o;
        return java.util.Objects.equals(this.patchId, other.patchId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.patchId == null ? 43 : this.patchId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
