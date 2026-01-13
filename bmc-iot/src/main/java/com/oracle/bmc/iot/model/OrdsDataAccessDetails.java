/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * This contains configuration for ORDS data access. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OrdsDataAccessDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OrdsDataAccessDetails extends ConfigureIotDomainDataAccessDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Host name of identity domain that is used for authenticating connect to data host via
         * ORDS.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbAllowedIdentityDomainHost")
        private String dbAllowedIdentityDomainHost;

        /**
         * Host name of identity domain that is used for authenticating connect to data host via
         * ORDS.
         *
         * @param dbAllowedIdentityDomainHost the value to set
         * @return this builder
         */
        public Builder dbAllowedIdentityDomainHost(String dbAllowedIdentityDomainHost) {
            this.dbAllowedIdentityDomainHost = dbAllowedIdentityDomainHost;
            this.__explicitlySet__.add("dbAllowedIdentityDomainHost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OrdsDataAccessDetails build() {
            OrdsDataAccessDetails model =
                    new OrdsDataAccessDetails(this.dbAllowedIdentityDomainHost);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OrdsDataAccessDetails model) {
            if (model.wasPropertyExplicitlySet("dbAllowedIdentityDomainHost")) {
                this.dbAllowedIdentityDomainHost(model.getDbAllowedIdentityDomainHost());
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

    @Deprecated
    public OrdsDataAccessDetails(String dbAllowedIdentityDomainHost) {
        super();
        this.dbAllowedIdentityDomainHost = dbAllowedIdentityDomainHost;
    }

    /**
     * Host name of identity domain that is used for authenticating connect to data host via ORDS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbAllowedIdentityDomainHost")
    private final String dbAllowedIdentityDomainHost;

    /**
     * Host name of identity domain that is used for authenticating connect to data host via ORDS.
     *
     * @return the value
     */
    public String getDbAllowedIdentityDomainHost() {
        return dbAllowedIdentityDomainHost;
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
        sb.append("OrdsDataAccessDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbAllowedIdentityDomainHost=")
                .append(String.valueOf(this.dbAllowedIdentityDomainHost));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OrdsDataAccessDetails)) {
            return false;
        }

        OrdsDataAccessDetails other = (OrdsDataAccessDetails) o;
        return java.util.Objects.equals(
                        this.dbAllowedIdentityDomainHost, other.dbAllowedIdentityDomainHost)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dbAllowedIdentityDomainHost == null
                                ? 43
                                : this.dbAllowedIdentityDomainHost.hashCode());
        return result;
    }
}
