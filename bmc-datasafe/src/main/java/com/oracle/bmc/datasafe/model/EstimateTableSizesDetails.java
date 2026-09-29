/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details required to estimate table sizes for a target database using a subsetting policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EstimateTableSizesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EstimateTableSizesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetId", "targetCredentials"})
    public EstimateTableSizesDetails(String targetId, Credentials targetCredentials) {
        super();
        this.targetId = targetId;
        this.targetCredentials = targetCredentials;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the target database to use for estimating table sizes. If it's not provided,
         * the value of the targetId attribute in the SubsettingPolicy resource is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database to use for estimating table sizes. If it's not provided,
         * the value of the targetId attribute in the SubsettingPolicy resource is used.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetCredentials")
        private Credentials targetCredentials;

        public Builder targetCredentials(Credentials targetCredentials) {
            this.targetCredentials = targetCredentials;
            this.__explicitlySet__.add("targetCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimateTableSizesDetails build() {
            EstimateTableSizesDetails model =
                    new EstimateTableSizesDetails(this.targetId, this.targetCredentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimateTableSizesDetails model) {
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetCredentials")) {
                this.targetCredentials(model.getTargetCredentials());
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

    /**
     * The OCID of the target database to use for estimating table sizes. If it's not provided, the
     * value of the targetId attribute in the SubsettingPolicy resource is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database to use for estimating table sizes. If it's not provided, the
     * value of the targetId attribute in the SubsettingPolicy resource is used.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetCredentials")
    private final Credentials targetCredentials;

    public Credentials getTargetCredentials() {
        return targetCredentials;
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
        sb.append("EstimateTableSizesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetCredentials=").append(String.valueOf(this.targetCredentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimateTableSizesDetails)) {
            return false;
        }

        EstimateTableSizesDetails other = (EstimateTableSizesDetails) o;
        return java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetCredentials, other.targetCredentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetCredentials == null ? 43 : this.targetCredentials.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
