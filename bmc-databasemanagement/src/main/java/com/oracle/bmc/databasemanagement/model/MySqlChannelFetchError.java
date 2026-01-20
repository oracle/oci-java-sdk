/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * MySQL server replication channel name and error from its fetch operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlChannelFetchError.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlChannelFetchError
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"channelName", "fetchError"})
    public MySqlChannelFetchError(String channelName, MySqlFetchError fetchError) {
        super();
        this.channelName = channelName;
        this.fetchError = fetchError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the replication channel. */
        @com.fasterxml.jackson.annotation.JsonProperty("channelName")
        private String channelName;

        /**
         * The name of the replication channel.
         *
         * @param channelName the value to set
         * @return this builder
         */
        public Builder channelName(String channelName) {
            this.channelName = channelName;
            this.__explicitlySet__.add("channelName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fetchError")
        private MySqlFetchError fetchError;

        public Builder fetchError(MySqlFetchError fetchError) {
            this.fetchError = fetchError;
            this.__explicitlySet__.add("fetchError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlChannelFetchError build() {
            MySqlChannelFetchError model =
                    new MySqlChannelFetchError(this.channelName, this.fetchError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlChannelFetchError model) {
            if (model.wasPropertyExplicitlySet("channelName")) {
                this.channelName(model.getChannelName());
            }
            if (model.wasPropertyExplicitlySet("fetchError")) {
                this.fetchError(model.getFetchError());
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

    /** The name of the replication channel. */
    @com.fasterxml.jackson.annotation.JsonProperty("channelName")
    private final String channelName;

    /**
     * The name of the replication channel.
     *
     * @return the value
     */
    public String getChannelName() {
        return channelName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fetchError")
    private final MySqlFetchError fetchError;

    public MySqlFetchError getFetchError() {
        return fetchError;
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
        sb.append("MySqlChannelFetchError(");
        sb.append("super=").append(super.toString());
        sb.append("channelName=").append(String.valueOf(this.channelName));
        sb.append(", fetchError=").append(String.valueOf(this.fetchError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlChannelFetchError)) {
            return false;
        }

        MySqlChannelFetchError other = (MySqlChannelFetchError) o;
        return java.util.Objects.equals(this.channelName, other.channelName)
                && java.util.Objects.equals(this.fetchError, other.fetchError)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.channelName == null ? 43 : this.channelName.hashCode());
        result = (result * PRIME) + (this.fetchError == null ? 43 : this.fetchError.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
