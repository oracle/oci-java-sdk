/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details of a custom 'GI' software image. <br>
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
        builder = CustomGiGoalVersionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "goalType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomGiGoalVersionDetails extends GiGoalVersionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * custom 'GI' software image.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("goalSoftwareImageId")
        private String goalSoftwareImageId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * custom 'GI' software image.
         *
         * @param goalSoftwareImageId the value to set
         * @return this builder
         */
        public Builder goalSoftwareImageId(String goalSoftwareImageId) {
            this.goalSoftwareImageId = goalSoftwareImageId;
            this.__explicitlySet__.add("goalSoftwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomGiGoalVersionDetails build() {
            CustomGiGoalVersionDetails model =
                    new CustomGiGoalVersionDetails(this.goalSoftwareImageId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomGiGoalVersionDetails model) {
            if (model.wasPropertyExplicitlySet("goalSoftwareImageId")) {
                this.goalSoftwareImageId(model.getGoalSoftwareImageId());
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
    public CustomGiGoalVersionDetails(String goalSoftwareImageId) {
        super();
        this.goalSoftwareImageId = goalSoftwareImageId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * custom 'GI' software image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("goalSoftwareImageId")
    private final String goalSoftwareImageId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * custom 'GI' software image.
     *
     * @return the value
     */
    public String getGoalSoftwareImageId() {
        return goalSoftwareImageId;
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
        sb.append("CustomGiGoalVersionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", goalSoftwareImageId=").append(String.valueOf(this.goalSoftwareImageId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomGiGoalVersionDetails)) {
            return false;
        }

        CustomGiGoalVersionDetails other = (CustomGiGoalVersionDetails) o;
        return java.util.Objects.equals(this.goalSoftwareImageId, other.goalSoftwareImageId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.goalSoftwareImageId == null
                                ? 43
                                : this.goalSoftwareImageId.hashCode());
        return result;
    }
}
