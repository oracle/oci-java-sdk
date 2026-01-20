/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * DNSSEC configuration data.
 *
 * <p>A zone may have a maximum of 10 {@code DnssecKeyVersions}, regardless of signing key type.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DnssecConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DnssecConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"kskDnssecKeyVersions", "zskDnssecKeyVersions"})
    public DnssecConfig(
            java.util.List<KskDnssecKeyVersion> kskDnssecKeyVersions,
            java.util.List<ZskDnssecKeyVersion> zskDnssecKeyVersions) {
        super();
        this.kskDnssecKeyVersions = kskDnssecKeyVersions;
        this.zskDnssecKeyVersions = zskDnssecKeyVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A read-only array of key signing key (KSK) versions. */
        @com.fasterxml.jackson.annotation.JsonProperty("kskDnssecKeyVersions")
        private java.util.List<KskDnssecKeyVersion> kskDnssecKeyVersions;

        /**
         * A read-only array of key signing key (KSK) versions.
         *
         * @param kskDnssecKeyVersions the value to set
         * @return this builder
         */
        public Builder kskDnssecKeyVersions(
                java.util.List<KskDnssecKeyVersion> kskDnssecKeyVersions) {
            this.kskDnssecKeyVersions = kskDnssecKeyVersions;
            this.__explicitlySet__.add("kskDnssecKeyVersions");
            return this;
        }
        /** A read-only array of zone signing key (ZSK) versions. */
        @com.fasterxml.jackson.annotation.JsonProperty("zskDnssecKeyVersions")
        private java.util.List<ZskDnssecKeyVersion> zskDnssecKeyVersions;

        /**
         * A read-only array of zone signing key (ZSK) versions.
         *
         * @param zskDnssecKeyVersions the value to set
         * @return this builder
         */
        public Builder zskDnssecKeyVersions(
                java.util.List<ZskDnssecKeyVersion> zskDnssecKeyVersions) {
            this.zskDnssecKeyVersions = zskDnssecKeyVersions;
            this.__explicitlySet__.add("zskDnssecKeyVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DnssecConfig build() {
            DnssecConfig model =
                    new DnssecConfig(this.kskDnssecKeyVersions, this.zskDnssecKeyVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DnssecConfig model) {
            if (model.wasPropertyExplicitlySet("kskDnssecKeyVersions")) {
                this.kskDnssecKeyVersions(model.getKskDnssecKeyVersions());
            }
            if (model.wasPropertyExplicitlySet("zskDnssecKeyVersions")) {
                this.zskDnssecKeyVersions(model.getZskDnssecKeyVersions());
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

    /** A read-only array of key signing key (KSK) versions. */
    @com.fasterxml.jackson.annotation.JsonProperty("kskDnssecKeyVersions")
    private final java.util.List<KskDnssecKeyVersion> kskDnssecKeyVersions;

    /**
     * A read-only array of key signing key (KSK) versions.
     *
     * @return the value
     */
    public java.util.List<KskDnssecKeyVersion> getKskDnssecKeyVersions() {
        return kskDnssecKeyVersions;
    }

    /** A read-only array of zone signing key (ZSK) versions. */
    @com.fasterxml.jackson.annotation.JsonProperty("zskDnssecKeyVersions")
    private final java.util.List<ZskDnssecKeyVersion> zskDnssecKeyVersions;

    /**
     * A read-only array of zone signing key (ZSK) versions.
     *
     * @return the value
     */
    public java.util.List<ZskDnssecKeyVersion> getZskDnssecKeyVersions() {
        return zskDnssecKeyVersions;
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
        sb.append("DnssecConfig(");
        sb.append("super=").append(super.toString());
        sb.append("kskDnssecKeyVersions=").append(String.valueOf(this.kskDnssecKeyVersions));
        sb.append(", zskDnssecKeyVersions=").append(String.valueOf(this.zskDnssecKeyVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DnssecConfig)) {
            return false;
        }

        DnssecConfig other = (DnssecConfig) o;
        return java.util.Objects.equals(this.kskDnssecKeyVersions, other.kskDnssecKeyVersions)
                && java.util.Objects.equals(this.zskDnssecKeyVersions, other.zskDnssecKeyVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.kskDnssecKeyVersions == null
                                ? 43
                                : this.kskDnssecKeyVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.zskDnssecKeyVersions == null
                                ? 43
                                : this.zskDnssecKeyVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
