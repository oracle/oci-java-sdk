/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * SQL Firewall policy details. <br>
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
        builder = FirewallPolicyEntryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entryType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FirewallPolicyEntryDetails extends EntryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time the the SQL Firewall policy was generated on the target database, in the format
         * defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeGenerated")
        private java.util.Date timeGenerated;

        /**
         * The time the the SQL Firewall policy was generated on the target database, in the format
         * defined by RFC3339.
         *
         * @param timeGenerated the value to set
         * @return this builder
         */
        public Builder timeGenerated(java.util.Date timeGenerated) {
            this.timeGenerated = timeGenerated;
            this.__explicitlySet__.add("timeGenerated");
            return this;
        }
        /**
         * The last date and time the status of the SQL Firewall policy was updated on the target
         * database, in the format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
        private java.util.Date timeStatusUpdated;

        /**
         * The last date and time the status of the SQL Firewall policy was updated on the target
         * database, in the format defined by RFC3339.
         *
         * @param timeStatusUpdated the value to set
         * @return this builder
         */
        public Builder timeStatusUpdated(java.util.Date timeStatusUpdated) {
            this.timeStatusUpdated = timeStatusUpdated;
            this.__explicitlySet__.add("timeStatusUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FirewallPolicyEntryDetails build() {
            FirewallPolicyEntryDetails model =
                    new FirewallPolicyEntryDetails(this.timeGenerated, this.timeStatusUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FirewallPolicyEntryDetails model) {
            if (model.wasPropertyExplicitlySet("timeGenerated")) {
                this.timeGenerated(model.getTimeGenerated());
            }
            if (model.wasPropertyExplicitlySet("timeStatusUpdated")) {
                this.timeStatusUpdated(model.getTimeStatusUpdated());
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
    public FirewallPolicyEntryDetails(
            java.util.Date timeGenerated, java.util.Date timeStatusUpdated) {
        super();
        this.timeGenerated = timeGenerated;
        this.timeStatusUpdated = timeStatusUpdated;
    }

    /**
     * The time the the SQL Firewall policy was generated on the target database, in the format
     * defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeGenerated")
    private final java.util.Date timeGenerated;

    /**
     * The time the the SQL Firewall policy was generated on the target database, in the format
     * defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeGenerated() {
        return timeGenerated;
    }

    /**
     * The last date and time the status of the SQL Firewall policy was updated on the target
     * database, in the format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
    private final java.util.Date timeStatusUpdated;

    /**
     * The last date and time the status of the SQL Firewall policy was updated on the target
     * database, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeStatusUpdated() {
        return timeStatusUpdated;
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
        sb.append("FirewallPolicyEntryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeGenerated=").append(String.valueOf(this.timeGenerated));
        sb.append(", timeStatusUpdated=").append(String.valueOf(this.timeStatusUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FirewallPolicyEntryDetails)) {
            return false;
        }

        FirewallPolicyEntryDetails other = (FirewallPolicyEntryDetails) o;
        return java.util.Objects.equals(this.timeGenerated, other.timeGenerated)
                && java.util.Objects.equals(this.timeStatusUpdated, other.timeStatusUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.timeGenerated == null ? 43 : this.timeGenerated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusUpdated == null ? 43 : this.timeStatusUpdated.hashCode());
        return result;
    }
}
