/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The terms of use agreement which must be accepted prior to accessing certain product features.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Agreement.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Agreement extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"uuid", "termsAndConditionsText", "signature"})
    public Agreement(String uuid, String termsAndConditionsText, String signature) {
        super();
        this.uuid = uuid;
        this.termsAndConditionsText = termsAndConditionsText;
        this.signature = signature;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of the terms of use agreement. */
        @com.fasterxml.jackson.annotation.JsonProperty("uuid")
        private String uuid;

        /**
         * The ID of the terms of use agreement.
         *
         * @param uuid the value to set
         * @return this builder
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            this.__explicitlySet__.add("uuid");
            return this;
        }
        /** The content of the terms and conditions. */
        @com.fasterxml.jackson.annotation.JsonProperty("termsAndConditionsText")
        private String termsAndConditionsText;

        /**
         * The content of the terms and conditions.
         *
         * @param termsAndConditionsText the value to set
         * @return this builder
         */
        public Builder termsAndConditionsText(String termsAndConditionsText) {
            this.termsAndConditionsText = termsAndConditionsText;
            this.__explicitlySet__.add("termsAndConditionsText");
            return this;
        }
        /**
         * The signature for the terms of use agreement. The signature attribute is a Base64-encoded
         * string associated with the agreement.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        /**
         * The signature for the terms of use agreement. The signature attribute is a Base64-encoded
         * string associated with the agreement.
         *
         * @param signature the value to set
         * @return this builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Agreement build() {
            Agreement model = new Agreement(this.uuid, this.termsAndConditionsText, this.signature);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Agreement model) {
            if (model.wasPropertyExplicitlySet("uuid")) {
                this.uuid(model.getUuid());
            }
            if (model.wasPropertyExplicitlySet("termsAndConditionsText")) {
                this.termsAndConditionsText(model.getTermsAndConditionsText());
            }
            if (model.wasPropertyExplicitlySet("signature")) {
                this.signature(model.getSignature());
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

    /** The ID of the terms of use agreement. */
    @com.fasterxml.jackson.annotation.JsonProperty("uuid")
    private final String uuid;

    /**
     * The ID of the terms of use agreement.
     *
     * @return the value
     */
    public String getUuid() {
        return uuid;
    }

    /** The content of the terms and conditions. */
    @com.fasterxml.jackson.annotation.JsonProperty("termsAndConditionsText")
    private final String termsAndConditionsText;

    /**
     * The content of the terms and conditions.
     *
     * @return the value
     */
    public String getTermsAndConditionsText() {
        return termsAndConditionsText;
    }

    /**
     * The signature for the terms of use agreement. The signature attribute is a Base64-encoded
     * string associated with the agreement.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    private final String signature;

    /**
     * The signature for the terms of use agreement. The signature attribute is a Base64-encoded
     * string associated with the agreement.
     *
     * @return the value
     */
    public String getSignature() {
        return signature;
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
        sb.append("Agreement(");
        sb.append("super=").append(super.toString());
        sb.append("uuid=").append(String.valueOf(this.uuid));
        sb.append(", termsAndConditionsText=").append(String.valueOf(this.termsAndConditionsText));
        sb.append(", signature=").append(String.valueOf(this.signature));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Agreement)) {
            return false;
        }

        Agreement other = (Agreement) o;
        return java.util.Objects.equals(this.uuid, other.uuid)
                && java.util.Objects.equals(
                        this.termsAndConditionsText, other.termsAndConditionsText)
                && java.util.Objects.equals(this.signature, other.signature)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uuid == null ? 43 : this.uuid.hashCode());
        result =
                (result * PRIME)
                        + (this.termsAndConditionsText == null
                                ? 43
                                : this.termsAndConditionsText.hashCode());
        result = (result * PRIME) + (this.signature == null ? 43 : this.signature.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
