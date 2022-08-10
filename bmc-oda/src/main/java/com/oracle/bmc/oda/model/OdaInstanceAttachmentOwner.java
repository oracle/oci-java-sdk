/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Details about an attachment owner
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OdaInstanceAttachmentOwner.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OdaInstanceAttachmentOwner
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ownerServiceName", "ownerServiceTenancy"})
    public OdaInstanceAttachmentOwner(String ownerServiceName, String ownerServiceTenancy) {
        super();
        this.ownerServiceName = ownerServiceName;
        this.ownerServiceTenancy = ownerServiceTenancy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the owner service principal
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceName")
        private String ownerServiceName;

        /**
         * Name of the owner service principal
         * @param ownerServiceName the value to set
         * @return this builder
         **/
        public Builder ownerServiceName(String ownerServiceName) {
            this.ownerServiceName = ownerServiceName;
            this.__explicitlySet__.add("ownerServiceName");
            return this;
        }
        /**
         * Tenancy OCID of the owner service principal
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceTenancy")
        private String ownerServiceTenancy;

        /**
         * Tenancy OCID of the owner service principal
         * @param ownerServiceTenancy the value to set
         * @return this builder
         **/
        public Builder ownerServiceTenancy(String ownerServiceTenancy) {
            this.ownerServiceTenancy = ownerServiceTenancy;
            this.__explicitlySet__.add("ownerServiceTenancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OdaInstanceAttachmentOwner build() {
            OdaInstanceAttachmentOwner model =
                    new OdaInstanceAttachmentOwner(this.ownerServiceName, this.ownerServiceTenancy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OdaInstanceAttachmentOwner model) {
            if (model.wasPropertyExplicitlySet("ownerServiceName")) {
                this.ownerServiceName(model.getOwnerServiceName());
            }
            if (model.wasPropertyExplicitlySet("ownerServiceTenancy")) {
                this.ownerServiceTenancy(model.getOwnerServiceTenancy());
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
     * Name of the owner service principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceName")
    private final String ownerServiceName;

    /**
     * Name of the owner service principal
     * @return the value
     **/
    public String getOwnerServiceName() {
        return ownerServiceName;
    }

    /**
     * Tenancy OCID of the owner service principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerServiceTenancy")
    private final String ownerServiceTenancy;

    /**
     * Tenancy OCID of the owner service principal
     * @return the value
     **/
    public String getOwnerServiceTenancy() {
        return ownerServiceTenancy;
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
        sb.append("OdaInstanceAttachmentOwner(");
        sb.append("super=").append(super.toString());
        sb.append("ownerServiceName=").append(String.valueOf(this.ownerServiceName));
        sb.append(", ownerServiceTenancy=").append(String.valueOf(this.ownerServiceTenancy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OdaInstanceAttachmentOwner)) {
            return false;
        }

        OdaInstanceAttachmentOwner other = (OdaInstanceAttachmentOwner) o;
        return java.util.Objects.equals(this.ownerServiceName, other.ownerServiceName)
                && java.util.Objects.equals(this.ownerServiceTenancy, other.ownerServiceTenancy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.ownerServiceName == null ? 43 : this.ownerServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.ownerServiceTenancy == null
                                ? 43
                                : this.ownerServiceTenancy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
