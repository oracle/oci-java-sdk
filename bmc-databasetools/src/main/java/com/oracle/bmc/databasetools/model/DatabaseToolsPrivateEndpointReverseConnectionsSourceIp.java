/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Source IP information for reverse connection configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseToolsPrivateEndpointReverseConnectionsSourceIp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseToolsPrivateEndpointReverseConnectionsSourceIp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceIp"})
    public DatabaseToolsPrivateEndpointReverseConnectionsSourceIp(String sourceIp) {
        super();
        this.sourceIp = sourceIp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The IP address in the customer's VCN to be used as the source IP for reverse connection
         * packets traveling from the customer's VCN to the service's VCN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceIp")
        private String sourceIp;

        /**
         * The IP address in the customer's VCN to be used as the source IP for reverse connection
         * packets traveling from the customer's VCN to the service's VCN.
         *
         * @param sourceIp the value to set
         * @return this builder
         */
        public Builder sourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            this.__explicitlySet__.add("sourceIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsPrivateEndpointReverseConnectionsSourceIp build() {
            DatabaseToolsPrivateEndpointReverseConnectionsSourceIp model =
                    new DatabaseToolsPrivateEndpointReverseConnectionsSourceIp(this.sourceIp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsPrivateEndpointReverseConnectionsSourceIp model) {
            if (model.wasPropertyExplicitlySet("sourceIp")) {
                this.sourceIp(model.getSourceIp());
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
     * The IP address in the customer's VCN to be used as the source IP for reverse connection
     * packets traveling from the customer's VCN to the service's VCN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceIp")
    private final String sourceIp;

    /**
     * The IP address in the customer's VCN to be used as the source IP for reverse connection
     * packets traveling from the customer's VCN to the service's VCN.
     *
     * @return the value
     */
    public String getSourceIp() {
        return sourceIp;
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
        sb.append("DatabaseToolsPrivateEndpointReverseConnectionsSourceIp(");
        sb.append("super=").append(super.toString());
        sb.append("sourceIp=").append(String.valueOf(this.sourceIp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsPrivateEndpointReverseConnectionsSourceIp)) {
            return false;
        }

        DatabaseToolsPrivateEndpointReverseConnectionsSourceIp other =
                (DatabaseToolsPrivateEndpointReverseConnectionsSourceIp) o;
        return java.util.Objects.equals(this.sourceIp, other.sourceIp) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceIp == null ? 43 : this.sourceIp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
