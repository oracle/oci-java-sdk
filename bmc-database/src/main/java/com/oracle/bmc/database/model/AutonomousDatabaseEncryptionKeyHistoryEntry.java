/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Autonomous Database encryption key history entry. <br>
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
        builder = AutonomousDatabaseEncryptionKeyHistoryEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousDatabaseEncryptionKeyHistoryEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"encryptionKey", "timeActivated"})
    public AutonomousDatabaseEncryptionKeyHistoryEntry(
            AutonomousDatabaseEncryptionKeyDetails encryptionKey, java.util.Date timeActivated) {
        super();
        this.encryptionKey = encryptionKey;
        this.timeActivated = timeActivated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
        private AutonomousDatabaseEncryptionKeyDetails encryptionKey;

        public Builder encryptionKey(AutonomousDatabaseEncryptionKeyDetails encryptionKey) {
            this.encryptionKey = encryptionKey;
            this.__explicitlySet__.add("encryptionKey");
            return this;
        }
        /** The date and time the encryption key was activated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeActivated")
        private java.util.Date timeActivated;

        /**
         * The date and time the encryption key was activated.
         *
         * @param timeActivated the value to set
         * @return this builder
         */
        public Builder timeActivated(java.util.Date timeActivated) {
            this.timeActivated = timeActivated;
            this.__explicitlySet__.add("timeActivated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseEncryptionKeyHistoryEntry build() {
            AutonomousDatabaseEncryptionKeyHistoryEntry model =
                    new AutonomousDatabaseEncryptionKeyHistoryEntry(
                            this.encryptionKey, this.timeActivated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseEncryptionKeyHistoryEntry model) {
            if (model.wasPropertyExplicitlySet("encryptionKey")) {
                this.encryptionKey(model.getEncryptionKey());
            }
            if (model.wasPropertyExplicitlySet("timeActivated")) {
                this.timeActivated(model.getTimeActivated());
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

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
    private final AutonomousDatabaseEncryptionKeyDetails encryptionKey;

    public AutonomousDatabaseEncryptionKeyDetails getEncryptionKey() {
        return encryptionKey;
    }

    /** The date and time the encryption key was activated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeActivated")
    private final java.util.Date timeActivated;

    /**
     * The date and time the encryption key was activated.
     *
     * @return the value
     */
    public java.util.Date getTimeActivated() {
        return timeActivated;
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
        sb.append("AutonomousDatabaseEncryptionKeyHistoryEntry(");
        sb.append("super=").append(super.toString());
        sb.append("encryptionKey=").append(String.valueOf(this.encryptionKey));
        sb.append(", timeActivated=").append(String.valueOf(this.timeActivated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseEncryptionKeyHistoryEntry)) {
            return false;
        }

        AutonomousDatabaseEncryptionKeyHistoryEntry other =
                (AutonomousDatabaseEncryptionKeyHistoryEntry) o;
        return java.util.Objects.equals(this.encryptionKey, other.encryptionKey)
                && java.util.Objects.equals(this.timeActivated, other.timeActivated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.encryptionKey == null ? 43 : this.encryptionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.timeActivated == null ? 43 : this.timeActivated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
