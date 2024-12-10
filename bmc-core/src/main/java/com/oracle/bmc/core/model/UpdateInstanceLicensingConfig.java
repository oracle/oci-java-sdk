/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The target license config to be updated on the instance.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = UpdateInstanceLicensingConfig.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = UpdateInstanceWindowsLicensingConfig.class,
        name = "WINDOWS"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateInstanceLicensingConfig
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"licenseType"})
    protected UpdateInstanceLicensingConfig(LicenseType licenseType) {
        super();
        this.licenseType = licenseType;
    }

    /**
     * License Type for the OS license.
     * * {@code OCI_PROVIDED} - OCI provided license (e.g. metered $/OCPU-hour).
     * * {@code BRING_YOUR_OWN_LICENSE} - Bring your own license.
     *
     **/
    public enum LicenseType {
        OciProvided("OCI_PROVIDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),
        ;

        private final String value;
        private static java.util.Map<String, LicenseType> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseType v : LicenseType.values()) {
                map.put(v.getValue(), v);
            }
        }

        LicenseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LicenseType: " + key);
        }
    };
    /**
     * License Type for the OS license.
     * * {@code OCI_PROVIDED} - OCI provided license (e.g. metered $/OCPU-hour).
     * * {@code BRING_YOUR_OWN_LICENSE} - Bring your own license.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final LicenseType licenseType;

    /**
     * License Type for the OS license.
     * * {@code OCI_PROVIDED} - OCI provided license (e.g. metered $/OCPU-hour).
     * * {@code BRING_YOUR_OWN_LICENSE} - Bring your own license.
     *
     * @return the value
     **/
    public LicenseType getLicenseType() {
        return licenseType;
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
        sb.append("UpdateInstanceLicensingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("licenseType=").append(String.valueOf(this.licenseType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInstanceLicensingConfig)) {
            return false;
        }

        UpdateInstanceLicensingConfig other = (UpdateInstanceLicensingConfig) o;
        return java.util.Objects.equals(this.licenseType, other.licenseType) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Operating system type of the configuration.
     **/
    public enum Type {
        Windows("WINDOWS"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
}
