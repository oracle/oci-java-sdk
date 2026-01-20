/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to update a finding in a security assessment. <br>
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
        builder = UpdateFindingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateFindingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"severity", "justification", "timeValidUntil"})
    public UpdateFindingDetails(
            Finding.Severity severity, String justification, java.util.Date timeValidUntil) {
        super();
        this.severity = severity;
        this.justification = justification;
        this.timeValidUntil = timeValidUntil;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The severity of the finding as defined or changed by the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Finding.Severity severity;

        /**
         * The severity of the finding as defined or changed by the user.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Finding.Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** User provided reason for accepting or modifying this finding if they choose to do so. */
        @com.fasterxml.jackson.annotation.JsonProperty("justification")
        private String justification;

        /**
         * User provided reason for accepting or modifying this finding if they choose to do so.
         *
         * @param justification the value to set
         * @return this builder
         */
        public Builder justification(String justification) {
            this.justification = justification;
            this.__explicitlySet__.add("justification");
            return this;
        }
        /**
         * The time until which the change in severity (deferred / modified) got the given finding
         * is valid.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidUntil")
        private java.util.Date timeValidUntil;

        /**
         * The time until which the change in severity (deferred / modified) got the given finding
         * is valid.
         *
         * @param timeValidUntil the value to set
         * @return this builder
         */
        public Builder timeValidUntil(java.util.Date timeValidUntil) {
            this.timeValidUntil = timeValidUntil;
            this.__explicitlySet__.add("timeValidUntil");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFindingDetails build() {
            UpdateFindingDetails model =
                    new UpdateFindingDetails(
                            this.severity, this.justification, this.timeValidUntil);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFindingDetails model) {
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("justification")) {
                this.justification(model.getJustification());
            }
            if (model.wasPropertyExplicitlySet("timeValidUntil")) {
                this.timeValidUntil(model.getTimeValidUntil());
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

    /** The severity of the finding as defined or changed by the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Finding.Severity severity;

    /**
     * The severity of the finding as defined or changed by the user.
     *
     * @return the value
     */
    public Finding.Severity getSeverity() {
        return severity;
    }

    /** User provided reason for accepting or modifying this finding if they choose to do so. */
    @com.fasterxml.jackson.annotation.JsonProperty("justification")
    private final String justification;

    /**
     * User provided reason for accepting or modifying this finding if they choose to do so.
     *
     * @return the value
     */
    public String getJustification() {
        return justification;
    }

    /**
     * The time until which the change in severity (deferred / modified) got the given finding is
     * valid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidUntil")
    private final java.util.Date timeValidUntil;

    /**
     * The time until which the change in severity (deferred / modified) got the given finding is
     * valid.
     *
     * @return the value
     */
    public java.util.Date getTimeValidUntil() {
        return timeValidUntil;
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
        sb.append("UpdateFindingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("severity=").append(String.valueOf(this.severity));
        sb.append(", justification=").append(String.valueOf(this.justification));
        sb.append(", timeValidUntil=").append(String.valueOf(this.timeValidUntil));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFindingDetails)) {
            return false;
        }

        UpdateFindingDetails other = (UpdateFindingDetails) o;
        return java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.justification, other.justification)
                && java.util.Objects.equals(this.timeValidUntil, other.timeValidUntil)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.justification == null ? 43 : this.justification.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidUntil == null ? 43 : this.timeValidUntil.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
