/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Updatable settings for the Autonomous Linux service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdatableAutonomousSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatableAutonomousSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isDataCollectionAuthorized"})
    public UpdatableAutonomousSettings(Boolean isDataCollectionAuthorized) {
        super();
        this.isDataCollectionAuthorized = isDataCollectionAuthorized;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether Autonomous Linux will collect crash files. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDataCollectionAuthorized")
        private Boolean isDataCollectionAuthorized;

        /**
         * Indicates whether Autonomous Linux will collect crash files.
         *
         * @param isDataCollectionAuthorized the value to set
         * @return this builder
         */
        public Builder isDataCollectionAuthorized(Boolean isDataCollectionAuthorized) {
            this.isDataCollectionAuthorized = isDataCollectionAuthorized;
            this.__explicitlySet__.add("isDataCollectionAuthorized");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatableAutonomousSettings build() {
            UpdatableAutonomousSettings model =
                    new UpdatableAutonomousSettings(this.isDataCollectionAuthorized);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatableAutonomousSettings model) {
            if (model.wasPropertyExplicitlySet("isDataCollectionAuthorized")) {
                this.isDataCollectionAuthorized(model.getIsDataCollectionAuthorized());
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

    /** Indicates whether Autonomous Linux will collect crash files. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDataCollectionAuthorized")
    private final Boolean isDataCollectionAuthorized;

    /**
     * Indicates whether Autonomous Linux will collect crash files.
     *
     * @return the value
     */
    public Boolean getIsDataCollectionAuthorized() {
        return isDataCollectionAuthorized;
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
        sb.append("UpdatableAutonomousSettings(");
        sb.append("super=").append(super.toString());
        sb.append("isDataCollectionAuthorized=")
                .append(String.valueOf(this.isDataCollectionAuthorized));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatableAutonomousSettings)) {
            return false;
        }

        UpdatableAutonomousSettings other = (UpdatableAutonomousSettings) o;
        return java.util.Objects.equals(
                        this.isDataCollectionAuthorized, other.isDataCollectionAuthorized)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isDataCollectionAuthorized == null
                                ? 43
                                : this.isDataCollectionAuthorized.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
