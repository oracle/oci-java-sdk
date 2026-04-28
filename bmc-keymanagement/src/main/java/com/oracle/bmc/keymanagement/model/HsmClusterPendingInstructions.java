/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Pending instructions for audit logging setup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HsmClusterPendingInstructions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HsmClusterPendingInstructions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"createDynamicGroup", "addBucketPolicy"})
    public HsmClusterPendingInstructions(
            HsmClusterPendingCreateDynamicGroup createDynamicGroup, String addBucketPolicy) {
        super();
        this.createDynamicGroup = createDynamicGroup;
        this.addBucketPolicy = addBucketPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("createDynamicGroup")
        private HsmClusterPendingCreateDynamicGroup createDynamicGroup;

        public Builder createDynamicGroup(HsmClusterPendingCreateDynamicGroup createDynamicGroup) {
            this.createDynamicGroup = createDynamicGroup;
            this.__explicitlySet__.add("createDynamicGroup");
            return this;
        }
        /** Policy for the user to add to the log bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("addBucketPolicy")
        private String addBucketPolicy;

        /**
         * Policy for the user to add to the log bucket.
         *
         * @param addBucketPolicy the value to set
         * @return this builder
         */
        public Builder addBucketPolicy(String addBucketPolicy) {
            this.addBucketPolicy = addBucketPolicy;
            this.__explicitlySet__.add("addBucketPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HsmClusterPendingInstructions build() {
            HsmClusterPendingInstructions model =
                    new HsmClusterPendingInstructions(
                            this.createDynamicGroup, this.addBucketPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HsmClusterPendingInstructions model) {
            if (model.wasPropertyExplicitlySet("createDynamicGroup")) {
                this.createDynamicGroup(model.getCreateDynamicGroup());
            }
            if (model.wasPropertyExplicitlySet("addBucketPolicy")) {
                this.addBucketPolicy(model.getAddBucketPolicy());
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

    @com.fasterxml.jackson.annotation.JsonProperty("createDynamicGroup")
    private final HsmClusterPendingCreateDynamicGroup createDynamicGroup;

    public HsmClusterPendingCreateDynamicGroup getCreateDynamicGroup() {
        return createDynamicGroup;
    }

    /** Policy for the user to add to the log bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("addBucketPolicy")
    private final String addBucketPolicy;

    /**
     * Policy for the user to add to the log bucket.
     *
     * @return the value
     */
    public String getAddBucketPolicy() {
        return addBucketPolicy;
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
        sb.append("HsmClusterPendingInstructions(");
        sb.append("super=").append(super.toString());
        sb.append("createDynamicGroup=").append(String.valueOf(this.createDynamicGroup));
        sb.append(", addBucketPolicy=").append(String.valueOf(this.addBucketPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HsmClusterPendingInstructions)) {
            return false;
        }

        HsmClusterPendingInstructions other = (HsmClusterPendingInstructions) o;
        return java.util.Objects.equals(this.createDynamicGroup, other.createDynamicGroup)
                && java.util.Objects.equals(this.addBucketPolicy, other.addBucketPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.createDynamicGroup == null
                                ? 43
                                : this.createDynamicGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.addBucketPolicy == null ? 43 : this.addBucketPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
