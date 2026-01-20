/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details for installing a software update to a cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstallSoftwareUpdatesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstallSoftwareUpdatesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"softwareUpdateKeys"})
    public InstallSoftwareUpdatesDetails(java.util.List<String> softwareUpdateKeys) {
        super();
        this.softwareUpdateKeys = softwareUpdateKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of unique identifiers of target software updates. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateKeys")
        private java.util.List<String> softwareUpdateKeys;

        /**
         * A list of unique identifiers of target software updates.
         *
         * @param softwareUpdateKeys the value to set
         * @return this builder
         */
        public Builder softwareUpdateKeys(java.util.List<String> softwareUpdateKeys) {
            this.softwareUpdateKeys = softwareUpdateKeys;
            this.__explicitlySet__.add("softwareUpdateKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstallSoftwareUpdatesDetails build() {
            InstallSoftwareUpdatesDetails model =
                    new InstallSoftwareUpdatesDetails(this.softwareUpdateKeys);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstallSoftwareUpdatesDetails model) {
            if (model.wasPropertyExplicitlySet("softwareUpdateKeys")) {
                this.softwareUpdateKeys(model.getSoftwareUpdateKeys());
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

    /** A list of unique identifiers of target software updates. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareUpdateKeys")
    private final java.util.List<String> softwareUpdateKeys;

    /**
     * A list of unique identifiers of target software updates.
     *
     * @return the value
     */
    public java.util.List<String> getSoftwareUpdateKeys() {
        return softwareUpdateKeys;
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
        sb.append("InstallSoftwareUpdatesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("softwareUpdateKeys=").append(String.valueOf(this.softwareUpdateKeys));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstallSoftwareUpdatesDetails)) {
            return false;
        }

        InstallSoftwareUpdatesDetails other = (InstallSoftwareUpdatesDetails) o;
        return java.util.Objects.equals(this.softwareUpdateKeys, other.softwareUpdateKeys)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareUpdateKeys == null
                                ? 43
                                : this.softwareUpdateKeys.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
