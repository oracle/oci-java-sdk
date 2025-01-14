/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Extension schema for error messages providing more details with the exception status. Returns
 * messageId corresponding to the detailed error message and optionally additional data related to
 * the error condition - for example reason for authentication failure such as user is disabled or
 * locked. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExtensionMessagesError.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionMessagesError
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"messageId", "additionalData"})
    public ExtensionMessagesError(String messageId, Object additionalData) {
        super();
        this.messageId = messageId;
        this.additionalData = additionalData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Internal error keyword pointing to the exception status message. REQUIRED. */
        @com.fasterxml.jackson.annotation.JsonProperty("messageId")
        private String messageId;

        /**
         * Internal error keyword pointing to the exception status message. REQUIRED.
         *
         * @param messageId the value to set
         * @return this builder
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            this.__explicitlySet__.add("messageId");
            return this;
        }
        /**
         * Contains Map based additional data for the exception message (as key-value pair). All
         * keys and values are in string format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalData")
        private Object additionalData;

        /**
         * Contains Map based additional data for the exception message (as key-value pair). All
         * keys and values are in string format.
         *
         * @param additionalData the value to set
         * @return this builder
         */
        public Builder additionalData(Object additionalData) {
            this.additionalData = additionalData;
            this.__explicitlySet__.add("additionalData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionMessagesError build() {
            ExtensionMessagesError model =
                    new ExtensionMessagesError(this.messageId, this.additionalData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionMessagesError model) {
            if (model.wasPropertyExplicitlySet("messageId")) {
                this.messageId(model.getMessageId());
            }
            if (model.wasPropertyExplicitlySet("additionalData")) {
                this.additionalData(model.getAdditionalData());
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

    /** Internal error keyword pointing to the exception status message. REQUIRED. */
    @com.fasterxml.jackson.annotation.JsonProperty("messageId")
    private final String messageId;

    /**
     * Internal error keyword pointing to the exception status message. REQUIRED.
     *
     * @return the value
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Contains Map based additional data for the exception message (as key-value pair). All keys
     * and values are in string format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalData")
    private final Object additionalData;

    /**
     * Contains Map based additional data for the exception message (as key-value pair). All keys
     * and values are in string format.
     *
     * @return the value
     */
    public Object getAdditionalData() {
        return additionalData;
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
        sb.append("ExtensionMessagesError(");
        sb.append("super=").append(super.toString());
        sb.append("messageId=").append(String.valueOf(this.messageId));
        sb.append(", additionalData=").append(String.valueOf(this.additionalData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionMessagesError)) {
            return false;
        }

        ExtensionMessagesError other = (ExtensionMessagesError) o;
        return java.util.Objects.equals(this.messageId, other.messageId)
                && java.util.Objects.equals(this.additionalData, other.additionalData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.messageId == null ? 43 : this.messageId.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalData == null ? 43 : this.additionalData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
