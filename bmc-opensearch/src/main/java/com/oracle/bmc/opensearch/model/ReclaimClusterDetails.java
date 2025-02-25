/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Reclaim Clusters from de-activated customer tenant accounts
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReclaimClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReclaimClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tenantId", "isReclamationRun"})
    public ReclaimClusterDetails(String tenantId, Boolean isReclamationRun) {
        super();
        this.tenantId = tenantId;
        this.isReclamationRun = isReclamationRun;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tenant ID of the customer whose account has been de-activated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The tenant ID of the customer whose account has been de-activated
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * A boolean flag which indicates whether or not to execute the reclamation of the resulting non-deleted clusterIds in the de-activated tenant
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReclamationRun")
        private Boolean isReclamationRun;

        /**
         * A boolean flag which indicates whether or not to execute the reclamation of the resulting non-deleted clusterIds in the de-activated tenant
         * @param isReclamationRun the value to set
         * @return this builder
         **/
        public Builder isReclamationRun(Boolean isReclamationRun) {
            this.isReclamationRun = isReclamationRun;
            this.__explicitlySet__.add("isReclamationRun");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReclaimClusterDetails build() {
            ReclaimClusterDetails model =
                    new ReclaimClusterDetails(this.tenantId, this.isReclamationRun);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReclaimClusterDetails model) {
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("isReclamationRun")) {
                this.isReclamationRun(model.getIsReclamationRun());
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
     * The tenant ID of the customer whose account has been de-activated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The tenant ID of the customer whose account has been de-activated
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * A boolean flag which indicates whether or not to execute the reclamation of the resulting non-deleted clusterIds in the de-activated tenant
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReclamationRun")
    private final Boolean isReclamationRun;

    /**
     * A boolean flag which indicates whether or not to execute the reclamation of the resulting non-deleted clusterIds in the de-activated tenant
     * @return the value
     **/
    public Boolean getIsReclamationRun() {
        return isReclamationRun;
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
        sb.append("ReclaimClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", isReclamationRun=").append(String.valueOf(this.isReclamationRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReclaimClusterDetails)) {
            return false;
        }

        ReclaimClusterDetails other = (ReclaimClusterDetails) o;
        return java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.isReclamationRun, other.isReclamationRun)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.isReclamationRun == null ? 43 : this.isReclamationRun.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
