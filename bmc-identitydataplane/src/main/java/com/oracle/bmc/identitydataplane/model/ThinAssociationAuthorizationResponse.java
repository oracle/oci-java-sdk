/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ThinAssociationAuthorizationResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ThinAssociationAuthorizationResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"responses", "associationResult", "decisionCacheDuration"})
    public ThinAssociationAuthorizationResponse(
            java.util.List<ThinAuthorizationResponse> responses,
            AssociationResult associationResult,
            String decisionCacheDuration) {
        super();
        this.responses = responses;
        this.associationResult = associationResult;
        this.decisionCacheDuration = decisionCacheDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The authorization responses. */
        @com.fasterxml.jackson.annotation.JsonProperty("responses")
        private java.util.List<ThinAuthorizationResponse> responses;

        /**
         * The authorization responses.
         *
         * @param responses the value to set
         * @return this builder
         */
        public Builder responses(java.util.List<ThinAuthorizationResponse> responses) {
            this.responses = responses;
            this.__explicitlySet__.add("responses");
            return this;
        }
        /** The association verification result. */
        @com.fasterxml.jackson.annotation.JsonProperty("associationResult")
        private AssociationResult associationResult;

        /**
         * The association verification result.
         *
         * @param associationResult the value to set
         * @return this builder
         */
        public Builder associationResult(AssociationResult associationResult) {
            this.associationResult = associationResult;
            this.__explicitlySet__.add("associationResult");
            return this;
        }
        /** The decision cache duration. */
        @com.fasterxml.jackson.annotation.JsonProperty("decisionCacheDuration")
        private String decisionCacheDuration;

        /**
         * The decision cache duration.
         *
         * @param decisionCacheDuration the value to set
         * @return this builder
         */
        public Builder decisionCacheDuration(String decisionCacheDuration) {
            this.decisionCacheDuration = decisionCacheDuration;
            this.__explicitlySet__.add("decisionCacheDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThinAssociationAuthorizationResponse build() {
            ThinAssociationAuthorizationResponse model =
                    new ThinAssociationAuthorizationResponse(
                            this.responses, this.associationResult, this.decisionCacheDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThinAssociationAuthorizationResponse model) {
            if (model.wasPropertyExplicitlySet("responses")) {
                this.responses(model.getResponses());
            }
            if (model.wasPropertyExplicitlySet("associationResult")) {
                this.associationResult(model.getAssociationResult());
            }
            if (model.wasPropertyExplicitlySet("decisionCacheDuration")) {
                this.decisionCacheDuration(model.getDecisionCacheDuration());
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

    /** The authorization responses. */
    @com.fasterxml.jackson.annotation.JsonProperty("responses")
    private final java.util.List<ThinAuthorizationResponse> responses;

    /**
     * The authorization responses.
     *
     * @return the value
     */
    public java.util.List<ThinAuthorizationResponse> getResponses() {
        return responses;
    }

    /** The association verification result. */
    public enum AssociationResult implements com.oracle.bmc.http.internal.BmcEnum {
        FailUnknown("FAIL_UNKNOWN"),
        FailBadRequest("FAIL_BAD_REQUEST"),
        FailMissingEndorse("FAIL_MISSING_ENDORSE"),
        FailMissingAdmit("FAIL_MISSING_ADMIT"),
        Success("SUCCESS"),
        ;

        private final String value;
        private static java.util.Map<String, AssociationResult> map;

        static {
            map = new java.util.HashMap<>();
            for (AssociationResult v : AssociationResult.values()) {
                map.put(v.getValue(), v);
            }
        }

        AssociationResult(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssociationResult create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AssociationResult: " + key);
        }
    };
    /** The association verification result. */
    @com.fasterxml.jackson.annotation.JsonProperty("associationResult")
    private final AssociationResult associationResult;

    /**
     * The association verification result.
     *
     * @return the value
     */
    public AssociationResult getAssociationResult() {
        return associationResult;
    }

    /** The decision cache duration. */
    @com.fasterxml.jackson.annotation.JsonProperty("decisionCacheDuration")
    private final String decisionCacheDuration;

    /**
     * The decision cache duration.
     *
     * @return the value
     */
    public String getDecisionCacheDuration() {
        return decisionCacheDuration;
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
        sb.append("ThinAssociationAuthorizationResponse(");
        sb.append("super=").append(super.toString());
        sb.append("responses=").append(String.valueOf(this.responses));
        sb.append(", associationResult=").append(String.valueOf(this.associationResult));
        sb.append(", decisionCacheDuration=").append(String.valueOf(this.decisionCacheDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThinAssociationAuthorizationResponse)) {
            return false;
        }

        ThinAssociationAuthorizationResponse other = (ThinAssociationAuthorizationResponse) o;
        return java.util.Objects.equals(this.responses, other.responses)
                && java.util.Objects.equals(this.associationResult, other.associationResult)
                && java.util.Objects.equals(this.decisionCacheDuration, other.decisionCacheDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.responses == null ? 43 : this.responses.hashCode());
        result =
                (result * PRIME)
                        + (this.associationResult == null ? 43 : this.associationResult.hashCode());
        result =
                (result * PRIME)
                        + (this.decisionCacheDuration == null
                                ? 43
                                : this.decisionCacheDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
