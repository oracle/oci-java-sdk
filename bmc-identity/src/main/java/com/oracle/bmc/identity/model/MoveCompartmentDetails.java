/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * <br>
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
        builder = MoveCompartmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MoveCompartmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetCompartmentId"})
    public MoveCompartmentDetails(String targetCompartmentId) {
        super();
        this.targetCompartmentId = targetCompartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * destination compartment into which to move the compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
        private String targetCompartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * destination compartment into which to move the compartment.
         *
         * @param targetCompartmentId the value to set
         * @return this builder
         */
        public Builder targetCompartmentId(String targetCompartmentId) {
            this.targetCompartmentId = targetCompartmentId;
            this.__explicitlySet__.add("targetCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MoveCompartmentDetails build() {
            MoveCompartmentDetails model = new MoveCompartmentDetails(this.targetCompartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MoveCompartmentDetails model) {
            if (model.wasPropertyExplicitlySet("targetCompartmentId")) {
                this.targetCompartmentId(model.getTargetCompartmentId());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * destination compartment into which to move the compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetCompartmentId")
    private final String targetCompartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * destination compartment into which to move the compartment.
     *
     * @return the value
     */
    public String getTargetCompartmentId() {
        return targetCompartmentId;
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
        sb.append("MoveCompartmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("targetCompartmentId=").append(String.valueOf(this.targetCompartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MoveCompartmentDetails)) {
            return false;
        }

        MoveCompartmentDetails other = (MoveCompartmentDetails) o;
        return java.util.Objects.equals(this.targetCompartmentId, other.targetCompartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetCompartmentId == null
                                ? 43
                                : this.targetCompartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
