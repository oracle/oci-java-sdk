/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The base definition for a property set <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "key",
        defaultImpl = PropertySet.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PropertySetApex.class,
            name = "APEX"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PropertySetApexFaIntegration.class,
            name = "APEX_FA_INTEGRATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PropertySetApexDocumentGenerator.class,
            name = "APEX_DOCUMENT_GENERATOR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PropertySetOracleDatabaseExternalAuthentication.class,
            name = "ORACLE_DATABASE_EXTERNAL_AUTHENTICATION")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class PropertySet extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isMutable"})
    protected PropertySet(Boolean isMutable) {
        super();
        this.isMutable = isMutable;
    }

    /** Indicates whether the property set is mutable or not */
    @com.fasterxml.jackson.annotation.JsonProperty("isMutable")
    private final Boolean isMutable;

    /**
     * Indicates whether the property set is mutable or not
     *
     * @return the value
     */
    public Boolean getIsMutable() {
        return isMutable;
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
        sb.append("PropertySet(");
        sb.append("super=").append(super.toString());
        sb.append("isMutable=").append(String.valueOf(this.isMutable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PropertySet)) {
            return false;
        }

        PropertySet other = (PropertySet) o;
        return java.util.Objects.equals(this.isMutable, other.isMutable) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isMutable == null ? 43 : this.isMutable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
