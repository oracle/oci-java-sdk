/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Input payload to ADD/REMOVE Private Endpoint Outbound Connection for given IntegrationInstance.
 *
 * <p>Some actions may not be applicable to specific integration types, see [Differences in Instance
 * Management](https://www.oracle.com/pls/topic/lookup?ctx=en/cloud/paas/application-integration&id=INTOO-GUID-931B5E33-4FE6-4997-93E5-8748516F46AA__GUID-176E43D5-4116-4828-8120-B929DF2A6B5E)
 * for details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ChangePrivateEndpointOutboundConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ChangePrivateEndpointOutboundConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"privateEndpointOutboundConnection"})
    public ChangePrivateEndpointOutboundConnectionDetails(
            OutboundConnection privateEndpointOutboundConnection) {
        super();
        this.privateEndpointOutboundConnection = privateEndpointOutboundConnection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointOutboundConnection")
        private OutboundConnection privateEndpointOutboundConnection;

        public Builder privateEndpointOutboundConnection(
                OutboundConnection privateEndpointOutboundConnection) {
            this.privateEndpointOutboundConnection = privateEndpointOutboundConnection;
            this.__explicitlySet__.add("privateEndpointOutboundConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangePrivateEndpointOutboundConnectionDetails build() {
            ChangePrivateEndpointOutboundConnectionDetails model =
                    new ChangePrivateEndpointOutboundConnectionDetails(
                            this.privateEndpointOutboundConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangePrivateEndpointOutboundConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("privateEndpointOutboundConnection")) {
                this.privateEndpointOutboundConnection(
                        model.getPrivateEndpointOutboundConnection());
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

    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointOutboundConnection")
    private final OutboundConnection privateEndpointOutboundConnection;

    public OutboundConnection getPrivateEndpointOutboundConnection() {
        return privateEndpointOutboundConnection;
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
        sb.append("ChangePrivateEndpointOutboundConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("privateEndpointOutboundConnection=")
                .append(String.valueOf(this.privateEndpointOutboundConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangePrivateEndpointOutboundConnectionDetails)) {
            return false;
        }

        ChangePrivateEndpointOutboundConnectionDetails other =
                (ChangePrivateEndpointOutboundConnectionDetails) o;
        return java.util.Objects.equals(
                        this.privateEndpointOutboundConnection,
                        other.privateEndpointOutboundConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.privateEndpointOutboundConnection == null
                                ? 43
                                : this.privateEndpointOutboundConnection.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
