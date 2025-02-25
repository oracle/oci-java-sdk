/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Details to enable an eMysql Associated Service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EnableExternalMysqlAssociatedServiceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EnableExternalMysqlAssociatedServiceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceResourceId", "connectorId", "serviceName"})
    public EnableExternalMysqlAssociatedServiceDetails(
            String serviceResourceId,
            String connectorId,
            ExternalMysqlAssociatedServiceName serviceName) {
        super();
        this.serviceResourceId = serviceResourceId;
        this.connectorId = connectorId;
        this.serviceName = serviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the Service Resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceResourceId")
        private String serviceResourceId;

        /**
         * OCID of the Service Resource.
         * @param serviceResourceId the value to set
         * @return this builder
         **/
        public Builder serviceResourceId(String serviceResourceId) {
            this.serviceResourceId = serviceResourceId;
            this.__explicitlySet__.add("serviceResourceId");
            return this;
        }
        /**
         * OCID of the External MySQL Database connector.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        /**
         * OCID of the External MySQL Database connector.
         * @param connectorId the value to set
         * @return this builder
         **/
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }
        /**
         * Name of the Associated Service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private ExternalMysqlAssociatedServiceName serviceName;

        /**
         * Name of the Associated Service.
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(ExternalMysqlAssociatedServiceName serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EnableExternalMysqlAssociatedServiceDetails build() {
            EnableExternalMysqlAssociatedServiceDetails model =
                    new EnableExternalMysqlAssociatedServiceDetails(
                            this.serviceResourceId, this.connectorId, this.serviceName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EnableExternalMysqlAssociatedServiceDetails model) {
            if (model.wasPropertyExplicitlySet("serviceResourceId")) {
                this.serviceResourceId(model.getServiceResourceId());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * OCID of the Service Resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceResourceId")
    private final String serviceResourceId;

    /**
     * OCID of the Service Resource.
     * @return the value
     **/
    public String getServiceResourceId() {
        return serviceResourceId;
    }

    /**
     * OCID of the External MySQL Database connector.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * OCID of the External MySQL Database connector.
     * @return the value
     **/
    public String getConnectorId() {
        return connectorId;
    }

    /**
     * Name of the Associated Service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final ExternalMysqlAssociatedServiceName serviceName;

    /**
     * Name of the Associated Service.
     * @return the value
     **/
    public ExternalMysqlAssociatedServiceName getServiceName() {
        return serviceName;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EnableExternalMysqlAssociatedServiceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("serviceResourceId=").append(String.valueOf(this.serviceResourceId));
        sb.append(", connectorId=").append(String.valueOf(this.connectorId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EnableExternalMysqlAssociatedServiceDetails)) {
            return false;
        }

        EnableExternalMysqlAssociatedServiceDetails other =
                (EnableExternalMysqlAssociatedServiceDetails) o;
        return java.util.Objects.equals(this.serviceResourceId, other.serviceResourceId)
                && java.util.Objects.equals(this.connectorId, other.connectorId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serviceResourceId == null ? 43 : this.serviceResourceId.hashCode());
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
