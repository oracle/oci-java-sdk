/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * CA Bundle from OCI Certificates service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220615")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OciCaBundle.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciCaBundle extends CaBundle {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the CA Bundle resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("caBundleId")
        private String caBundleId;

        /**
         * The OCID of the CA Bundle resource.
         * @param caBundleId the value to set
         * @return this builder
         **/
        public Builder caBundleId(String caBundleId) {
            this.caBundleId = caBundleId;
            this.__explicitlySet__.add("caBundleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciCaBundle build() {
            OciCaBundle model = new OciCaBundle(this.caBundleId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciCaBundle model) {
            if (model.wasPropertyExplicitlySet("caBundleId")) {
                this.caBundleId(model.getCaBundleId());
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

    @Deprecated
    public OciCaBundle(String caBundleId) {
        super();
        this.caBundleId = caBundleId;
    }

    /**
     * The OCID of the CA Bundle resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caBundleId")
    private final String caBundleId;

    /**
     * The OCID of the CA Bundle resource.
     * @return the value
     **/
    public String getCaBundleId() {
        return caBundleId;
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
        sb.append("OciCaBundle(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", caBundleId=").append(String.valueOf(this.caBundleId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciCaBundle)) {
            return false;
        }

        OciCaBundle other = (OciCaBundle) o;
        return java.util.Objects.equals(this.caBundleId, other.caBundleId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.caBundleId == null ? 43 : this.caBundleId.hashCode());
        return result;
    }
}
