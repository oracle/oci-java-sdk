/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * VMware vCenter related properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VmwareVCenterProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VmwareVCenterProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"vcenterKey", "vcenterVersion", "dataCenter"})
    public VmwareVCenterProperties(String vcenterKey, String vcenterVersion, String dataCenter) {
        super();
        this.vcenterKey = vcenterKey;
        this.vcenterVersion = vcenterVersion;
        this.dataCenter = dataCenter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** vCenter unique key. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterKey")
        private String vcenterKey;

        /**
         * vCenter unique key.
         *
         * @param vcenterKey the value to set
         * @return this builder
         */
        public Builder vcenterKey(String vcenterKey) {
            this.vcenterKey = vcenterKey;
            this.__explicitlySet__.add("vcenterKey");
            return this;
        }
        /** Dot-separated version string. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterVersion")
        private String vcenterVersion;

        /**
         * Dot-separated version string.
         *
         * @param vcenterVersion the value to set
         * @return this builder
         */
        public Builder vcenterVersion(String vcenterVersion) {
            this.vcenterVersion = vcenterVersion;
            this.__explicitlySet__.add("vcenterVersion");
            return this;
        }
        /** Data center name. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
        private String dataCenter;

        /**
         * Data center name.
         *
         * @param dataCenter the value to set
         * @return this builder
         */
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            this.__explicitlySet__.add("dataCenter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VmwareVCenterProperties build() {
            VmwareVCenterProperties model =
                    new VmwareVCenterProperties(
                            this.vcenterKey, this.vcenterVersion, this.dataCenter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VmwareVCenterProperties model) {
            if (model.wasPropertyExplicitlySet("vcenterKey")) {
                this.vcenterKey(model.getVcenterKey());
            }
            if (model.wasPropertyExplicitlySet("vcenterVersion")) {
                this.vcenterVersion(model.getVcenterVersion());
            }
            if (model.wasPropertyExplicitlySet("dataCenter")) {
                this.dataCenter(model.getDataCenter());
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

    /** vCenter unique key. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterKey")
    private final String vcenterKey;

    /**
     * vCenter unique key.
     *
     * @return the value
     */
    public String getVcenterKey() {
        return vcenterKey;
    }

    /** Dot-separated version string. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterVersion")
    private final String vcenterVersion;

    /**
     * Dot-separated version string.
     *
     * @return the value
     */
    public String getVcenterVersion() {
        return vcenterVersion;
    }

    /** Data center name. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
    private final String dataCenter;

    /**
     * Data center name.
     *
     * @return the value
     */
    public String getDataCenter() {
        return dataCenter;
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
        sb.append("VmwareVCenterProperties(");
        sb.append("super=").append(super.toString());
        sb.append("vcenterKey=").append(String.valueOf(this.vcenterKey));
        sb.append(", vcenterVersion=").append(String.valueOf(this.vcenterVersion));
        sb.append(", dataCenter=").append(String.valueOf(this.dataCenter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VmwareVCenterProperties)) {
            return false;
        }

        VmwareVCenterProperties other = (VmwareVCenterProperties) o;
        return java.util.Objects.equals(this.vcenterKey, other.vcenterKey)
                && java.util.Objects.equals(this.vcenterVersion, other.vcenterVersion)
                && java.util.Objects.equals(this.dataCenter, other.dataCenter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vcenterKey == null ? 43 : this.vcenterKey.hashCode());
        result =
                (result * PRIME)
                        + (this.vcenterVersion == null ? 43 : this.vcenterVersion.hashCode());
        result = (result * PRIME) + (this.dataCenter == null ? 43 : this.dataCenter.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
