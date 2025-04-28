/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Pluggable Database Refreshable Clone Configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PluggableDatabaseRefreshableCloneConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PluggableDatabaseRefreshableCloneConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isRefreshableClone"})
    public PluggableDatabaseRefreshableCloneConfig(Boolean isRefreshableClone) {
        super();
        this.isRefreshableClone = isRefreshableClone;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether the Pluggable Database is a refreshable clone. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
        private Boolean isRefreshableClone;

        /**
         * Indicates whether the Pluggable Database is a refreshable clone.
         *
         * @param isRefreshableClone the value to set
         * @return this builder
         */
        public Builder isRefreshableClone(Boolean isRefreshableClone) {
            this.isRefreshableClone = isRefreshableClone;
            this.__explicitlySet__.add("isRefreshableClone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PluggableDatabaseRefreshableCloneConfig build() {
            PluggableDatabaseRefreshableCloneConfig model =
                    new PluggableDatabaseRefreshableCloneConfig(this.isRefreshableClone);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PluggableDatabaseRefreshableCloneConfig model) {
            if (model.wasPropertyExplicitlySet("isRefreshableClone")) {
                this.isRefreshableClone(model.getIsRefreshableClone());
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

    /** Indicates whether the Pluggable Database is a refreshable clone. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshableClone")
    private final Boolean isRefreshableClone;

    /**
     * Indicates whether the Pluggable Database is a refreshable clone.
     *
     * @return the value
     */
    public Boolean getIsRefreshableClone() {
        return isRefreshableClone;
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
        sb.append("PluggableDatabaseRefreshableCloneConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isRefreshableClone=").append(String.valueOf(this.isRefreshableClone));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PluggableDatabaseRefreshableCloneConfig)) {
            return false;
        }

        PluggableDatabaseRefreshableCloneConfig other = (PluggableDatabaseRefreshableCloneConfig) o;
        return java.util.Objects.equals(this.isRefreshableClone, other.isRefreshableClone)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRefreshableClone == null
                                ? 43
                                : this.isRefreshableClone.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
