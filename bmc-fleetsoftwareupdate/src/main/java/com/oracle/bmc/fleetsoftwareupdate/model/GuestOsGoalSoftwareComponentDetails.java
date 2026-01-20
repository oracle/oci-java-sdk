/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details of goal version for 'GUEST_OS' component in an 'EXADB_STACK' type Exadata Fleet Update
 * Collection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GuestOsGoalSoftwareComponentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "componentType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GuestOsGoalSoftwareComponentDetails extends GoalSoftwareComponentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("goalVersionDetails")
        private GuestOsGoalVersionDetails goalVersionDetails;

        public Builder goalVersionDetails(GuestOsGoalVersionDetails goalVersionDetails) {
            this.goalVersionDetails = goalVersionDetails;
            this.__explicitlySet__.add("goalVersionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GuestOsGoalSoftwareComponentDetails build() {
            GuestOsGoalSoftwareComponentDetails model =
                    new GuestOsGoalSoftwareComponentDetails(this.goalVersionDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GuestOsGoalSoftwareComponentDetails model) {
            if (model.wasPropertyExplicitlySet("goalVersionDetails")) {
                this.goalVersionDetails(model.getGoalVersionDetails());
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

    @Deprecated
    public GuestOsGoalSoftwareComponentDetails(GuestOsGoalVersionDetails goalVersionDetails) {
        super();
        this.goalVersionDetails = goalVersionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("goalVersionDetails")
    private final GuestOsGoalVersionDetails goalVersionDetails;

    public GuestOsGoalVersionDetails getGoalVersionDetails() {
        return goalVersionDetails;
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
        sb.append("GuestOsGoalSoftwareComponentDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", goalVersionDetails=").append(String.valueOf(this.goalVersionDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GuestOsGoalSoftwareComponentDetails)) {
            return false;
        }

        GuestOsGoalSoftwareComponentDetails other = (GuestOsGoalSoftwareComponentDetails) o;
        return java.util.Objects.equals(this.goalVersionDetails, other.goalVersionDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.goalVersionDetails == null
                                ? 43
                                : this.goalVersionDetails.hashCode());
        return result;
    }
}
