/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Detailed configurations for defining the behavior when installing ODH patches. If not provided,
 * nodes will be patched with down time. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "patchingConfigStrategy",
        defaultImpl = OdhPatchingConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DowntimeBasedOdhPatchingConfig.class,
            name = "DOWNTIME_BASED"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DomainBasedOdhPatchingConfig.class,
            name = "DOMAIN_BASED"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = BatchingBasedOdhPatchingConfig.class,
            name = "BATCHING_BASED")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class OdhPatchingConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected OdhPatchingConfig() {
        super();
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
        sb.append("OdhPatchingConfig(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OdhPatchingConfig)) {
            return false;
        }

        OdhPatchingConfig other = (OdhPatchingConfig) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of strategy used for detailed patching configuration */
    public enum PatchingConfigStrategy implements com.oracle.bmc.http.internal.BmcEnum {
        DowntimeBased("DOWNTIME_BASED"),
        BatchingBased("BATCHING_BASED"),
        DomainBased("DOMAIN_BASED"),
        ;

        private final String value;
        private static java.util.Map<String, PatchingConfigStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchingConfigStrategy v : PatchingConfigStrategy.values()) {
                map.put(v.getValue(), v);
            }
        }

        PatchingConfigStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchingConfigStrategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PatchingConfigStrategy: " + key);
        }
    };
}
