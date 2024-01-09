/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Properties that define a request to start credential rotation on a kubernetes cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StartCredentialRotationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StartCredentialRotationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"autoCompletionDelayDuration"})
    public StartCredentialRotationDetails(String autoCompletionDelayDuration) {
        super();
        this.autoCompletionDelayDuration = autoCompletionDelayDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The duration in days(in ISO 8601 notation eg. P5D) after which the old credentials should
         * be retired. Maximum delay duration is 14 days.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoCompletionDelayDuration")
        private String autoCompletionDelayDuration;

        /**
         * The duration in days(in ISO 8601 notation eg. P5D) after which the old credentials should
         * be retired. Maximum delay duration is 14 days.
         *
         * @param autoCompletionDelayDuration the value to set
         * @return this builder
         */
        public Builder autoCompletionDelayDuration(String autoCompletionDelayDuration) {
            this.autoCompletionDelayDuration = autoCompletionDelayDuration;
            this.__explicitlySet__.add("autoCompletionDelayDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StartCredentialRotationDetails build() {
            StartCredentialRotationDetails model =
                    new StartCredentialRotationDetails(this.autoCompletionDelayDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StartCredentialRotationDetails model) {
            if (model.wasPropertyExplicitlySet("autoCompletionDelayDuration")) {
                this.autoCompletionDelayDuration(model.getAutoCompletionDelayDuration());
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

    /**
     * The duration in days(in ISO 8601 notation eg. P5D) after which the old credentials should be
     * retired. Maximum delay duration is 14 days.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoCompletionDelayDuration")
    private final String autoCompletionDelayDuration;

    /**
     * The duration in days(in ISO 8601 notation eg. P5D) after which the old credentials should be
     * retired. Maximum delay duration is 14 days.
     *
     * @return the value
     */
    public String getAutoCompletionDelayDuration() {
        return autoCompletionDelayDuration;
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
        sb.append("StartCredentialRotationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("autoCompletionDelayDuration=")
                .append(String.valueOf(this.autoCompletionDelayDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StartCredentialRotationDetails)) {
            return false;
        }

        StartCredentialRotationDetails other = (StartCredentialRotationDetails) o;
        return java.util.Objects.equals(
                        this.autoCompletionDelayDuration, other.autoCompletionDelayDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.autoCompletionDelayDuration == null
                                ? 43
                                : this.autoCompletionDelayDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
