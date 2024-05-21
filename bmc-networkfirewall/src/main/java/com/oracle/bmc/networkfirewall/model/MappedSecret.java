/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Mapped secret used on the firewall policy rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source",
    defaultImpl = MappedSecret.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = VaultMappedSecret.class,
        name = "OCI_VAULT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class MappedSecret extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "type", "parentResourceId"})
    protected MappedSecret(String name, InspectionType type, String parentResourceId) {
        super();
        this.name = name;
        this.type = type;
        this.parentResourceId = parentResourceId;
    }

    /**
     * Name of the secret.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the secret.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Type of the secrets mapped based on the policy.
     * <p>
     * {@code SSL_INBOUND_INSPECTION}: For Inbound inspection of SSL traffic.
     *  * {@code SSL_FORWARD_PROXY}: For forward proxy certificates for SSL inspection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final InspectionType type;

    /**
     * Type of the secrets mapped based on the policy.
     * <p>
     * {@code SSL_INBOUND_INSPECTION}: For Inbound inspection of SSL traffic.
     *  * {@code SSL_FORWARD_PROXY}: For forward proxy certificates for SSL inspection.
     *
     * @return the value
     **/
    public InspectionType getType() {
        return type;
    }

    /**
     * OCID of the Network Firewall Policy this Mapped Secret belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the Network Firewall Policy this Mapped Secret belongs to.
     * @return the value
     **/
    public String getParentResourceId() {
        return parentResourceId;
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
        sb.append("MappedSecret(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", parentResourceId=").append(String.valueOf(this.parentResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MappedSecret)) {
            return false;
        }

        MappedSecret other = (MappedSecret) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.parentResourceId, other.parentResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourceId == null ? 43 : this.parentResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
