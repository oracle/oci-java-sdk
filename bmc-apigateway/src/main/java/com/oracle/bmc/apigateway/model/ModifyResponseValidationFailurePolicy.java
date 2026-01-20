/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Policy to specify how to modify the response code, body and headers. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ModifyResponseValidationFailurePolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModifyResponseValidationFailurePolicy extends ValidationFailurePolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** HTTP response code, can include context variables. */
        @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
        private String responseCode;

        /**
         * HTTP response code, can include context variables.
         *
         * @param responseCode the value to set
         * @return this builder
         */
        public Builder responseCode(String responseCode) {
            this.responseCode = responseCode;
            this.__explicitlySet__.add("responseCode");
            return this;
        }
        /** HTTP response message. */
        @com.fasterxml.jackson.annotation.JsonProperty("responseMessage")
        private String responseMessage;

        /**
         * HTTP response message.
         *
         * @param responseMessage the value to set
         * @return this builder
         */
        public Builder responseMessage(String responseMessage) {
            this.responseMessage = responseMessage;
            this.__explicitlySet__.add("responseMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseHeaderTransformations")
        private HeaderTransformationPolicy responseHeaderTransformations;

        public Builder responseHeaderTransformations(
                HeaderTransformationPolicy responseHeaderTransformations) {
            this.responseHeaderTransformations = responseHeaderTransformations;
            this.__explicitlySet__.add("responseHeaderTransformations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModifyResponseValidationFailurePolicy build() {
            ModifyResponseValidationFailurePolicy model =
                    new ModifyResponseValidationFailurePolicy(
                            this.responseCode,
                            this.responseMessage,
                            this.responseHeaderTransformations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModifyResponseValidationFailurePolicy model) {
            if (model.wasPropertyExplicitlySet("responseCode")) {
                this.responseCode(model.getResponseCode());
            }
            if (model.wasPropertyExplicitlySet("responseMessage")) {
                this.responseMessage(model.getResponseMessage());
            }
            if (model.wasPropertyExplicitlySet("responseHeaderTransformations")) {
                this.responseHeaderTransformations(model.getResponseHeaderTransformations());
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
    public ModifyResponseValidationFailurePolicy(
            String responseCode,
            String responseMessage,
            HeaderTransformationPolicy responseHeaderTransformations) {
        super();
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseHeaderTransformations = responseHeaderTransformations;
    }

    /** HTTP response code, can include context variables. */
    @com.fasterxml.jackson.annotation.JsonProperty("responseCode")
    private final String responseCode;

    /**
     * HTTP response code, can include context variables.
     *
     * @return the value
     */
    public String getResponseCode() {
        return responseCode;
    }

    /** HTTP response message. */
    @com.fasterxml.jackson.annotation.JsonProperty("responseMessage")
    private final String responseMessage;

    /**
     * HTTP response message.
     *
     * @return the value
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseHeaderTransformations")
    private final HeaderTransformationPolicy responseHeaderTransformations;

    public HeaderTransformationPolicy getResponseHeaderTransformations() {
        return responseHeaderTransformations;
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
        sb.append("ModifyResponseValidationFailurePolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", responseCode=").append(String.valueOf(this.responseCode));
        sb.append(", responseMessage=").append(String.valueOf(this.responseMessage));
        sb.append(", responseHeaderTransformations=")
                .append(String.valueOf(this.responseHeaderTransformations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModifyResponseValidationFailurePolicy)) {
            return false;
        }

        ModifyResponseValidationFailurePolicy other = (ModifyResponseValidationFailurePolicy) o;
        return java.util.Objects.equals(this.responseCode, other.responseCode)
                && java.util.Objects.equals(this.responseMessage, other.responseMessage)
                && java.util.Objects.equals(
                        this.responseHeaderTransformations, other.responseHeaderTransformations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.responseCode == null ? 43 : this.responseCode.hashCode());
        result =
                (result * PRIME)
                        + (this.responseMessage == null ? 43 : this.responseMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.responseHeaderTransformations == null
                                ? 43
                                : this.responseHeaderTransformations.hashCode());
        return result;
    }
}
