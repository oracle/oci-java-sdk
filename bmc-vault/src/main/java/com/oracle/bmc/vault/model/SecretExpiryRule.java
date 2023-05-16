/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * A rule that helps enforce the expiration of a secret's contents. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecretExpiryRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "ruleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecretExpiryRule extends SecretRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A property indicating how long the secret contents will be considered valid, expressed in
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format. The secret
         * needs to be updated when the secret content expires. The timer resets after you update
         * the secret contents. The minimum value is 1 day and the maximum value is 90 days for this
         * property. Currently, only intervals expressed in days are supported. For example, pass
         * {@code P3D} to have the secret version expire every 3 days.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretVersionExpiryInterval")
        private String secretVersionExpiryInterval;

        /**
         * A property indicating how long the secret contents will be considered valid, expressed in
         * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format. The secret
         * needs to be updated when the secret content expires. The timer resets after you update
         * the secret contents. The minimum value is 1 day and the maximum value is 90 days for this
         * property. Currently, only intervals expressed in days are supported. For example, pass
         * {@code P3D} to have the secret version expire every 3 days.
         *
         * @param secretVersionExpiryInterval the value to set
         * @return this builder
         */
        public Builder secretVersionExpiryInterval(String secretVersionExpiryInterval) {
            this.secretVersionExpiryInterval = secretVersionExpiryInterval;
            this.__explicitlySet__.add("secretVersionExpiryInterval");
            return this;
        }
        /**
         * An optional property indicating the absolute time when this secret will expire, expressed
         * in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The minimum number
         * of days from current time is 1 day and the maximum number of days from current time is
         * 365 days. Example: {@code 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAbsoluteExpiry")
        private java.util.Date timeOfAbsoluteExpiry;

        /**
         * An optional property indicating the absolute time when this secret will expire, expressed
         * in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The minimum number
         * of days from current time is 1 day and the maximum number of days from current time is
         * 365 days. Example: {@code 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfAbsoluteExpiry the value to set
         * @return this builder
         */
        public Builder timeOfAbsoluteExpiry(java.util.Date timeOfAbsoluteExpiry) {
            this.timeOfAbsoluteExpiry = timeOfAbsoluteExpiry;
            this.__explicitlySet__.add("timeOfAbsoluteExpiry");
            return this;
        }
        /**
         * A property indicating whether to block retrieval of the secret content, on expiry. The
         * default is false. If the secret has already expired and you would like to retrieve the
         * secret contents, you need to edit the secret rule to disable this property, to allow
         * reading the secret content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSecretContentRetrievalBlockedOnExpiry")
        private Boolean isSecretContentRetrievalBlockedOnExpiry;

        /**
         * A property indicating whether to block retrieval of the secret content, on expiry. The
         * default is false. If the secret has already expired and you would like to retrieve the
         * secret contents, you need to edit the secret rule to disable this property, to allow
         * reading the secret content.
         *
         * @param isSecretContentRetrievalBlockedOnExpiry the value to set
         * @return this builder
         */
        public Builder isSecretContentRetrievalBlockedOnExpiry(
                Boolean isSecretContentRetrievalBlockedOnExpiry) {
            this.isSecretContentRetrievalBlockedOnExpiry = isSecretContentRetrievalBlockedOnExpiry;
            this.__explicitlySet__.add("isSecretContentRetrievalBlockedOnExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretExpiryRule build() {
            SecretExpiryRule model =
                    new SecretExpiryRule(
                            this.secretVersionExpiryInterval,
                            this.timeOfAbsoluteExpiry,
                            this.isSecretContentRetrievalBlockedOnExpiry);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretExpiryRule model) {
            if (model.wasPropertyExplicitlySet("secretVersionExpiryInterval")) {
                this.secretVersionExpiryInterval(model.getSecretVersionExpiryInterval());
            }
            if (model.wasPropertyExplicitlySet("timeOfAbsoluteExpiry")) {
                this.timeOfAbsoluteExpiry(model.getTimeOfAbsoluteExpiry());
            }
            if (model.wasPropertyExplicitlySet("isSecretContentRetrievalBlockedOnExpiry")) {
                this.isSecretContentRetrievalBlockedOnExpiry(
                        model.getIsSecretContentRetrievalBlockedOnExpiry());
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
    public SecretExpiryRule(
            String secretVersionExpiryInterval,
            java.util.Date timeOfAbsoluteExpiry,
            Boolean isSecretContentRetrievalBlockedOnExpiry) {
        super();
        this.secretVersionExpiryInterval = secretVersionExpiryInterval;
        this.timeOfAbsoluteExpiry = timeOfAbsoluteExpiry;
        this.isSecretContentRetrievalBlockedOnExpiry = isSecretContentRetrievalBlockedOnExpiry;
    }

    /**
     * A property indicating how long the secret contents will be considered valid, expressed in
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format. The secret needs to
     * be updated when the secret content expires. The timer resets after you update the secret
     * contents. The minimum value is 1 day and the maximum value is 90 days for this property.
     * Currently, only intervals expressed in days are supported. For example, pass {@code P3D} to
     * have the secret version expire every 3 days.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretVersionExpiryInterval")
    private final String secretVersionExpiryInterval;

    /**
     * A property indicating how long the secret contents will be considered valid, expressed in
     * [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format. The secret needs to
     * be updated when the secret content expires. The timer resets after you update the secret
     * contents. The minimum value is 1 day and the maximum value is 90 days for this property.
     * Currently, only intervals expressed in days are supported. For example, pass {@code P3D} to
     * have the secret version expire every 3 days.
     *
     * @return the value
     */
    public String getSecretVersionExpiryInterval() {
        return secretVersionExpiryInterval;
    }

    /**
     * An optional property indicating the absolute time when this secret will expire, expressed in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The minimum number of days
     * from current time is 1 day and the maximum number of days from current time is 365 days.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAbsoluteExpiry")
    private final java.util.Date timeOfAbsoluteExpiry;

    /**
     * An optional property indicating the absolute time when this secret will expire, expressed in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. The minimum number of days
     * from current time is 1 day and the maximum number of days from current time is 365 days.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfAbsoluteExpiry() {
        return timeOfAbsoluteExpiry;
    }

    /**
     * A property indicating whether to block retrieval of the secret content, on expiry. The
     * default is false. If the secret has already expired and you would like to retrieve the secret
     * contents, you need to edit the secret rule to disable this property, to allow reading the
     * secret content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSecretContentRetrievalBlockedOnExpiry")
    private final Boolean isSecretContentRetrievalBlockedOnExpiry;

    /**
     * A property indicating whether to block retrieval of the secret content, on expiry. The
     * default is false. If the secret has already expired and you would like to retrieve the secret
     * contents, you need to edit the secret rule to disable this property, to allow reading the
     * secret content.
     *
     * @return the value
     */
    public Boolean getIsSecretContentRetrievalBlockedOnExpiry() {
        return isSecretContentRetrievalBlockedOnExpiry;
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
        sb.append("SecretExpiryRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", secretVersionExpiryInterval=")
                .append(String.valueOf(this.secretVersionExpiryInterval));
        sb.append(", timeOfAbsoluteExpiry=").append(String.valueOf(this.timeOfAbsoluteExpiry));
        sb.append(", isSecretContentRetrievalBlockedOnExpiry=")
                .append(String.valueOf(this.isSecretContentRetrievalBlockedOnExpiry));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecretExpiryRule)) {
            return false;
        }

        SecretExpiryRule other = (SecretExpiryRule) o;
        return java.util.Objects.equals(
                        this.secretVersionExpiryInterval, other.secretVersionExpiryInterval)
                && java.util.Objects.equals(this.timeOfAbsoluteExpiry, other.timeOfAbsoluteExpiry)
                && java.util.Objects.equals(
                        this.isSecretContentRetrievalBlockedOnExpiry,
                        other.isSecretContentRetrievalBlockedOnExpiry)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.secretVersionExpiryInterval == null
                                ? 43
                                : this.secretVersionExpiryInterval.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfAbsoluteExpiry == null
                                ? 43
                                : this.timeOfAbsoluteExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.isSecretContentRetrievalBlockedOnExpiry == null
                                ? 43
                                : this.isSecretContentRetrievalBlockedOnExpiry.hashCode());
        return result;
    }
}
