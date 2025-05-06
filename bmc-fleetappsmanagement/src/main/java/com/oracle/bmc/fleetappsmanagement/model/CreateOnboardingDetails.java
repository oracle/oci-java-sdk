/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information about enabling onboarding. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOnboardingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOnboardingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "isFamsTagEnabled",
        "isCostTrackingTagEnabled"
    })
    public CreateOnboardingDetails(
            String compartmentId, Boolean isFamsTagEnabled, Boolean isCostTrackingTagEnabled) {
        super();
        this.compartmentId = compartmentId;
        this.isFamsTagEnabled = isFamsTagEnabled;
        this.isCostTrackingTagEnabled = isCostTrackingTagEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Tenancy OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy OCID
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
         * A value determining if the Fleet Application Management tagging is enabled or not. Allow
         * Fleet Application Management to tag resources with fleet name using
         * "Oracle$FAMS-Tags.FleetName" tag.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFamsTagEnabled")
        private Boolean isFamsTagEnabled;

        /**
         * A value determining if the Fleet Application Management tagging is enabled or not. Allow
         * Fleet Application Management to tag resources with fleet name using
         * "Oracle$FAMS-Tags.FleetName" tag.
         *
         * @param isFamsTagEnabled the value to set
         * @return this builder
         */
        public Builder isFamsTagEnabled(Boolean isFamsTagEnabled) {
            this.isFamsTagEnabled = isFamsTagEnabled;
            this.__explicitlySet__.add("isFamsTagEnabled");
            return this;
        }
        /**
         * A value determining if the cost tracking tag is enabled or not. Allow Fleet Application
         * Management to tag resources with cost tracking tag using "Oracle$FAMS-Tags.FAMSManaged"
         * tag.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCostTrackingTagEnabled")
        private Boolean isCostTrackingTagEnabled;

        /**
         * A value determining if the cost tracking tag is enabled or not. Allow Fleet Application
         * Management to tag resources with cost tracking tag using "Oracle$FAMS-Tags.FAMSManaged"
         * tag.
         *
         * @param isCostTrackingTagEnabled the value to set
         * @return this builder
         */
        public Builder isCostTrackingTagEnabled(Boolean isCostTrackingTagEnabled) {
            this.isCostTrackingTagEnabled = isCostTrackingTagEnabled;
            this.__explicitlySet__.add("isCostTrackingTagEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOnboardingDetails build() {
            CreateOnboardingDetails model =
                    new CreateOnboardingDetails(
                            this.compartmentId,
                            this.isFamsTagEnabled,
                            this.isCostTrackingTagEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOnboardingDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isFamsTagEnabled")) {
                this.isFamsTagEnabled(model.getIsFamsTagEnabled());
            }
            if (model.wasPropertyExplicitlySet("isCostTrackingTagEnabled")) {
                this.isCostTrackingTagEnabled(model.getIsCostTrackingTagEnabled());
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

    /** Tenancy OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy OCID
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A value determining if the Fleet Application Management tagging is enabled or not. Allow
     * Fleet Application Management to tag resources with fleet name using
     * "Oracle$FAMS-Tags.FleetName" tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFamsTagEnabled")
    private final Boolean isFamsTagEnabled;

    /**
     * A value determining if the Fleet Application Management tagging is enabled or not. Allow
     * Fleet Application Management to tag resources with fleet name using
     * "Oracle$FAMS-Tags.FleetName" tag.
     *
     * @return the value
     */
    public Boolean getIsFamsTagEnabled() {
        return isFamsTagEnabled;
    }

    /**
     * A value determining if the cost tracking tag is enabled or not. Allow Fleet Application
     * Management to tag resources with cost tracking tag using "Oracle$FAMS-Tags.FAMSManaged" tag.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCostTrackingTagEnabled")
    private final Boolean isCostTrackingTagEnabled;

    /**
     * A value determining if the cost tracking tag is enabled or not. Allow Fleet Application
     * Management to tag resources with cost tracking tag using "Oracle$FAMS-Tags.FAMSManaged" tag.
     *
     * @return the value
     */
    public Boolean getIsCostTrackingTagEnabled() {
        return isCostTrackingTagEnabled;
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
        sb.append("CreateOnboardingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isFamsTagEnabled=").append(String.valueOf(this.isFamsTagEnabled));
        sb.append(", isCostTrackingTagEnabled=")
                .append(String.valueOf(this.isCostTrackingTagEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOnboardingDetails)) {
            return false;
        }

        CreateOnboardingDetails other = (CreateOnboardingDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isFamsTagEnabled, other.isFamsTagEnabled)
                && java.util.Objects.equals(
                        this.isCostTrackingTagEnabled, other.isCostTrackingTagEnabled)
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
                        + (this.isFamsTagEnabled == null ? 43 : this.isFamsTagEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isCostTrackingTagEnabled == null
                                ? 43
                                : this.isCostTrackingTagEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
