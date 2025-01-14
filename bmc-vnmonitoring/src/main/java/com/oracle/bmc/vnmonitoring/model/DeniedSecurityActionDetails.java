/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines details for the security action taken on denied traffic. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeniedSecurityActionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeniedSecurityActionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isRestrictedOrPartial",
        "evaluatedSecurityListIds",
        "evaluatedNsgIds"
    })
    public DeniedSecurityActionDetails(
            Boolean isRestrictedOrPartial,
            java.util.List<String> evaluatedSecurityListIds,
            java.util.List<String> evaluatedNsgIds) {
        super();
        this.isRestrictedOrPartial = isRestrictedOrPartial;
        this.evaluatedSecurityListIds = evaluatedSecurityListIds;
        this.evaluatedNsgIds = evaluatedNsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If true, the evaluated security list and network security group ID details are
         * incomplete.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
        private Boolean isRestrictedOrPartial;

        /**
         * If true, the evaluated security list and network security group ID details are
         * incomplete.
         *
         * @param isRestrictedOrPartial the value to set
         * @return this builder
         */
        public Builder isRestrictedOrPartial(Boolean isRestrictedOrPartial) {
            this.isRestrictedOrPartial = isRestrictedOrPartial;
            this.__explicitlySet__.add("isRestrictedOrPartial");
            return this;
        }
        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * evaluated security lists associcated with the OCI resource's subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("evaluatedSecurityListIds")
        private java.util.List<String> evaluatedSecurityListIds;

        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * evaluated security lists associcated with the OCI resource's subnet.
         *
         * @param evaluatedSecurityListIds the value to set
         * @return this builder
         */
        public Builder evaluatedSecurityListIds(java.util.List<String> evaluatedSecurityListIds) {
            this.evaluatedSecurityListIds = evaluatedSecurityListIds;
            this.__explicitlySet__.add("evaluatedSecurityListIds");
            return this;
        }
        /**
         * List of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * of evaluated network security groups associated with the OCI resource's VNIC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("evaluatedNsgIds")
        private java.util.List<String> evaluatedNsgIds;

        /**
         * List of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * of evaluated network security groups associated with the OCI resource's VNIC.
         *
         * @param evaluatedNsgIds the value to set
         * @return this builder
         */
        public Builder evaluatedNsgIds(java.util.List<String> evaluatedNsgIds) {
            this.evaluatedNsgIds = evaluatedNsgIds;
            this.__explicitlySet__.add("evaluatedNsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeniedSecurityActionDetails build() {
            DeniedSecurityActionDetails model =
                    new DeniedSecurityActionDetails(
                            this.isRestrictedOrPartial,
                            this.evaluatedSecurityListIds,
                            this.evaluatedNsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeniedSecurityActionDetails model) {
            if (model.wasPropertyExplicitlySet("isRestrictedOrPartial")) {
                this.isRestrictedOrPartial(model.getIsRestrictedOrPartial());
            }
            if (model.wasPropertyExplicitlySet("evaluatedSecurityListIds")) {
                this.evaluatedSecurityListIds(model.getEvaluatedSecurityListIds());
            }
            if (model.wasPropertyExplicitlySet("evaluatedNsgIds")) {
                this.evaluatedNsgIds(model.getEvaluatedNsgIds());
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
     * If true, the evaluated security list and network security group ID details are incomplete.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
    private final Boolean isRestrictedOrPartial;

    /**
     * If true, the evaluated security list and network security group ID details are incomplete.
     *
     * @return the value
     */
    public Boolean getIsRestrictedOrPartial() {
        return isRestrictedOrPartial;
    }

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of evaluated security lists associcated with the OCI resource's subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedSecurityListIds")
    private final java.util.List<String> evaluatedSecurityListIds;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of evaluated security lists associcated with the OCI resource's subnet.
     *
     * @return the value
     */
    public java.util.List<String> getEvaluatedSecurityListIds() {
        return evaluatedSecurityListIds;
    }

    /**
     * List of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
     * evaluated network security groups associated with the OCI resource's VNIC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedNsgIds")
    private final java.util.List<String> evaluatedNsgIds;

    /**
     * List of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
     * evaluated network security groups associated with the OCI resource's VNIC.
     *
     * @return the value
     */
    public java.util.List<String> getEvaluatedNsgIds() {
        return evaluatedNsgIds;
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
        sb.append("DeniedSecurityActionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isRestrictedOrPartial=").append(String.valueOf(this.isRestrictedOrPartial));
        sb.append(", evaluatedSecurityListIds=")
                .append(String.valueOf(this.evaluatedSecurityListIds));
        sb.append(", evaluatedNsgIds=").append(String.valueOf(this.evaluatedNsgIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeniedSecurityActionDetails)) {
            return false;
        }

        DeniedSecurityActionDetails other = (DeniedSecurityActionDetails) o;
        return java.util.Objects.equals(this.isRestrictedOrPartial, other.isRestrictedOrPartial)
                && java.util.Objects.equals(
                        this.evaluatedSecurityListIds, other.evaluatedSecurityListIds)
                && java.util.Objects.equals(this.evaluatedNsgIds, other.evaluatedNsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRestrictedOrPartial == null
                                ? 43
                                : this.isRestrictedOrPartial.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluatedSecurityListIds == null
                                ? 43
                                : this.evaluatedSecurityListIds.hashCode());
        result =
                (result * PRIME)
                        + (this.evaluatedNsgIds == null ? 43 : this.evaluatedNsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
