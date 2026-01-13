/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details of provisioned endpoint. <br>
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
        builder = EndpointAdditional.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EndpointAdditional
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"endpointName", "endpointId"})
    public EndpointAdditional(String endpointName, String endpointId) {
        super();
        this.endpointName = endpointName;
        this.endpointId = endpointId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identifier for each endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointName")
        private String endpointName;

        /**
         * Identifier for each endpoint.
         *
         * @param endpointName the value to set
         * @return this builder
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            this.__explicitlySet__.add("endpointName");
            return this;
        }
        /** OCID of the endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
        private String endpointId;

        /**
         * OCID of the endpoint.
         *
         * @param endpointId the value to set
         * @return this builder
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
            this.__explicitlySet__.add("endpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EndpointAdditional build() {
            EndpointAdditional model = new EndpointAdditional(this.endpointName, this.endpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EndpointAdditional model) {
            if (model.wasPropertyExplicitlySet("endpointName")) {
                this.endpointName(model.getEndpointName());
            }
            if (model.wasPropertyExplicitlySet("endpointId")) {
                this.endpointId(model.getEndpointId());
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

    /** Identifier for each endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointName")
    private final String endpointName;

    /**
     * Identifier for each endpoint.
     *
     * @return the value
     */
    public String getEndpointName() {
        return endpointName;
    }

    /** OCID of the endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointId")
    private final String endpointId;

    /**
     * OCID of the endpoint.
     *
     * @return the value
     */
    public String getEndpointId() {
        return endpointId;
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
        sb.append("EndpointAdditional(");
        sb.append("super=").append(super.toString());
        sb.append("endpointName=").append(String.valueOf(this.endpointName));
        sb.append(", endpointId=").append(String.valueOf(this.endpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EndpointAdditional)) {
            return false;
        }

        EndpointAdditional other = (EndpointAdditional) o;
        return java.util.Objects.equals(this.endpointName, other.endpointName)
                && java.util.Objects.equals(this.endpointId, other.endpointId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endpointName == null ? 43 : this.endpointName.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
