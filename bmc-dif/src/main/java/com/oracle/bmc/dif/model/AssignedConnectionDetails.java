/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details to about assigned connections. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssignedConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssignedConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"connectionName", "connectionId", "requestedBy"})
    public AssignedConnectionDetails(
            String connectionName, String connectionId, String requestedBy) {
        super();
        this.connectionName = connectionName;
        this.connectionId = connectionId;
        this.requestedBy = requestedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionName")
        private String connectionName;

        /**
         * Name of the connection.
         *
         * @param connectionName the value to set
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            this.__explicitlySet__.add("connectionName");
            return this;
        }
        /** OCID of the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionId")
        private String connectionId;

        /**
         * OCID of the connection.
         *
         * @param connectionId the value to set
         * @return this builder
         */
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            this.__explicitlySet__.add("connectionId");
            return this;
        }
        /** Specifies who has made this connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("requestedBy")
        private String requestedBy;

        /**
         * Specifies who has made this connection.
         *
         * @param requestedBy the value to set
         * @return this builder
         */
        public Builder requestedBy(String requestedBy) {
            this.requestedBy = requestedBy;
            this.__explicitlySet__.add("requestedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssignedConnectionDetails build() {
            AssignedConnectionDetails model =
                    new AssignedConnectionDetails(
                            this.connectionName, this.connectionId, this.requestedBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignedConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("connectionName")) {
                this.connectionName(model.getConnectionName());
            }
            if (model.wasPropertyExplicitlySet("connectionId")) {
                this.connectionId(model.getConnectionId());
            }
            if (model.wasPropertyExplicitlySet("requestedBy")) {
                this.requestedBy(model.getRequestedBy());
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

    /** Name of the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionName")
    private final String connectionName;

    /**
     * Name of the connection.
     *
     * @return the value
     */
    public String getConnectionName() {
        return connectionName;
    }

    /** OCID of the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionId")
    private final String connectionId;

    /**
     * OCID of the connection.
     *
     * @return the value
     */
    public String getConnectionId() {
        return connectionId;
    }

    /** Specifies who has made this connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("requestedBy")
    private final String requestedBy;

    /**
     * Specifies who has made this connection.
     *
     * @return the value
     */
    public String getRequestedBy() {
        return requestedBy;
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
        sb.append("AssignedConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("connectionName=").append(String.valueOf(this.connectionName));
        sb.append(", connectionId=").append(String.valueOf(this.connectionId));
        sb.append(", requestedBy=").append(String.valueOf(this.requestedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignedConnectionDetails)) {
            return false;
        }

        AssignedConnectionDetails other = (AssignedConnectionDetails) o;
        return java.util.Objects.equals(this.connectionName, other.connectionName)
                && java.util.Objects.equals(this.connectionId, other.connectionId)
                && java.util.Objects.equals(this.requestedBy, other.requestedBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionName == null ? 43 : this.connectionName.hashCode());
        result = (result * PRIME) + (this.connectionId == null ? 43 : this.connectionId.hashCode());
        result = (result * PRIME) + (this.requestedBy == null ? 43 : this.requestedBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
