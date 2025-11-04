/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines details for the security action taken on zpr denied traffic. <br>
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
        builder = ZprDeniedSecurityActionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ZprDeniedSecurityActionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isRestrictedOrPartial", "evaluatedZprPolicies"})
    public ZprDeniedSecurityActionDetails(
            Boolean isRestrictedOrPartial, java.util.List<ZprPolicy> evaluatedZprPolicies) {
        super();
        this.isRestrictedOrPartial = isRestrictedOrPartial;
        this.evaluatedZprPolicies = evaluatedZprPolicies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If true, the evaluated zpr policy ID details are incomplete. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
        private Boolean isRestrictedOrPartial;

        /**
         * If true, the evaluated zpr policy ID details are incomplete.
         *
         * @param isRestrictedOrPartial the value to set
         * @return this builder
         */
        public Builder isRestrictedOrPartial(Boolean isRestrictedOrPartial) {
            this.isRestrictedOrPartial = isRestrictedOrPartial;
            this.__explicitlySet__.add("isRestrictedOrPartial");
            return this;
        }
        /** The list of evaluated zpr policies associated with the OCI resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("evaluatedZprPolicies")
        private java.util.List<ZprPolicy> evaluatedZprPolicies;

        /**
         * The list of evaluated zpr policies associated with the OCI resource.
         *
         * @param evaluatedZprPolicies the value to set
         * @return this builder
         */
        public Builder evaluatedZprPolicies(java.util.List<ZprPolicy> evaluatedZprPolicies) {
            this.evaluatedZprPolicies = evaluatedZprPolicies;
            this.__explicitlySet__.add("evaluatedZprPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ZprDeniedSecurityActionDetails build() {
            ZprDeniedSecurityActionDetails model =
                    new ZprDeniedSecurityActionDetails(
                            this.isRestrictedOrPartial, this.evaluatedZprPolicies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZprDeniedSecurityActionDetails model) {
            if (model.wasPropertyExplicitlySet("isRestrictedOrPartial")) {
                this.isRestrictedOrPartial(model.getIsRestrictedOrPartial());
            }
            if (model.wasPropertyExplicitlySet("evaluatedZprPolicies")) {
                this.evaluatedZprPolicies(model.getEvaluatedZprPolicies());
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

    /** If true, the evaluated zpr policy ID details are incomplete. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRestrictedOrPartial")
    private final Boolean isRestrictedOrPartial;

    /**
     * If true, the evaluated zpr policy ID details are incomplete.
     *
     * @return the value
     */
    public Boolean getIsRestrictedOrPartial() {
        return isRestrictedOrPartial;
    }

    /** The list of evaluated zpr policies associated with the OCI resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("evaluatedZprPolicies")
    private final java.util.List<ZprPolicy> evaluatedZprPolicies;

    /**
     * The list of evaluated zpr policies associated with the OCI resource.
     *
     * @return the value
     */
    public java.util.List<ZprPolicy> getEvaluatedZprPolicies() {
        return evaluatedZprPolicies;
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
        sb.append("ZprDeniedSecurityActionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isRestrictedOrPartial=").append(String.valueOf(this.isRestrictedOrPartial));
        sb.append(", evaluatedZprPolicies=").append(String.valueOf(this.evaluatedZprPolicies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZprDeniedSecurityActionDetails)) {
            return false;
        }

        ZprDeniedSecurityActionDetails other = (ZprDeniedSecurityActionDetails) o;
        return java.util.Objects.equals(this.isRestrictedOrPartial, other.isRestrictedOrPartial)
                && java.util.Objects.equals(this.evaluatedZprPolicies, other.evaluatedZprPolicies)
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
                        + (this.evaluatedZprPolicies == null
                                ? 43
                                : this.evaluatedZprPolicies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
