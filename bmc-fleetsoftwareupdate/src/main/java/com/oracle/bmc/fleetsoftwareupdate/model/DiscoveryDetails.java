/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Discovery filter details for search.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = DiscoveryDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = GiDiscoveryDetails.class,
        name = "GI"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DbDiscoveryDetails.class,
        name = "DB"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DiscoveryDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceType"})
    protected DiscoveryDetails(DiscoveryServiceTypes serviceType) {
        super();
        this.serviceType = serviceType;
    }

    /**
     * Exadata service type for the target resource members.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceType")
    private final DiscoveryServiceTypes serviceType;

    /**
     * Exadata service type for the target resource members.
     *
     * @return the value
     **/
    public DiscoveryServiceTypes getServiceType() {
        return serviceType;
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
        sb.append("DiscoveryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("serviceType=").append(String.valueOf(this.serviceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoveryDetails)) {
            return false;
        }

        DiscoveryDetails other = (DiscoveryDetails) o;
        return java.util.Objects.equals(this.serviceType, other.serviceType) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.serviceType == null ? 43 : this.serviceType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
