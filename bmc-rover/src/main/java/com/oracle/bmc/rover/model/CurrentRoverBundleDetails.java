/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Information required to list all available valid rover bundle versions that can be upgraded based
 * on current bundle version. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CurrentRoverBundleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CurrentRoverBundleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"currentRoverBundleVersion"})
    public CurrentRoverBundleDetails(String currentRoverBundleVersion) {
        super();
        this.currentRoverBundleVersion = currentRoverBundleVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The version of current rover bundle on customer's roverNode or roverCluster device. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentRoverBundleVersion")
        private String currentRoverBundleVersion;

        /**
         * The version of current rover bundle on customer's roverNode or roverCluster device.
         *
         * @param currentRoverBundleVersion the value to set
         * @return this builder
         */
        public Builder currentRoverBundleVersion(String currentRoverBundleVersion) {
            this.currentRoverBundleVersion = currentRoverBundleVersion;
            this.__explicitlySet__.add("currentRoverBundleVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CurrentRoverBundleDetails build() {
            CurrentRoverBundleDetails model =
                    new CurrentRoverBundleDetails(this.currentRoverBundleVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CurrentRoverBundleDetails model) {
            if (model.wasPropertyExplicitlySet("currentRoverBundleVersion")) {
                this.currentRoverBundleVersion(model.getCurrentRoverBundleVersion());
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

    /** The version of current rover bundle on customer's roverNode or roverCluster device. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentRoverBundleVersion")
    private final String currentRoverBundleVersion;

    /**
     * The version of current rover bundle on customer's roverNode or roverCluster device.
     *
     * @return the value
     */
    public String getCurrentRoverBundleVersion() {
        return currentRoverBundleVersion;
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
        sb.append("CurrentRoverBundleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("currentRoverBundleVersion=")
                .append(String.valueOf(this.currentRoverBundleVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CurrentRoverBundleDetails)) {
            return false;
        }

        CurrentRoverBundleDetails other = (CurrentRoverBundleDetails) o;
        return java.util.Objects.equals(
                        this.currentRoverBundleVersion, other.currentRoverBundleVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.currentRoverBundleVersion == null
                                ? 43
                                : this.currentRoverBundleVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
