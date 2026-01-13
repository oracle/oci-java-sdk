/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Prepared backup details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PreparedBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PreparedBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"preparedBackupRestoreReductionInMinutes", "timePrepared"})
    public PreparedBackupDetails(
            Integer preparedBackupRestoreReductionInMinutes, java.util.Date timePrepared) {
        super();
        this.preparedBackupRestoreReductionInMinutes = preparedBackupRestoreReductionInMinutes;
        this.timePrepared = timePrepared;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The estimated time saving when this prepared backup is restored. */
        @com.fasterxml.jackson.annotation.JsonProperty("preparedBackupRestoreReductionInMinutes")
        private Integer preparedBackupRestoreReductionInMinutes;

        /**
         * The estimated time saving when this prepared backup is restored.
         *
         * @param preparedBackupRestoreReductionInMinutes the value to set
         * @return this builder
         */
        public Builder preparedBackupRestoreReductionInMinutes(
                Integer preparedBackupRestoreReductionInMinutes) {
            this.preparedBackupRestoreReductionInMinutes = preparedBackupRestoreReductionInMinutes;
            this.__explicitlySet__.add("preparedBackupRestoreReductionInMinutes");
            return this;
        }
        /** The date and time the backup was prepared. */
        @com.fasterxml.jackson.annotation.JsonProperty("timePrepared")
        private java.util.Date timePrepared;

        /**
         * The date and time the backup was prepared.
         *
         * @param timePrepared the value to set
         * @return this builder
         */
        public Builder timePrepared(java.util.Date timePrepared) {
            this.timePrepared = timePrepared;
            this.__explicitlySet__.add("timePrepared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PreparedBackupDetails build() {
            PreparedBackupDetails model =
                    new PreparedBackupDetails(
                            this.preparedBackupRestoreReductionInMinutes, this.timePrepared);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PreparedBackupDetails model) {
            if (model.wasPropertyExplicitlySet("preparedBackupRestoreReductionInMinutes")) {
                this.preparedBackupRestoreReductionInMinutes(
                        model.getPreparedBackupRestoreReductionInMinutes());
            }
            if (model.wasPropertyExplicitlySet("timePrepared")) {
                this.timePrepared(model.getTimePrepared());
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

    /** The estimated time saving when this prepared backup is restored. */
    @com.fasterxml.jackson.annotation.JsonProperty("preparedBackupRestoreReductionInMinutes")
    private final Integer preparedBackupRestoreReductionInMinutes;

    /**
     * The estimated time saving when this prepared backup is restored.
     *
     * @return the value
     */
    public Integer getPreparedBackupRestoreReductionInMinutes() {
        return preparedBackupRestoreReductionInMinutes;
    }

    /** The date and time the backup was prepared. */
    @com.fasterxml.jackson.annotation.JsonProperty("timePrepared")
    private final java.util.Date timePrepared;

    /**
     * The date and time the backup was prepared.
     *
     * @return the value
     */
    public java.util.Date getTimePrepared() {
        return timePrepared;
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
        sb.append("PreparedBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("preparedBackupRestoreReductionInMinutes=")
                .append(String.valueOf(this.preparedBackupRestoreReductionInMinutes));
        sb.append(", timePrepared=").append(String.valueOf(this.timePrepared));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PreparedBackupDetails)) {
            return false;
        }

        PreparedBackupDetails other = (PreparedBackupDetails) o;
        return java.util.Objects.equals(
                        this.preparedBackupRestoreReductionInMinutes,
                        other.preparedBackupRestoreReductionInMinutes)
                && java.util.Objects.equals(this.timePrepared, other.timePrepared)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.preparedBackupRestoreReductionInMinutes == null
                                ? 43
                                : this.preparedBackupRestoreReductionInMinutes.hashCode());
        result = (result * PRIME) + (this.timePrepared == null ? 43 : this.timePrepared.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
