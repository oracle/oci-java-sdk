/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Security options for OCI FSS File System. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "auth",
        defaultImpl = OciFssSecurity.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OciFssSysSecurity.class,
            name = "SYS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class OciFssSecurity extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEncryptedInTransit"})
    protected OciFssSecurity(Boolean isEncryptedInTransit) {
        super();
        this.isEncryptedInTransit = isEncryptedInTransit;
    }

    /**
     * Determines whether in-transit encryption needs to be enables. Check
     * https://docs.oracle.com/en-us/iaas/Content/File/Tasks/intransitencryption.htm#Using_Intransit_Encryption
     * for more details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEncryptedInTransit")
    private final Boolean isEncryptedInTransit;

    /**
     * Determines whether in-transit encryption needs to be enables. Check
     * https://docs.oracle.com/en-us/iaas/Content/File/Tasks/intransitencryption.htm#Using_Intransit_Encryption
     * for more details.
     *
     * @return the value
     */
    public Boolean getIsEncryptedInTransit() {
        return isEncryptedInTransit;
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
        sb.append("OciFssSecurity(");
        sb.append("super=").append(super.toString());
        sb.append("isEncryptedInTransit=").append(String.valueOf(this.isEncryptedInTransit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciFssSecurity)) {
            return false;
        }

        OciFssSecurity other = (OciFssSecurity) o;
        return java.util.Objects.equals(this.isEncryptedInTransit, other.isEncryptedInTransit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isEncryptedInTransit == null
                                ? 43
                                : this.isEncryptedInTransit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** NFS authentication type to be used. Currently, only auth type SYS is supported. */
    public enum Auth implements com.oracle.bmc.http.internal.BmcEnum {
        Sys("SYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Auth.class);

        private final String value;
        private static java.util.Map<String, Auth> map;

        static {
            map = new java.util.HashMap<>();
            for (Auth v : Auth.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Auth(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Auth create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Auth', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
