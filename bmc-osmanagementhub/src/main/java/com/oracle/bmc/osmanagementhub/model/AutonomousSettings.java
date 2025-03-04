/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Settings for the Autonomous Linux service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutonomousSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isDataCollectionAuthorized", "scheduledJobId"})
    public AutonomousSettings(Boolean isDataCollectionAuthorized, String scheduledJobId) {
        super();
        this.isDataCollectionAuthorized = isDataCollectionAuthorized;
        this.scheduledJobId = scheduledJobId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether Autonomous Linux will collect crash files. This setting can be changed
         * by the user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDataCollectionAuthorized")
        private Boolean isDataCollectionAuthorized;

        /**
         * Indicates whether Autonomous Linux will collect crash files. This setting can be changed
         * by the user.
         *
         * @param isDataCollectionAuthorized the value to set
         * @return this builder
         */
        public Builder isDataCollectionAuthorized(Boolean isDataCollectionAuthorized) {
            this.isDataCollectionAuthorized = isDataCollectionAuthorized;
            this.__explicitlySet__.add("isDataCollectionAuthorized");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * restricted scheduled job associated with this instance. This value cannot be deleted by
         * the user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobId")
        private String scheduledJobId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * restricted scheduled job associated with this instance. This value cannot be deleted by
         * the user.
         *
         * @param scheduledJobId the value to set
         * @return this builder
         */
        public Builder scheduledJobId(String scheduledJobId) {
            this.scheduledJobId = scheduledJobId;
            this.__explicitlySet__.add("scheduledJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousSettings build() {
            AutonomousSettings model =
                    new AutonomousSettings(this.isDataCollectionAuthorized, this.scheduledJobId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousSettings model) {
            if (model.wasPropertyExplicitlySet("isDataCollectionAuthorized")) {
                this.isDataCollectionAuthorized(model.getIsDataCollectionAuthorized());
            }
            if (model.wasPropertyExplicitlySet("scheduledJobId")) {
                this.scheduledJobId(model.getScheduledJobId());
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
     * Indicates whether Autonomous Linux will collect crash files. This setting can be changed by
     * the user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDataCollectionAuthorized")
    private final Boolean isDataCollectionAuthorized;

    /**
     * Indicates whether Autonomous Linux will collect crash files. This setting can be changed by
     * the user.
     *
     * @return the value
     */
    public Boolean getIsDataCollectionAuthorized() {
        return isDataCollectionAuthorized;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * restricted scheduled job associated with this instance. This value cannot be deleted by the
     * user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledJobId")
    private final String scheduledJobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * restricted scheduled job associated with this instance. This value cannot be deleted by the
     * user.
     *
     * @return the value
     */
    public String getScheduledJobId() {
        return scheduledJobId;
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
        sb.append("AutonomousSettings(");
        sb.append("super=").append(super.toString());
        sb.append("isDataCollectionAuthorized=")
                .append(String.valueOf(this.isDataCollectionAuthorized));
        sb.append(", scheduledJobId=").append(String.valueOf(this.scheduledJobId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousSettings)) {
            return false;
        }

        AutonomousSettings other = (AutonomousSettings) o;
        return java.util.Objects.equals(
                        this.isDataCollectionAuthorized, other.isDataCollectionAuthorized)
                && java.util.Objects.equals(this.scheduledJobId, other.scheduledJobId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isDataCollectionAuthorized == null
                                ? 43
                                : this.isDataCollectionAuthorized.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledJobId == null ? 43 : this.scheduledJobId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
