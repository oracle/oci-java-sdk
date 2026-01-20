/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The data to create/renew an API key item. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KeyDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"keyName", "timeExpiry"})
    public KeyDetails(String keyName, java.util.Date timeExpiry) {
        super();
        this.keyName = keyName;
        this.timeExpiry = timeExpiry;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The key to renew. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyName")
        private String keyName;

        /**
         * The key to renew.
         *
         * @param keyName the value to set
         * @return this builder
         */
        public Builder keyName(String keyName) {
            this.keyName = keyName;
            this.__explicitlySet__.add("keyName");
            return this;
        }
        /**
         * The date and time when the key would be expired, if not provided it would be 90 days, in
         * the format defined by RFC 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExpiry")
        private java.util.Date timeExpiry;

        /**
         * The date and time when the key would be expired, if not provided it would be 90 days, in
         * the format defined by RFC 3339.
         *
         * @param timeExpiry the value to set
         * @return this builder
         */
        public Builder timeExpiry(java.util.Date timeExpiry) {
            this.timeExpiry = timeExpiry;
            this.__explicitlySet__.add("timeExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KeyDetails build() {
            KeyDetails model = new KeyDetails(this.keyName, this.timeExpiry);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KeyDetails model) {
            if (model.wasPropertyExplicitlySet("keyName")) {
                this.keyName(model.getKeyName());
            }
            if (model.wasPropertyExplicitlySet("timeExpiry")) {
                this.timeExpiry(model.getTimeExpiry());
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

    /** The key to renew. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyName")
    private final String keyName;

    /**
     * The key to renew.
     *
     * @return the value
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * The date and time when the key would be expired, if not provided it would be 90 days, in the
     * format defined by RFC 3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExpiry")
    private final java.util.Date timeExpiry;

    /**
     * The date and time when the key would be expired, if not provided it would be 90 days, in the
     * format defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeExpiry() {
        return timeExpiry;
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
        sb.append("KeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("keyName=").append(String.valueOf(this.keyName));
        sb.append(", timeExpiry=").append(String.valueOf(this.timeExpiry));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KeyDetails)) {
            return false;
        }

        KeyDetails other = (KeyDetails) o;
        return java.util.Objects.equals(this.keyName, other.keyName)
                && java.util.Objects.equals(this.timeExpiry, other.timeExpiry)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyName == null ? 43 : this.keyName.hashCode());
        result = (result * PRIME) + (this.timeExpiry == null ? 43 : this.timeExpiry.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
