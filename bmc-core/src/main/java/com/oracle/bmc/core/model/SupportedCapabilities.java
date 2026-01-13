/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Specifies the capabilities that the Dedicated Virtual Machine Host (DVMH) Shape or Virtual
 * Machine Instance Shape could support. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SupportedCapabilities.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SupportedCapabilities
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isMemoryEncryptionSupported"})
    public SupportedCapabilities(Boolean isMemoryEncryptionSupported) {
        super();
        this.isMemoryEncryptionSupported = isMemoryEncryptionSupported;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether the DVMH shape could support confidential VMs or the VM instance shape could be
         * confidential.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMemoryEncryptionSupported")
        private Boolean isMemoryEncryptionSupported;

        /**
         * Whether the DVMH shape could support confidential VMs or the VM instance shape could be
         * confidential.
         *
         * @param isMemoryEncryptionSupported the value to set
         * @return this builder
         */
        public Builder isMemoryEncryptionSupported(Boolean isMemoryEncryptionSupported) {
            this.isMemoryEncryptionSupported = isMemoryEncryptionSupported;
            this.__explicitlySet__.add("isMemoryEncryptionSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SupportedCapabilities build() {
            SupportedCapabilities model =
                    new SupportedCapabilities(this.isMemoryEncryptionSupported);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SupportedCapabilities model) {
            if (model.wasPropertyExplicitlySet("isMemoryEncryptionSupported")) {
                this.isMemoryEncryptionSupported(model.getIsMemoryEncryptionSupported());
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

    /**
     * Whether the DVMH shape could support confidential VMs or the VM instance shape could be
     * confidential.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMemoryEncryptionSupported")
    private final Boolean isMemoryEncryptionSupported;

    /**
     * Whether the DVMH shape could support confidential VMs or the VM instance shape could be
     * confidential.
     *
     * @return the value
     */
    public Boolean getIsMemoryEncryptionSupported() {
        return isMemoryEncryptionSupported;
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
        sb.append("SupportedCapabilities(");
        sb.append("super=").append(super.toString());
        sb.append("isMemoryEncryptionSupported=")
                .append(String.valueOf(this.isMemoryEncryptionSupported));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupportedCapabilities)) {
            return false;
        }

        SupportedCapabilities other = (SupportedCapabilities) o;
        return java.util.Objects.equals(
                        this.isMemoryEncryptionSupported, other.isMemoryEncryptionSupported)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isMemoryEncryptionSupported == null
                                ? 43
                                : this.isMemoryEncryptionSupported.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
