/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Details for configuring tenancy-level agent AutoUpgradable configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SetAutoUpgradableConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SetAutoUpgradableConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "isAgentAutoUpgradable"})
    public SetAutoUpgradableConfigDetails(String compartmentId, Boolean isAgentAutoUpgradable) {
        super();
        this.compartmentId = compartmentId;
        this.isAgentAutoUpgradable = isAgentAutoUpgradable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Tenancy identifier i.e, Root compartment identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy identifier i.e, Root compartment identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * true if the agents can be upgraded automatically; false if they must be upgraded
         * manually.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoUpgradable")
        private Boolean isAgentAutoUpgradable;

        /**
         * true if the agents can be upgraded automatically; false if they must be upgraded
         * manually.
         *
         * @param isAgentAutoUpgradable the value to set
         * @return this builder
         */
        public Builder isAgentAutoUpgradable(Boolean isAgentAutoUpgradable) {
            this.isAgentAutoUpgradable = isAgentAutoUpgradable;
            this.__explicitlySet__.add("isAgentAutoUpgradable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SetAutoUpgradableConfigDetails build() {
            SetAutoUpgradableConfigDetails model =
                    new SetAutoUpgradableConfigDetails(
                            this.compartmentId, this.isAgentAutoUpgradable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SetAutoUpgradableConfigDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isAgentAutoUpgradable")) {
                this.isAgentAutoUpgradable(model.getIsAgentAutoUpgradable());
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

    /** Tenancy identifier i.e, Root compartment identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy identifier i.e, Root compartment identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * true if the agents can be upgraded automatically; false if they must be upgraded manually.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAgentAutoUpgradable")
    private final Boolean isAgentAutoUpgradable;

    /**
     * true if the agents can be upgraded automatically; false if they must be upgraded manually.
     *
     * @return the value
     */
    public Boolean getIsAgentAutoUpgradable() {
        return isAgentAutoUpgradable;
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
        sb.append("SetAutoUpgradableConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isAgentAutoUpgradable=").append(String.valueOf(this.isAgentAutoUpgradable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SetAutoUpgradableConfigDetails)) {
            return false;
        }

        SetAutoUpgradableConfigDetails other = (SetAutoUpgradableConfigDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isAgentAutoUpgradable, other.isAgentAutoUpgradable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAgentAutoUpgradable == null
                                ? 43
                                : this.isAgentAutoUpgradable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
